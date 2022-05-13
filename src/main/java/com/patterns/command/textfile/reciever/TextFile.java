package com.patterns.command.textfile.reciever;

public class TextFile {

    private String name;

    public TextFile(String name){
        this.name = name;
    }

    public void open(){
        System.out.println("Opening file " + name);
    }

    public void save(){
        System.out.println("Saving file " + name);
    }
}
