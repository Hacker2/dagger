package com.max.eprovides;

import dagger.Component;

@Component(modules = MainServiceModule.class)
public interface MainServiceFactory {
  MainComponent getMainComponent();
}
