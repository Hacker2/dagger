package com.max.joptional;

import dagger.BindsOptionalOf;
import dagger.Module;

@Module
interface MainServiceModule {
  @BindsOptionalOf
  MainService getMainService();
}
