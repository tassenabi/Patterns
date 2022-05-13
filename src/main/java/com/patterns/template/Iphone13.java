package com.patterns.template;

public class Iphone13 extends Product{

    private  int price;

    public Iphone13(int price) {
        this.price = price;
    }

    @Override
    double getPrice() {
        return price;
    }
}
