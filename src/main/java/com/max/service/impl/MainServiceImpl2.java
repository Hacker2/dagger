package com.max.service.impl;

import com.max.service.MainService;
import javax.inject.Inject;

public class MainServiceImpl2 implements MainService {

  @Inject
  public MainServiceImpl2() { }

  public String hello() {
    return "hello world";
  }
}
