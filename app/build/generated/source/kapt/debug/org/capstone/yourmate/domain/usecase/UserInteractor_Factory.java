// Generated by Dagger (https://dagger.dev).
package org.capstone.yourmate.domain.usecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.capstone.yourmate.data.repository.UserRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserInteractor_Factory implements Factory<UserInteractor> {
  private final Provider<UserRepository> userRepositoryProvider;

  public UserInteractor_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public UserInteractor get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static UserInteractor_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new UserInteractor_Factory(userRepositoryProvider);
  }

  public static UserInteractor newInstance(UserRepository userRepository) {
    return new UserInteractor(userRepository);
  }
}
