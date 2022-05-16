package com.architecure.hexagonal_Infrastructure_far_from_Domain.account.application.service;

import com.architecure.hexagonal_Infrastructure_far_from_Domain.account.domaincore.Money;

public class ThresholdExceededException extends RuntimeException {

    public ThresholdExceededException(Money threshold, Money actual) {
        super(String.format("Maximum threshold for transferring money exceeded: tried to transfer %s but threshold is %s!", actual, threshold));
    }

}