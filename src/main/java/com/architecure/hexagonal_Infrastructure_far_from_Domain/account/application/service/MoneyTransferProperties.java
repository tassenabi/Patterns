package com.architecure.hexagonal_Infrastructure_far_from_Domain.account.application.service;

import com.architecure.hexagonal_Infrastructure_far_from_Domain.account.domaincore.Money;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoneyTransferProperties {

    private Money maximumTransferThreshold = Money.of(1_000_000L);

}
