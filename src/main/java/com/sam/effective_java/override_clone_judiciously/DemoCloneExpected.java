package com.sam.effective_java.override_clone_judiciously;

public class DemoCloneExpected implements Cloneable {
    private int i;
    private SomeObject someObject;

    public DemoCloneExpected(int i,SomeObject someObject) {
        if(someObject == null){
            throw new IllegalArgumentException("SomeObject is null.");
        }
        this.someObject = someObject;
        this.i = i;
    }

    /**
     * This overridden clone method first calls the super.clone() which only clone the immutable and primitive types
     * It does not however clone the SomeObject(mutable)type
     * So need to create and object manually.
     * Note the manual creation of SomeObject happens after the call of super.clone();
     * @return Object which is an instance SomeObject
     */
    @Override
    public Object clone(){
        DemoCloneExpected demoCloneExpected = null;
        try {
            demoCloneExpected = (DemoCloneExpected) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Exception CloneNotSupported.");
        }
        if (demoCloneExpected != null) {
            demoCloneExpected.someObject = new SomeObject(someObject.getName());
        }
        return demoCloneExpected;
    }

    @Override
    public String toString(){
        return "i:" + i + ",SomeObject.name: " + someObject.name;
    }

    public static void main(String[] args) {
        DemoCloneExpected demoCloneExpected = new DemoCloneExpected(1,new SomeObject("ActualSomeObject"));
        DemoCloneExpected cloneExpected = (DemoCloneExpected) demoCloneExpected.clone();
        System.out.println("Actual:" + demoCloneExpected);
        System.out.println("Clone:" + cloneExpected);

        cloneExpected.someObject.name = "CloneNameModified";
        System.out.println("ActualAFterCloenNameModifie:" + demoCloneExpected);
        System.out.println("CloneAFterCloenNameModifie:" + cloneExpected);
    }
}
