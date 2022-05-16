package com.architecure.hexagonal_Infrastructure_far_from_Domain.account.application.port.in;

import com.architecure.hexagonal_Infrastructure_far_from_Domain.account.domaincore.Account;
import com.architecure.hexagonal_Infrastructure_far_from_Domain.account.domaincore.Money;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(Account.AccountId accountId);

}