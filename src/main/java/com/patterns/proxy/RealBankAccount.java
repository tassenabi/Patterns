package com.patterns.proxy;

public class RealBankAccount implements BankAccount {
    private double balance;

    public RealBankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawMoney(double amount) {
      balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
