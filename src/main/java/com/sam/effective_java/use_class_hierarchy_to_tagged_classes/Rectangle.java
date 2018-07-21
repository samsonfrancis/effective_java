package com.sam.effective_java.use_class_hierarchy_to_tagged_classes;

/**
 * This is the alternative implementation for tagged class. This overcomes all the draw backs of the tagged class.
 * The code and memory management becomes more efficient.
 */
public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
