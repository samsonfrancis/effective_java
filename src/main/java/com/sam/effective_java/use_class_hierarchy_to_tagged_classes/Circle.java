package com.sam.effective_java.use_class_hierarchy_to_tagged_classes;

/**
 * This is the alternative implementation for tagged class. This overcomes all the draw backs of the tagged class.
 * The code and memory management becomes more efficient.
 */
public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
