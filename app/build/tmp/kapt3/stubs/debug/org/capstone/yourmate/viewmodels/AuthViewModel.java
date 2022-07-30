package org.capstone.yourmate.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bJ\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0006J*\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bJ\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u00062\u0006\u0010\u0016\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lorg/capstone/yourmate/viewmodels/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "authUseCase", "Lorg/capstone/yourmate/domain/usecase/AuthUseCase;", "(Lorg/capstone/yourmate/domain/usecase/AuthUseCase;)V", "currentMessagingToken", "Landroidx/lifecycle/LiveData;", "Lorg/capstone/yourmate/data/Resource;", "", "getCurrentMessagingToken", "()Landroidx/lifecycle/LiveData;", "currentUser", "Lorg/capstone/yourmate/domain/model/User;", "getCurrentUser", "login", "email", "password", "logout", "", "register", "name", "updateMessagingToken", "token", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final org.capstone.yourmate.domain.usecase.AuthUseCase authUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<org.capstone.yourmate.domain.model.User>> currentUser = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<java.lang.String>> currentMessagingToken = null;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    org.capstone.yourmate.domain.usecase.AuthUseCase authUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<org.capstone.yourmate.domain.model.User>> getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<java.lang.String>> getCurrentMessagingToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<org.capstone.yourmate.domain.model.User>> login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<org.capstone.yourmate.domain.model.User>> register(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<java.lang.Boolean>> updateMessagingToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.capstone.yourmate.data.Resource<java.lang.Boolean>> logout() {
        return null;
    }
}