package com.patterns.facade.shapesexample;

import com.patterns.facade.shapesexample.ShapeMakerFacade;

public class Client {

    public static void main(String[] args) {
        ShapeMakerFacade shapeMakerFacade = new ShapeMakerFacade();

        shapeMakerFacade.drawCircle();
        shapeMakerFacade.drawRectangle();
        shapeMakerFacade.drawSquare();
    }
}
