// Generated by Dagger (https://dagger.dev).
package org.capstone.yourmate.domain.usecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.capstone.yourmate.domain.repository.IAuthRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthInteractor_Factory implements Factory<AuthInteractor> {
  private final Provider<IAuthRepository> authRepositoryProvider;

  public AuthInteractor_Factory(Provider<IAuthRepository> authRepositoryProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
  }

  @Override
  public AuthInteractor get() {
    return newInstance(authRepositoryProvider.get());
  }

  public static AuthInteractor_Factory create(Provider<IAuthRepository> authRepositoryProvider) {
    return new AuthInteractor_Factory(authRepositoryProvider);
  }

  public static AuthInteractor newInstance(IAuthRepository authRepository) {
    return new AuthInteractor(authRepository);
  }
}
