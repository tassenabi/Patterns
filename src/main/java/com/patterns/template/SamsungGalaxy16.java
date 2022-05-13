package com.patterns.template;

public class SamsungGalaxy16 extends Product{
    private  int price;

    public SamsungGalaxy16(int price) {
        this.price = price;
    }

    @Override
    double getPrice() {
        return price;
    }
}
