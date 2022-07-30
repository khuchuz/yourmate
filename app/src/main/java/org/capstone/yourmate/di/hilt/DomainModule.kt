package org.capstone.yourmate.di.hilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.capstone.yourmate.domain.usecase.*

@Module
@InstallIn(SingletonComponent::class)
abstract class DomainModule {
    @Binds
    abstract fun bindAuthInteractor(authInteractor: AuthInteractor): AuthUseCase

    @Binds
    abstract fun bindChatInteractor(chatInteractor: ChatInteractor): ChatUseCase

    @Binds
    abstract fun bindContactInteractor(contactInteractor: ContactInteractor): ContactUseCase

    @Binds
    abstract fun bindPlaceInteractor(placeInteractor: PlaceInteractor): PlaceUseCase

    @Binds
    abstract fun bindArticleInteractor(articleInteractor: ArticleInteractor): ArticleUseCase

    @Binds
    abstract fun bindUserInteractor(userInteractor: UserInteractor): UserUseCase
}