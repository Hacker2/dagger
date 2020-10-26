package com.max.dgr;

import java.util.List;
import javax.inject.Inject;

final class HelloWorldCommand implements Command {

  private final Outputter outputter;

  @Inject
  HelloWorldCommand(Outputter outputter) {
    this.outputter = outputter;
  }

  public String key() {
    return "hello";
  }

  @Override
  public Status handleInput(List<String> input) {
    outputter.output("world!");
    return Status.HANDLED;
  }
}
