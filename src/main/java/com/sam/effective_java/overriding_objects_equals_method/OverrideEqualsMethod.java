package com.sam.effective_java.overriding_objects_equals_method;

/**
 * This class demonstrates the concepts that need to be kept in mind while overriding the object's equals method.
 */
public class OverrideEqualsMethod {

    /**
     * If there is a base class and some properties in the child class it is more safer and recommended to rather
     * declare a type of parent class and check for it's equality.
     */
    private final Point point;
    private final String name;

    /**
     * This construtor initializes the properties
     * @param pointX point.x
     * @param pointY point.y
     * @param name name
     */
    public OverrideEqualsMethod(int pointX, int pointY, String name) {
        this.point = new Point(pointX,pointY);
        this.name = name;
    }

    /**
     * This constuctor takes point and name as args and creates the object
     * @param point point
     * @param name name
     * @throws NullPointerException {@code if(point == null) }
     */
    public OverrideEqualsMethod(Point point, String name){
        /* Note the proper use of null check inside constuctor */
        if(point == null){
            throw  new NullPointerException("Point object is null.");
        }

        this.point = point;
        this.name = name;
    }
    @Override /*This annotation make sures the equals is overridden with the expected signature*/
    public boolean equals(Object o){ /* note the Object as the argument - It always requires Object as argument and nothing else*/

        /**
         * This following instance of check first checks for null. If the object is null returns false.
         * The instance of class can also be checked against the parent class/interface
         * like in instaceof Map inside the HashMap class, which makes is more generic check and can pass all subtypes of Map
         */
        if(!(o instanceof OverrideEqualsMethod)){
            return false;
        }

        /**
         * The casting converts the objecting to current class
         */
        OverrideEqualsMethod overrideEqualsMethod = (OverrideEqualsMethod)o;

        /**
         * Check for equality.
         * Note first check a condition which will become false most of the times. Next check for primitive types as
         * the operation is likely to take less time.
         */
        /**
         * Note the point.equals inturn has to overridden inside point class
         */
        return overrideEqualsMethod.name.equals(name) && overrideEqualsMethod.point.equals(point);
    }
}
