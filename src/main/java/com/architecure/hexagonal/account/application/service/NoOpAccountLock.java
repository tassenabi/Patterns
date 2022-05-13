package com.architecure.hexagonal.account.application.service;

import com.architecure.hexagonal.account.application.port.out.AccountLock;
import com.architecure.hexagonal.account.domaincore.Account;
import org.springframework.stereotype.Component;

@Component
class NoOpAccountLock implements AccountLock {

    @Override
    public void lockAccount(Account.AccountId accountId) {
        // do nothing
    }

    @Override
    public void releaseAccount(Account.AccountId accountId) {
        // do nothing
    }

}