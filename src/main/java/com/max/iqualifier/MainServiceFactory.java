package com.max.iqualifier;

import dagger.Component;

@Component(modules = MainServiceModule.class)
public interface MainServiceFactory {
  MainComponent getMainComponent();
}
