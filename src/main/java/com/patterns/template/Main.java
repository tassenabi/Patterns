package com.patterns.template;
public class Main {

    public static void main(String[] args) {
        Product product1 = new Iphone13(1256);
        Product product2 = new SamsungGalaxy16(1400);
        System.out.println("Iphone 13 full price after VAT is " + product1.getPriceAfterTaxes());
        System.out.println("Samsung Galaxy full price after VAT is " + product2.getPriceAfterTaxes());
    }
}
