package com.max.fmap;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
abstract class MainServiceModule {
  @Binds
  @IntoMap
  @StringKey("impl1")
  abstract MainService getMainService1(MainServiceImpl1 mainServiceImpl1);

  @Binds
  @IntoMap
  @StringKey("impl2")
  abstract MainService getMainService2(MainServiceImpl2 mainServiceImpl1);
}
