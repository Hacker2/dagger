package com.max.iqualifier;

import javax.inject.Inject;

public class MainComponent {
  private MainService mainService;
  private MainService mainService2;

  @Inject
  public MainComponent(@MainQualifier1 MainService mainService1, @MainQualifier2 MainService mainService2) {
    this.mainService = mainService1;
    this.mainService2 = mainService2;
  }

  public void printName() {
    System.out.println(mainService.getName());
    System.out.println(mainService2.getName());
  }

}
