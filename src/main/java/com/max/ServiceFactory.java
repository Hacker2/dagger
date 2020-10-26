package com.max;

import com.max.service.MainService;
import com.max.service.MainService2;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = ServiceModule.class)
//@Component
public interface ServiceFactory {
  MainService getMainService();
  MainService2 getMainService2();
  SingletonService getSingletonService();
}
