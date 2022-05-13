package com.architecure.hexagonal.account.application.port.in;

import com.architecure.hexagonal.account.domaincore.Account;
import com.architecure.hexagonal.account.domaincore.Money;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(Account.AccountId accountId);

}