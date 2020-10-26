package com.max.dgr;

import com.max.dgr.Database.Account;
import java.util.List;
import javax.inject.Inject;

final class LoginCommand implements Command {
  private final Outputter outputter;
  private final Database database;

  @Inject
  LoginCommand(Database database, Outputter outputter) {
    this.database = database;
    this.outputter = outputter;
  }

  @Override
  public String key() {
    return "login";
  }

  @Override
  public Status handleInput(List<String> input) {
    String username = "max";
    Account account = database.getAccount(username);
    outputter.output(
        username + " is logged in with balance: " + account.balance());
    outputter.output(" is logged in.!");
    return Status.HANDLED;
  }
}
