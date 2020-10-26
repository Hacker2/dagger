package com.max.joptional;

import java.util.Optional;
import javax.inject.Inject;

public class MainComponent {
  private Optional<MainService> mainServiceOptional;

  @Inject
  public MainComponent(Optional<MainService> mainServiceOptional) {
    this.mainServiceOptional = mainServiceOptional;
  }

  public void printName() {
    if(mainServiceOptional.isPresent()) {
      MainService mainService = mainServiceOptional.get();
      System.out.println(mainService.getName());
    }
  }

}
