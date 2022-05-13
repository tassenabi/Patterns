package com.patterns.factory.guicomponents;

import com.patterns.factory.guicomponents.app.Application;

public class Demo {

    public static void main(String[] args) {
        Application app = Application.configureApplication();
        app.paint();
    }
}
