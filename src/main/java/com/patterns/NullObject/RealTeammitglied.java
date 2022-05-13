package com.patterns.NullObject;

public class RealTeammitglied extends AbstractTeammitglied {

    public RealTeammitglied(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}