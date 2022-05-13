package com.patterns.proxy;

public interface BankAccount {

    void withdrawMoney(double amount);

    double getBalance();

    default void printNewBalance() {
        System.out.println("new balance is " + getBalance());
    }
}
