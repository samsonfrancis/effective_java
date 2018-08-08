package com.sam.effective_java.implement_comparable;

/**
 * By implementing comparable allow order comparisions/natural ordering
 * For primitive type use manual comparisions using >/< == to find the order
 * For arrays use Arrays.sort(arr)
 * Objects use Given Object.compareTo(newObject) where object would have compareTo implementation
 * If there are multiple instance variables decide judiciously the priority of each field.
 */
public class DemoComparable implements Comparable {
    private final int a;
    private final String name;
    private final float f;

    public DemoComparable(int a, String name, float f) {
        this.a = a;
        this.name = name;
        this.f = f;
    }

    /**
     * The following compareTo method assumes that a has the highest priority followed by name and f;
     *
     * @param o object to compare with
     * @return -1 if current fields are less than @param o , 0 if equal and 1 if grater
     */
    @Override
    public int compareTo(Object o) {
        if (!(o instanceof DemoComparable)) {
            throw new IllegalArgumentException();
        }
        DemoComparable demoComparable = (DemoComparable) o;
        //note the order of comparison
        return a < demoComparable.a ? -1 : name.compareTo(demoComparable.name) < 0 ? -1 : Float.compare(f, demoComparable.f);
    }

    public static void main(String[] args) {
        DemoComparable demoComparable1 = new DemoComparable(1, "one", 1.0f);
        DemoComparable demoComparable2 = new DemoComparable(1, "one", 1.0f);
        DemoComparable demoComparable3 = new DemoComparable(1, "one", 1.20f);
        DemoComparable demoComparable4 = new DemoComparable(0, "one", 1.20f);

        System.out.println(demoComparable1.compareTo(demoComparable2));
        System.out.println(demoComparable3.compareTo(demoComparable1));
        System.out.println(demoComparable4.compareTo(demoComparable1));
    }
}
