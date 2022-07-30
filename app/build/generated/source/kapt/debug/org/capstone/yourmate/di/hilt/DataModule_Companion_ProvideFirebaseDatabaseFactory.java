// Generated by Dagger (https://dagger.dev).
package org.capstone.yourmate.di.hilt;

import com.google.firebase.database.FirebaseDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_Companion_ProvideFirebaseDatabaseFactory implements Factory<FirebaseDatabase> {
  @Override
  public FirebaseDatabase get() {
    return provideFirebaseDatabase();
  }

  public static DataModule_Companion_ProvideFirebaseDatabaseFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirebaseDatabase provideFirebaseDatabase() {
    return Preconditions.checkNotNullFromProvides(DataModule.Companion.provideFirebaseDatabase());
  }

  private static final class InstanceHolder {
    private static final DataModule_Companion_ProvideFirebaseDatabaseFactory INSTANCE = new DataModule_Companion_ProvideFirebaseDatabaseFactory();
  }
}
