package com.max.fmap;

import java.util.Map;
import javax.inject.Inject;

public class MainComponent {
  private final Map<String,MainService> mainServiceMap;

  @Inject
  public MainComponent(Map<String, MainService> mainServiceMap) {
    this.mainServiceMap = mainServiceMap;
  }

  void printName() {
    mainServiceMap.forEach((key, value) -> {
      System.out.println(key);
      System.out.println(value.getName());
    });
  }

}
