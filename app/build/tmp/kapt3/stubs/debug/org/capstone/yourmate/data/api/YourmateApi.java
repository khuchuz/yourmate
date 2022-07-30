package org.capstone.yourmate.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lorg/capstone/yourmate/data/api/YourmateApi;", "", "getArticles", "Lretrofit2/Response;", "Lorg/capstone/yourmate/data/api/BaseListResponse;", "Lorg/capstone/yourmate/domain/model/Article;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlaces", "Lorg/capstone/yourmate/domain/model/Place;", "getUserById", "Lorg/capstone/yourmate/domain/model/User;", "userId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface YourmateApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "articles")
    public abstract java.lang.Object getArticles(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.capstone.yourmate.data.api.BaseListResponse<org.capstone.yourmate.domain.model.Article>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tourisms")
    public abstract java.lang.Object getPlaces(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.capstone.yourmate.data.api.BaseListResponse<org.capstone.yourmate.domain.model.Place>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users/{userId}?populate=*")
    public abstract java.lang.Object getUserById(@retrofit2.http.Path(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.capstone.yourmate.domain.model.User>> continuation);
}