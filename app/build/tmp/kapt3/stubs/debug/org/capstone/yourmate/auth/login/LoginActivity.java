package org.capstone.yourmate.auth.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lorg/capstone/yourmate/auth/login/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "authViewModel", "Lorg/capstone/yourmate/viewmodels/AuthViewModel;", "getAuthViewModel", "()Lorg/capstone/yourmate/viewmodels/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lorg/capstone/yourmate/databinding/ActivityLoginBinding;", "currentUser", "Lorg/capstone/yourmate/domain/model/User;", "loadingDialog", "Lorg/capstone/yourmate/base/LoadingDialog;", "getLoadingDialog", "()Lorg/capstone/yourmate/base/LoadingDialog;", "loadingDialog$delegate", "checkToken", "", "initUI", "navigateToHome", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpRegisterSpanText", "setWhiteStatusBar", "updateMessagingToken", "token", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy authViewModel$delegate = null;
    private org.capstone.yourmate.databinding.ActivityLoginBinding binding;
    private final kotlin.Lazy loadingDialog$delegate = null;
    private org.capstone.yourmate.domain.model.User currentUser;
    
    public LoginActivity() {
        super();
    }
    
    private final org.capstone.yourmate.viewmodels.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    private final org.capstone.yourmate.base.LoadingDialog getLoadingDialog() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI() {
    }
    
    private final void checkToken() {
    }
    
    private final void updateMessagingToken(java.lang.String token) {
    }
    
    private final void navigateToHome() {
    }
    
    private final void setWhiteStatusBar() {
    }
    
    private final void setUpRegisterSpanText() {
    }
}