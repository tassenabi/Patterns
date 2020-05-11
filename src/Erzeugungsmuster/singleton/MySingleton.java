package Erzeugungsmuster.singleton;

import javax.swing.*;

public class MySingleton {

    //Referenz
    private static final MySingleton instance = new MySingleton();

    private int a = 3 ;

    //privater Konstruktor
    private MySingleton(){

    }

    //static
    public static MySingleton getInstance(){

        return instance;
    }

    public int getInt(){

        return a;
    }

    public void setInt(int a){

        this.a = a;

    }

    public static void main(String[] args) {

        MySingleton s = MySingleton.getInstance();

        MySingleton a = MySingleton.getInstance();

        System.out.println(a.getInt());

        a.setInt(4);

        System.out.println(a.getInt());

        System.out.println(s.getInt());


    }
}
