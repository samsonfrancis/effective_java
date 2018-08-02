package com.sam.effective_java.always_override_hashcode_when_you_override_equals;

/**
 * Always override hashcode when you override equals method,
 * The following are expected from a good hashcode method:
 * 1.Return same hashcode on same object if invoked more than once and no fields are modified meanwhile
 * 2.If two objects are equal as per object's equal method => hashcode should return same value for those two
 * 3.It not necessary that two objects are unequal and the hascode to be different(can be same)
 *
 * The best usuage of hashcode is described below as lazy  initialization to improve performance (may take space more)
 */
public class OverrideHashCode {
    private volatile int hashCode;
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public OverrideHashCode(short areaCode, short prefix, short lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(!(o instanceof OverrideHashCode)){
            return false;
        }

        OverrideHashCode ovh = (OverrideHashCode)o;
        return ovh.areaCode == areaCode && ovh.prefix == prefix && ovh.lineNumber == lineNumber;
    }

    /**
     * The following overridden has method follows the lazy execution as it calcuates the hashcode only once
     * for an object as it checks for the hashCode value of the object
     *
     * A good hashcode method should include all the filed present in the equals method
     * Can neglect properties that are influenced by other fields (ie, if you can generate that field using other fields)
     *
     * The following are best practices for different type of fields (as f) or types
     * boolean: f?1:0
     * byte/int/short/char: (int)f
     * long (int)(f^(f>>>32))
     * float Float.floatToIntBits(f)
     * double Double.doubleToLongBits(f)
     * object: call it's internal hascode method => if object is null return 0
     * Arrays: Arrays.hashCode
     *
     * @return hash code
     */
    @Override
    public int hashCode(){
        int result = hashCode;
        if(result == 0) {
            //conventionally and by following the best practice initialize the result to 17
            result = 17;

            //note the use of 31 as it's the odd prime - it's a best practice and traditional
            result = 31 * result + areaCode;
            result = 31 * result + prefix;
            result = 31 * result + lineNumber;
            hashCode = result;
        }
        return result;
    }
}
