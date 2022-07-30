package org.capstone.yourmate.home.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\n2\u0006\u0010\u0015\u001a\u00020\u0016R#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/capstone/yourmate/home/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "placeUseCase", "Lorg/capstone/yourmate/domain/usecase/PlaceUseCase;", "articleUseCase", "Lorg/capstone/yourmate/domain/usecase/ArticleUseCase;", "userUseCase", "Lorg/capstone/yourmate/domain/usecase/UserUseCase;", "(Lorg/capstone/yourmate/domain/usecase/PlaceUseCase;Lorg/capstone/yourmate/domain/usecase/ArticleUseCase;Lorg/capstone/yourmate/domain/usecase/UserUseCase;)V", "articles", "Landroidx/lifecycle/LiveData;", "Lorg/capstone/yourmate/data/Resource;", "", "Lorg/capstone/yourmate/domain/model/Article;", "getArticles", "()Landroidx/lifecycle/LiveData;", "places", "Lorg/capstone/yourmate/domain/model/Place;", "getPlaces", "getUserById", "Lorg/capstone/yourmate/domain/model/User;", "id", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final org.capstone.yourmate.domain.usecase.UserUseCase userUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<java.util.List<org.capstone.yourmate.domain.model.Article>>> articles = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<java.util.List<org.capstone.yourmate.domain.model.Place>>> places = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.domain.usecase.PlaceUseCase placeUseCase, @org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.domain.usecase.ArticleUseCase articleUseCase, @org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.domain.usecase.UserUseCase userUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<java.util.List<org.capstone.yourmate.domain.model.Article>>> getArticles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<java.util.List<org.capstone.yourmate.domain.model.Place>>> getPlaces() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<org.capstone.yourmate.domain.model.User>> getUserById(int id) {
        return null;
    }
}