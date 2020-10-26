package com.max.iqualifier;

import dagger.Binds;
import dagger.Module;

@Module
abstract class MainServiceModule {
  @Binds
  @MainQualifier1
  abstract MainService getMainService(MainServiceImpl1 mainService1);
  @Binds
  @MainQualifier2
  abstract MainService getMainService2(MainServiceImpl2 mainService2);
}
