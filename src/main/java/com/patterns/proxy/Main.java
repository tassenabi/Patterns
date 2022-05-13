package com.patterns.proxy;

public class Main {
    public static void main(String[] args) {
        var realBank = new RealBankAccount(1000);
        var mobileBankAccount = new MobileBankingApp(realBank);
        mobileBankAccount.authorize("111");
        mobileBankAccount.withdrawMoney(80);
        mobileBankAccount.printNewBalance();
    }
}
