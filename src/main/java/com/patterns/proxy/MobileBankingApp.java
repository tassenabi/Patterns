package com.patterns.proxy;

public class MobileBankingApp implements BankAccount {

    private RealBankAccount bankAccount;
    private boolean isMobileTanAuthorized;


    public MobileBankingApp(RealBankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void authorize(String tan) {
        if (tan.equals("111")) {
            isMobileTanAuthorized = true;
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        double newBalance = bankAccount.getBalance() - amount;
        if (newBalance < 0) {
            throw new IllegalStateException("not enough money on your account");
        }
        if (isMobileTanAuthorized) {
            bankAccount.setBalance(newBalance);
        }
    }

    @Override
    public double getBalance() {
       // if(cache.isValid) return cache.getBalance();
        return this.bankAccount.getBalance();
    }


}
