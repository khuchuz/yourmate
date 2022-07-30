// Generated by Dagger (https://dagger.dev).
package org.capstone.yourmate.di.hilt;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_Companion_ProvideFirebaseAuthFactory implements Factory<FirebaseAuth> {
  @Override
  public FirebaseAuth get() {
    return provideFirebaseAuth();
  }

  public static DataModule_Companion_ProvideFirebaseAuthFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirebaseAuth provideFirebaseAuth() {
    return Preconditions.checkNotNullFromProvides(DataModule.Companion.provideFirebaseAuth());
  }

  private static final class InstanceHolder {
    private static final DataModule_Companion_ProvideFirebaseAuthFactory INSTANCE = new DataModule_Companion_ProvideFirebaseAuthFactory();
  }
}