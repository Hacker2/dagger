package com.max.gsingleton;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
//@MySingleton
@Component
public interface MainServiceFactory {
  MainService getMainService();
}
