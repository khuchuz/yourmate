package org.capstone.yourmate.app;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = YourMateApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface YourMateApplication_GeneratedInjector {
  void injectYourMateApplication(YourMateApplication yourMateApplication);
}
