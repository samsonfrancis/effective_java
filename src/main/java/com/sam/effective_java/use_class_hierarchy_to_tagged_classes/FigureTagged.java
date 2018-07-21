package com.sam.effective_java.use_class_hierarchy_to_tagged_classes;

/**
 * This is a tagged class as creates objects as per the desired shape
 * When it creates an object other irrelevent fields are also part the object created.
 * verbose (more code than required)
 * This type of class should not be used - use abstract class hierarchy instead.
 */
public class FigureTagged {
    enum Shape {RECTANGLE,CIRCLE};

    private final Shape shape;
    private double length;
    private double widht;
    private double radius;

    FigureTagged(double radius){
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    FigureTagged(double length, double widht){
        shape = Shape.RECTANGLE;
        this.length = length;
        this.widht = widht;
    }

    double area(){
        switch (shape){
            case CIRCLE:
                return Math.PI * radius * radius;
            case RECTANGLE:
                return length * widht;
            default:
                throw new AssertionError();
        }
    }
}
