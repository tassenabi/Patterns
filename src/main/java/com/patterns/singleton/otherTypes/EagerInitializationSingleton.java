package com.patterns.singleton.otherTypes;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){}

    public static EagerInitializationSingleton getInstance(){
        return instance;
    }
}
