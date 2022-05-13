package com.architecure.hexagonal.account.application.port.out;

import com.architecure.hexagonal.account.domaincore.Account;

public interface AccountLock {

    void lockAccount(Account.AccountId accountId);

    void releaseAccount(Account.AccountId accountId);

}