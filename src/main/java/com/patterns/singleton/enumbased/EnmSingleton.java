package com.patterns.singleton.enumbased;

public enum EnmSingleton {
    INSTANCE("Intial Info");

    private String info;
    private EnmSingleton(String info){
        this.info = info;
    }

    public EnmSingleton getInstance(){
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
