package com.patterns.NullObject;

public class Main {

    public static void main(String[] args) {

        AbstractTeammitglied teammitglied1 = TeammitgliedFactory.getCustomer("Thanh");
        AbstractTeammitglied teammitglied2 = TeammitgliedFactory.getCustomer("Sarah");
        AbstractTeammitglied teammitglied3 = TeammitgliedFactory.getCustomer("Oleks");
        AbstractTeammitglied teammitglied4 = TeammitgliedFactory.getCustomer("Johanna");

        System.out.println(teammitglied1.getName());
        System.out.println(teammitglied2.getName());
        System.out.println(teammitglied3.getName());
        System.out.println(teammitglied4.getName());
    }
}