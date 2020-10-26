package com.max.bcomponent;

import dagger.Component;

@Component
public interface MainServiceFactory {
  MainService getMainService();
}
