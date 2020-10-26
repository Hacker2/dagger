package com.max.iqualifier;

public class Main {

  public static void main(String[] args) {
    MainServiceFactory mainServiceFactory = DaggerMainServiceFactory.create();
    MainComponent mainComponent = mainServiceFactory.getMainComponent();
    mainComponent.printName();
  }

}
