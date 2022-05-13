package com.javafeature.patternmatching;

public class Main {

    //alte Art vor Java 17
    public static double getOldWayPerimeter(Shape shape) throws IllegalArgumentException {
        if (shape instanceof Rectangle r) {
            return 2 * r.length() + 2 * r.width();
        } else if (shape instanceof Circle c) {
            return 2 * c.radius() * Math.PI;
        } else {
            throw new IllegalArgumentException("Unbekannte geometrische Form");
        }
    }

    //neue Art ab Java 13 switch expression
    public static double getMidNewPerimeter(Shape shape) throws IllegalArgumentException {
        return switch (shape) {
            case Rectangle r -> 2 * r.length() + 2 * r.width();
            case Circle c    -> 2 * c.radius() * Math.PI;
            default          -> throw new IllegalArgumentException("Unbekannte geometrische Form");
        };
    }

    //neue Art ab Java 17 switch statement
    public static double getNewPerimeter(Shape shape) throws IllegalArgumentException {
        switch (shape) {
            case Rectangle r: return 2 * r.length() + 2 * r.width();
            case Circle c:    return 2 * c.radius() * Math.PI;
            default:          throw new IllegalArgumentException("Unbekannte geometrische Form");
        }
    }
}
