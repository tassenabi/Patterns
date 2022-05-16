package com.architecure.hexagonal_Infrastructure_far_from_Domain.account.application.port.out;

import com.architecure.hexagonal_Infrastructure_far_from_Domain.account.domaincore.Account;

public interface UpdateAccountStatePort {

    void updateActivities(Account account);

}