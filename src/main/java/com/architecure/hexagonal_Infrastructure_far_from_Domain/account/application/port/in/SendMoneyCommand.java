package com.architecure.hexagonal_Infrastructure_far_from_Domain.account.application.port.in;

import com.architecure.hexagonal_Infrastructure_far_from_Domain.account.domaincore.Account;
import com.architecure.hexagonal_Infrastructure_far_from_Domain.account.domaincore.Money;
import com.architecure.hexagonal_Infrastructure_far_from_Domain.common.SelfValidating;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Value
@EqualsAndHashCode(callSuper = false)
public
class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {

    @NotNull
    private final Account.AccountId sourceAccountId;

    @NotNull
    private final Account.AccountId targetAccountId;

    @NotNull
    private final Money money;

    public SendMoneyCommand(
            Account.AccountId sourceAccountId,
            Account.AccountId targetAccountId,
            Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;
        this.validateSelf();
    }
}