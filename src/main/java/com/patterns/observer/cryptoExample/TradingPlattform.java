package com.patterns.observer.cryptoExample;

public class TradingPlattform {

    public static void main(String[] args){

        CryptoCurrency bitcoin = new CryptoCurrency("BitCoin");
        CryptoCurrency ethereum = new CryptoCurrency("Ethereum");
        CryptoCurrency solana = new CryptoCurrency("Solana");

        Observer trader1 = new Observer("Trader1");
        Observer trader2 = new Observer("Trader2");
        Observer trader3 = new Observer("Trader3");

        bitcoin.subscribe(trader1);
        ethereum.subscribe(trader1);
        ethereum.subscribe(trader2);
        solana.subscribe(trader3);

        bitcoin.updateValue(40000);
        ethereum.updateValue(30000);
        solana.updateValue(10000);

        ethereum.unsubscribe(trader1);
        ethereum.updateValue(25000);

    }
}
