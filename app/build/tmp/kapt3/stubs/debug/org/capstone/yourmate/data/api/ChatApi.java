package org.capstone.yourmate.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lorg/capstone/yourmate/data/api/ChatApi;", "", "sendMessage", "Lretrofit2/Response;", "", "messageRequest", "Lorg/capstone/yourmate/data/model/request/MessageRequest;", "(Lorg/capstone/yourmate/data/model/request/MessageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ChatApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "fcm/send")
    public abstract java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.capstone.yourmate.data.model.request.MessageRequest messageRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> continuation);
}