package com.patterns.NullObject;

public class TeammitgliedFactory {

    public static final String[] names = {"Thanh", "Moussa", "Oleks"};

    public static AbstractTeammitglied getCustomer(String name){

        for (String s : names) {
            if (s.equalsIgnoreCase(name)) return new RealTeammitglied(name);
        }
        return new NullTeammitglied();
    }
}