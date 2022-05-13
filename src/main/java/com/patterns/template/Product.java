package com.patterns.template;

public abstract class Product {
    public final static double VAT = 0.2;

    double getPriceAfterTaxes(){
        return getPrice() * (1 + VAT);
    }

    abstract double getPrice();

}
