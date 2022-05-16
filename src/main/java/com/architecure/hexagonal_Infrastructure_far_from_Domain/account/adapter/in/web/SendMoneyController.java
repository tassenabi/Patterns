package com.architecure.hexagonal_Infrastructure_far_from_Domain.account.adapter.in.web;

import com.architecure.hexagonal_Infrastructure_far_from_Domain.account.application.port.in.SendMoneyCommand;
import com.architecure.hexagonal_Infrastructure_far_from_Domain.account.application.port.in.SendMoneyUseCase;
import com.architecure.hexagonal_Infrastructure_far_from_Domain.account.domaincore.Account;
import com.architecure.hexagonal_Infrastructure_far_from_Domain.account.domaincore.Money;
import com.architecure.hexagonal_Infrastructure_far_from_Domain.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
class SendMoneyController {

    private final SendMoneyUseCase sendMoneyUseCase;

    @PostMapping(path = "/accounts/send/{sourceAccountId}/{targetAccountId}/{amount}")
    void sendMoney(
            @PathVariable("sourceAccountId") Long sourceAccountId,
            @PathVariable("targetAccountId") Long targetAccountId,
            @PathVariable("amount") Long amount) {

        SendMoneyCommand command = new SendMoneyCommand(
                new Account.AccountId(sourceAccountId),
                new Account.AccountId(targetAccountId),
                Money.of(amount));

        sendMoneyUseCase.sendMoney(command);
    }

}