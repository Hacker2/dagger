package com.max.cinterface;

import javax.inject.Inject;

public class MainServiceImpl1 implements MainService {

  @Inject
  public MainServiceImpl1() { }

  @Override
  public String getName() {
    return "impl 1";
  }
}
