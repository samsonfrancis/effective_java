package com.sam.effective_java.comparator_implementation;

public class StringLengthComparator2 implements Comparator<String> {
    private StringLengthComparator2(){}
    public static final StringLengthComparator2 INSTANCE = new StringLengthComparator2();
    public int compare(String s1, String s2){
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        StringLengthComparator2 stringLengthComparator = StringLengthComparator2.INSTANCE;
        int diff = stringLengthComparator.compare("Samson", "Nosmas");
        System.out.println("String length diff : " + diff);
        System.out.println(stringLengthComparator.compare("ABD","sldfkls"));
    }
}
