package com.max.cinterface;

public class Main {

  public static void main(String[] args) {
    MainServiceFactory mainServiceFactory = DaggerMainServiceFactory.create();
    MainService mainService = mainServiceFactory.getMainService();
    System.out.println(mainService.getName());
  }

}
