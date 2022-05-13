package com.patterns.singleton.classbased;

public final class ClsSingleton {
    private static ClsSingleton INSTANCE;
    private String info = "Intitial Info";

    private ClsSingleton(){}

    public static ClsSingleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new ClsSingleton();
        }

        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
