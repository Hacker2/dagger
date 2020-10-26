package com.max.fmap;

import dagger.Component;

@Component(modules = MainServiceModule.class)
public interface MainServiceFactory {
  MainComponent getMainComponent();
}
