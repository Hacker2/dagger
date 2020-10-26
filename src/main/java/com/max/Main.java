package com.max;

import com.max.service.MainService;
import com.max.service.MainService2;

public class Main {

  public static void main(String[] args) {
//    MainService mainService = new MainServiceImpl();
    ServiceFactory serviceFactory = DaggerServiceFactory.create();
    MainService mainService = serviceFactory.getMainService();
    System.out.println(mainService.hello());
    MainService2 mainService2 = serviceFactory.getMainService2();
    System.out.println(mainService2.getHi());
    serviceFactory.getSingletonService();
    System.out.println(serviceFactory.getSingletonService().getI());
  }
}
