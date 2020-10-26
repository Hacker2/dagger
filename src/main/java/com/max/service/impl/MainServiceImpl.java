package com.max.service.impl;

import com.max.MainComponent;
import com.max.service.MainService;
import javax.inject.Inject;

public class MainServiceImpl implements MainService {

  private MainComponent mainComponent;

  @Inject
  public MainServiceImpl(MainComponent mainComponent) {
    this.mainComponent = mainComponent;
  }

  public String hello() {
    return mainComponent.getHello();
  }
}
