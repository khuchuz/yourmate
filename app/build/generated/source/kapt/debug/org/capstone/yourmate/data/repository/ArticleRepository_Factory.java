// Generated by Dagger (https://dagger.dev).
package org.capstone.yourmate.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.capstone.yourmate.data.api.YourmateApi;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ArticleRepository_Factory implements Factory<ArticleRepository> {
  private final Provider<YourmateApi> yourmateApiProvider;

  public ArticleRepository_Factory(Provider<YourmateApi> yourmateApiProvider) {
    this.yourmateApiProvider = yourmateApiProvider;
  }

  @Override
  public ArticleRepository get() {
    return newInstance(yourmateApiProvider.get());
  }

  public static ArticleRepository_Factory create(Provider<YourmateApi> yourmateApiProvider) {
    return new ArticleRepository_Factory(yourmateApiProvider);
  }

  public static ArticleRepository newInstance(YourmateApi yourmateApi) {
    return new ArticleRepository(yourmateApi);
  }
}
