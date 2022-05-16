package com.architecure.hexagonal_Infrastructure_far_from_Domain.account.application.port.out;

import com.architecure.hexagonal_Infrastructure_far_from_Domain.account.domaincore.Account;

import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(Account.AccountId accountId, LocalDateTime baselineDate);
}