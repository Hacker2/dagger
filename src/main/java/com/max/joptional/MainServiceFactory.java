package com.max.joptional;

import dagger.Component;

@Component(modules = MainServiceModule.class)
public interface MainServiceFactory {
  MainComponent getMainComponent();
}
