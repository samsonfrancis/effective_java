package com.sam.effective_java.override_clone_judiciously;

import lombok.Getter;
import lombok.Setter;

public class DemoClone implements Cloneable {
    @Getter@Setter
    private int anInt;
    @Getter@Setter
    private long aLong;
    @Getter@Setter
    private String aString;
    private SomeObject someObject;

    public DemoClone(int anInt, long aLong, String aString, SomeObject someObject) {
        this.anInt = anInt;
        this.aLong = aLong;
        this.aString = aString;
        if(someObject == null){
            throw new IllegalArgumentException("Null SomeObject.");
        }
        this.someObject = someObject;
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString(){
        return "anInt:" + anInt + ",aLong:"+aLong+",aString:"+aString+"," + someObject;
    }

    public static void main(String[] args) {
        SomeObject someObject = new SomeObject("ActualSomeObject");
        DemoClone actual = new DemoClone(1,2,"DemoCloneObject1", someObject);
        DemoClone clone = (DemoClone) actual.clone();

        actual.setAnInt(100);
        actual.setAString("actualObj");
        System.out.println("ACtual: " + actual);

        clone.setAnInt(200);
        clone.setAString("cloneObj");
        System.out.println("Clone: " + clone);

        /**
         * Note the following tries to set a new name for the clone object
         * but it in turn sets it in the actual object aloso
         * because when we called the super.clone() it would not clone the object references
         * so we should override the clone method and define a proper clone mechanisms.
         */
        clone.someObject.name = "ModifiedSomeObject";
        System.out.println("Clone: " + clone);
        System.out.println("ACtual: " + actual);
    }
}
