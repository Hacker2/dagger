package com.max.eprovides;

import dagger.Module;
import dagger.Provides;

@Module
abstract class MainServiceModule {
  @Provides
  static MainService getMainService() {
    MainService mainService = new MainServiceImpl1();
    return mainService;
  }
}
