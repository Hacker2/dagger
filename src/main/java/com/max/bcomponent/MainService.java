package com.max.bcomponent;

import javax.inject.Inject;

public class MainService {

  @Inject
  public MainService() {}

  public String getName() {
    return "hello";
  }
}
