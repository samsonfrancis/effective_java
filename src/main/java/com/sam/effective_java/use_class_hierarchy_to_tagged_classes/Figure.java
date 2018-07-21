package com.sam.effective_java.use_class_hierarchy_to_tagged_classes;

/**
 * This is the root class of the hierarchy.
 * Anything that is common to all the sub class should be declared here.
 * The specific implementations are taken care by the sub classes.
 */
public abstract class Figure {
    abstract double area();
}
