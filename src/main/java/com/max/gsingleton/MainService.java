package com.max.gsingleton;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
//@MySingleton
public class MainService {

  private static int i;

  @Inject
  public MainService() {
    i++;
  }

  public String getName() {
    return "hello" + i;
  }
}
