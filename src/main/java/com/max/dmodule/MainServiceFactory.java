package com.max.dmodule;

import dagger.Component;

@Component(modules = MainServiceModule.class)
public interface MainServiceFactory {
  MainComponent getMainComponent();
}
