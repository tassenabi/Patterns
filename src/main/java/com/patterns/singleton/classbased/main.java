package com.patterns.singleton.classbased;

public class main {
    public static void main(String[] args) {
        ClsSingleton clsSingleton1 = ClsSingleton.getInstance();

        System.out.println(clsSingleton1.getInfo());

        ClsSingleton clsSingleton2 = ClsSingleton.getInstance();
        clsSingleton2.setInfo("New class info");

        System.out.println(clsSingleton1.getInfo());
        System.out.println(clsSingleton2.getInfo());
    }
}
