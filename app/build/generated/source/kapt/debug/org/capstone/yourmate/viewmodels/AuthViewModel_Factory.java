// Generated by Dagger (https://dagger.dev).
package org.capstone.yourmate.viewmodels;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.capstone.yourmate.domain.usecase.AuthUseCase;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthViewModel_Factory implements Factory<AuthViewModel> {
  private final Provider<AuthUseCase> authUseCaseProvider;

  public AuthViewModel_Factory(Provider<AuthUseCase> authUseCaseProvider) {
    this.authUseCaseProvider = authUseCaseProvider;
  }

  @Override
  public AuthViewModel get() {
    return newInstance(authUseCaseProvider.get());
  }

  public static AuthViewModel_Factory create(Provider<AuthUseCase> authUseCaseProvider) {
    return new AuthViewModel_Factory(authUseCaseProvider);
  }

  public static AuthViewModel newInstance(AuthUseCase authUseCase) {
    return new AuthViewModel(authUseCase);
  }
}
