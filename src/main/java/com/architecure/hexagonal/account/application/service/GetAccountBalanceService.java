package com.architecure.hexagonal.account.application.service;

import java.time.LocalDateTime;

import com.architecure.hexagonal.account.application.port.in.GetAccountBalanceQuery;
import com.architecure.hexagonal.account.application.port.out.LoadAccountPort;
import com.architecure.hexagonal.account.domaincore.Account;
import com.architecure.hexagonal.account.domaincore.Money;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class GetAccountBalanceService implements GetAccountBalanceQuery {

    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(Account.AccountId accountId) {
        return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
                .calculateBalance();
    }
}