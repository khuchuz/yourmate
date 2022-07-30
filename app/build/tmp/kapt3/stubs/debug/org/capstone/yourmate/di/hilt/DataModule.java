package org.capstone.yourmate.di.hilt;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\'\u00a8\u0006\u001c"}, d2 = {"Lorg/capstone/yourmate/di/hilt/DataModule;", "", "()V", "bindArticleRepository", "Lorg/capstone/yourmate/domain/repository/IArticleRepository;", "articleRepository", "Lorg/capstone/yourmate/data/repository/ArticleRepository;", "bindAuthRepository", "Lorg/capstone/yourmate/domain/repository/IAuthRepository;", "authRepository", "Lorg/capstone/yourmate/data/repository/AuthRepository;", "bindChatRepository", "Lorg/capstone/yourmate/domain/repository/IChatRepository;", "chatRepository", "Lorg/capstone/yourmate/data/repository/ChatRepository;", "bindContactRepository", "Lorg/capstone/yourmate/domain/repository/IContactRepository;", "contactRepository", "Lorg/capstone/yourmate/data/repository/ContactRepository;", "bindPlaceRepository", "Lorg/capstone/yourmate/domain/repository/IPlaceRepository;", "placeRepository", "Lorg/capstone/yourmate/data/repository/PlaceRepository;", "bindUserRepository", "Lorg/capstone/yourmate/domain/repository/IUserRepository;", "userRepository", "Lorg/capstone/yourmate/data/repository/UserRepository;", "Companion", "app_debug"})
@dagger.Module()
public abstract class DataModule {
    @org.jetbrains.annotations.NotNull()
    public static final org.capstone.yourmate.di.hilt.DataModule.Companion Companion = null;
    
    public DataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.capstone.yourmate.domain.repository.IAuthRepository bindAuthRepository(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.data.repository.AuthRepository authRepository);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.capstone.yourmate.domain.repository.IChatRepository bindChatRepository(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.data.repository.ChatRepository chatRepository);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.capstone.yourmate.domain.repository.IContactRepository bindContactRepository(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.data.repository.ContactRepository contactRepository);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.capstone.yourmate.domain.repository.IPlaceRepository bindPlaceRepository(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.data.repository.PlaceRepository placeRepository);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.capstone.yourmate.domain.repository.IArticleRepository bindArticleRepository(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.data.repository.ArticleRepository articleRepository);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.capstone.yourmate.domain.repository.IUserRepository bindUserRepository(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.data.repository.UserRepository userRepository);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0011"}, d2 = {"Lorg/capstone/yourmate/di/hilt/DataModule$Companion;", "", "()V", "provideChatApi", "Lorg/capstone/yourmate/data/api/ChatApi;", "retrofit", "Lretrofit2/Retrofit;", "provideFirebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "provideFirebaseCloudMessagingRetrofit", "provideFirebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "provideFirebaseMessaging", "Lcom/google/firebase/messaging/FirebaseMessaging;", "provideRetrofit", "provideYourmateApi", "Lorg/capstone/yourmate/data/api/YourmateApi;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final com.google.firebase.auth.FirebaseAuth provideFirebaseAuth() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final com.google.firebase.database.FirebaseDatabase provideFirebaseDatabase() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final com.google.firebase.messaging.FirebaseMessaging provideFirebaseMessaging() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final retrofit2.Retrofit provideRetrofit() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.capstone.yourmate.di.qualifier.FirebaseCloudMessagingRetrofit()
        @dagger.Provides()
        public final retrofit2.Retrofit provideFirebaseCloudMessagingRetrofit() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final org.capstone.yourmate.data.api.ChatApi provideChatApi(@org.jetbrains.annotations.NotNull()
        @org.capstone.yourmate.di.qualifier.FirebaseCloudMessagingRetrofit()
        retrofit2.Retrofit retrofit) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final org.capstone.yourmate.data.api.YourmateApi provideYourmateApi(@org.jetbrains.annotations.NotNull()
        retrofit2.Retrofit retrofit) {
            return null;
        }
    }
}