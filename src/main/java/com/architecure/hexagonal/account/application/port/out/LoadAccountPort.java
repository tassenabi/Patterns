package com.architecure.hexagonal.account.application.port.out;

import com.architecure.hexagonal.account.domaincore.Account;

import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(Account.AccountId accountId, LocalDateTime baselineDate);
}