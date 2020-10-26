package com.max.dgr;

import com.max.dgr.Database.Account;
import java.math.BigDecimal;
import java.util.List;
import javax.inject.Inject;

public class DepositCommand implements Command {

  private final Outputter outputter;
  private final Database database;

  @Inject
  DepositCommand(Database database, Outputter outputter) {
    this.database = database;
    this.outputter = outputter;
  }

  @Override
  public String key() {
    return "deposit";
  }

  @Override
  public Status handleInput(List<String> input) {
    if (input.size() != 2) {
      return Status.INVALID;
    }

    Account account = database.getAccount(input.get(0));
    account.deposit(new BigDecimal(input.get(1)));
    outputter.output(account.username() + " now has: " + account.balance());
    return Status.HANDLED;
  }
}
