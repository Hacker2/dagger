package com.max.dmodule;

import dagger.Binds;
import dagger.Module;

@Module
abstract class MainServiceModule {
  @Binds
  abstract MainService getMainService(MainServiceImpl1 mainService);
}
