package com.sam.effective_java.comparator_implementation;

public class StringLengthComparator {
    private StringLengthComparator(){}
    public static final StringLengthComparator INSTANCE = new StringLengthComparator();
    public int compare(String s1, String s2){
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        StringLengthComparator stringLengthComparator = StringLengthComparator.INSTANCE;
        int diff = stringLengthComparator.compare("Samson", "Nosmas");
        System.out.println("String length diff : " + diff);
        System.out.println(stringLengthComparator.compare("slslsl","klsdkls"));
    }
}
