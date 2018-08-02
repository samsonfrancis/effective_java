package com.sam.effective_java.always_override_tostring;

/**
 * This class demonstrates the expected definition of the toString() overridden method.
 *
 * It is a recommended(not compulsary but expected mostly) to override the toString method of objects
 * By default the toString retruns the objectAddress+@+Integer.toHexString(object.hashCode())
 * But this toString should be overridden to give a human readable and all info about the object
 * 
 * By default in the object is printed or debugged the toString is automatically invoked on it
 */
public class ToStringDemoPhoneNumber {
    private final int areaCode;
    private final int prefix;
    private final int lineNumber;

    public ToStringDemoPhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    /**
     * Retruns the string representation of the class. The return string contains 14 chars as '(XXX) YYY-ZZZZ'
     * where XXX is areaCode, YYY is prefix and ZZZZ is lineNumber.
     *
     * If any of the parts of the phone number are small then they are padded with zeros.
     * @return string representation of the object
     */
    @Override
    public String toString(){
        return String.format("(%03d) %03d-%04d",areaCode,prefix,lineNumber);
    }
}
