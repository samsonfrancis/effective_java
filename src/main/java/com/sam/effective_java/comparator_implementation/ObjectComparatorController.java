package com.sam.effective_java.comparator_implementation;

public class ObjectComparatorController {
    public static void main(String[] args) {
        TestObject testObject1 = new TestObject(10,20);
        TestObject testObject2 = new TestObject(5,50);
        ObjectComparator o = ObjectComparator.INSTANCE;
        int diff = o.compare(testObject1,testObject2);
        System.out.println(diff);
    }
}
