package com.max.eprovides;

import javax.inject.Inject;

public class MainComponent {
  private MainService mainService;

  @Inject
  public MainComponent(MainService mainService) {
    this.mainService = mainService;
  }

  public void printName() {
    System.out.println(mainService.getName());
  }

}
