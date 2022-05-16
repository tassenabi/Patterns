package com.architecure.hexagonal_Infrastructure_far_from_Domain.account.application.port.in;

public interface SendMoneyUseCase {

    boolean sendMoney(SendMoneyCommand command);

}