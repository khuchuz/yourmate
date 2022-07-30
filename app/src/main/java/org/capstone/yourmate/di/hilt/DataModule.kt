package org.capstone.yourmate.di.hilt

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.messaging.FirebaseMessaging
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.capstone.yourmate.data.api.ChatApi
import org.capstone.yourmate.data.api.YourmateApi
import org.capstone.yourmate.data.repository.*
import org.capstone.yourmate.di.qualifier.FirebaseCloudMessagingRetrofit
import org.capstone.yourmate.domain.repository.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    abstract fun bindAuthRepository(authRepository: AuthRepository): IAuthRepository

    @Binds
    abstract fun bindChatRepository(chatRepository: ChatRepository): IChatRepository

    @Binds
    abstract fun bindContactRepository(contactRepository: ContactRepository): IContactRepository

    @Binds
    abstract fun bindPlaceRepository(placeRepository: PlaceRepository): IPlaceRepository

    @Binds
    abstract fun bindArticleRepository(articleRepository: ArticleRepository): IArticleRepository

    @Binds
    abstract fun bindUserRepository(userRepository: UserRepository): IUserRepository

    companion object {
        @Provides
        fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()

        @Provides
        fun provideFirebaseDatabase(): FirebaseDatabase = FirebaseDatabase.getInstance()

        @Provides
        fun provideFirebaseMessaging(): FirebaseMessaging = FirebaseMessaging.getInstance()

        @Provides
        fun provideRetrofit(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("http://192.168.253.234:1337/api/")
                .client(
                    OkHttpClient.Builder()
                        .readTimeout(60, TimeUnit.SECONDS)
                        .connectTimeout(60, TimeUnit.SECONDS)
                        .addInterceptor(
                            HttpLoggingInterceptor()
                                .setLevel(HttpLoggingInterceptor.Level.BODY)
                        )
                        .build()
                )
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        @Provides
        @FirebaseCloudMessagingRetrofit
        fun provideFirebaseCloudMessagingRetrofit(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://fcm.googleapis.com/")
                .client(
                    OkHttpClient.Builder()
                        .readTimeout(60, TimeUnit.SECONDS)
                        .connectTimeout(60, TimeUnit.SECONDS)
                        .addInterceptor { chain ->
                            val requestBuilder = chain.request().newBuilder()
                            requestBuilder.addHeader(
                                "Authorization",
                                "key=BFKuSwH8-G0nap4E1FKiMaoQ1uvhPosdy0pyOmK9ZolFmj-8rCFirsro2wYxEKWShgybLcFleL_I7siKLtaOC54"
                            )
                            chain.proceed(requestBuilder.build())
                        }
                        .addInterceptor(
                            HttpLoggingInterceptor()
                                .setLevel(HttpLoggingInterceptor.Level.BODY)
                        )
                        .build()
                )
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        @Provides
        fun provideChatApi(@FirebaseCloudMessagingRetrofit retrofit: Retrofit): ChatApi =
            retrofit.create(ChatApi::class.java)

        @Provides
        fun provideYourmateApi(retrofit: Retrofit): YourmateApi = retrofit.create(YourmateApi::class.java)
    }
}