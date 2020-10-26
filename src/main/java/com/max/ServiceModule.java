package com.max;

import com.max.service.MainService;
import com.max.service.MainService2;
import com.max.service.impl.MainServiceImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ServiceModule {
  @Binds
  abstract MainService getMainService(MainServiceImpl mainService);

  @Provides
  static MainService2 getMainService2() {
    return () -> "hi world";
  }
}
