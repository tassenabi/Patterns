package com.patterns.facade.shapesexample;

import com.patterns.facade.shapesexample.Shapes.Circle;
import com.patterns.facade.shapesexample.Shapes.Rectangle;
import com.patterns.facade.shapesexample.Shapes.Shape;
import com.patterns.facade.shapesexample.Shapes.Square;

public class ShapeMakerFacade {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMakerFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
