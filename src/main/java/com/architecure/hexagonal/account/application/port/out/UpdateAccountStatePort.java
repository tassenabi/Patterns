package com.architecure.hexagonal.account.application.port.out;

import com.architecure.hexagonal.account.domaincore.Account;

public interface UpdateAccountStatePort {

    void updateActivities(Account account);

}