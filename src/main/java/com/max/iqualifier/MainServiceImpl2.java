package com.max.iqualifier;

import javax.inject.Inject;

public class MainServiceImpl2 implements MainService {

  @Inject
  public MainServiceImpl2() {
  }

  @Override
  public String getName() {
    return "impl 2";
  }
}
