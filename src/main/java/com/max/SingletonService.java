package com.max;

import javax.inject.Inject;

public class SingletonService {

  static int i;

  @Inject
  SingletonService() {
    i++;
  }

  public static int getI() {
    return i;
  }
}
