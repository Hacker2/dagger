package com.max;

import javax.inject.Inject;

public class MainComponent {
  private String hello = "world";

  @Inject
  public MainComponent() { }

  public String getHello() {
    return hello;
  }
}
