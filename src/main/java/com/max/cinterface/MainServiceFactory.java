package com.max.cinterface;

import dagger.Component;

@Component
public interface MainServiceFactory {
  MainServiceImpl1 getMainService();
}
