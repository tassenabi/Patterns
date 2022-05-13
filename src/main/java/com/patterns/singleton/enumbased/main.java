package com.patterns.singleton.enumbased;

public class main {
    public static void main(String[] args) {
        EnmSingleton enmSingleton1 = EnmSingleton.INSTANCE.getInstance();

        System.out.println(enmSingleton1.getInfo());

        EnmSingleton enmSingleton2 = EnmSingleton.INSTANCE.getInstance();
        enmSingleton2.setInfo("New enum info");

        System.out.println(enmSingleton1.getInfo());
        System.out.println(enmSingleton2.getInfo());
    }
}
