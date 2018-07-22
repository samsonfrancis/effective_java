package com.sam.effective_java.comparator_implementation;

public class ObjectComparator implements Comparator<TestObject>{
    public static final ObjectComparator INSTANCE = new ObjectComparator();
    private ObjectComparator(){}
    @Override
    public int compare(TestObject t1, TestObject t2) {
        return (t1.getA() + t1.getB()) - (t2.getA() + t2.getB());
    }
}
