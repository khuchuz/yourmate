package org.capstone.yourmate.di.hilt;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\'\u00a8\u0006\u001b"}, d2 = {"Lorg/capstone/yourmate/di/hilt/DomainModule;", "", "()V", "bindArticleInteractor", "Lorg/capstone/yourmate/domain/usecase/ArticleUseCase;", "articleInteractor", "Lorg/capstone/yourmate/domain/usecase/ArticleInteractor;", "bindAuthInteractor", "Lorg/capstone/yourmate/domain/usecase/AuthUseCase;", "authInteractor", "Lorg/capstone/yourmate/domain/usecase/AuthInteractor;", "bindChatInteractor", "Lorg/capstone/yourmate/domain/usecase/ChatUseCase;", "chatInteractor", "Lorg/capstone/yourmate/domain/usecase/ChatInteractor;", "bindContactInteractor", "Lorg/capstone/yourmate/domain/usecase/ContactUseCase;", "contactInteractor", "Lorg/capstone/yourmate/domain/usecase/ContactInteractor;", "bindPlaceInteractor", "Lorg/capstone/yourmate/domain/usecase/PlaceUseCase;", "placeInteractor", "Lorg/capstone/yourmate/domain/usecase/PlaceInteractor;", "bindUserInteractor", "Lorg/capstone/yourmate/domain/usecase/UserUseCase;", "userInteractor", "Lorg/capstone/yourmate/domain/usecase/UserInteractor;", "app_debug"})
@dagger.Module()
public abstract class DomainModule {
    
    public DomainModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.capstone.yourmate.domain.usecase.AuthUseCase bindAuthInteractor(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.domain.usecase.AuthInteractor authInteractor);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.capstone.yourmate.domain.usecase.ChatUseCase bindChatInteractor(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.domain.usecase.ChatInteractor chatInteractor);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.capstone.yourmate.domain.usecase.ContactUseCase bindContactInteractor(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.domain.usecase.ContactInteractor contactInteractor);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.capstone.yourmate.domain.usecase.PlaceUseCase bindPlaceInteractor(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.domain.usecase.PlaceInteractor placeInteractor);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.capstone.yourmate.domain.usecase.ArticleUseCase bindArticleInteractor(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.domain.usecase.ArticleInteractor articleInteractor);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.capstone.yourmate.domain.usecase.UserUseCase bindUserInteractor(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.domain.usecase.UserInteractor userInteractor);
}