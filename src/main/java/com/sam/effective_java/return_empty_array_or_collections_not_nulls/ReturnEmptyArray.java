package com.sam.effective_java.return_empty_array_or_collections_not_nulls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Instead of returning null return empty array which can remove unnecessary null check code
 */
public class ReturnEmptyArray {
    private final List<String> names = new ArrayList<>();
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    /**
     * This method return the 'EMPTY_STRING_ARRAY' if names is empty else returns the names
     * The EMPTY_STRING_ARRAY is immutable and always return the same object and does not create new object for every method call
     * note usuage of list.toArrya(EMPTY_STRING_ARRAY)
     * @return String array
     */
    public String[] getStringArray(){
        return names.toArray(EMPTY_STRING_ARRAY);
    }

    /**
     * Usually if the list is empty null was returned, but again the client has to explicitly check for null.
     * To avoid this null check return empty list if no elements found.
     * @return list of strings
     */
    public List<String> getNames(){
        if(names.isEmpty()){
            return Collections.emptyList();
        }
        return names;
    }

    private void addName(String name){
        if(name == null || name.isEmpty()){
            return;
        }
        names.add(name);
    }

    public static void main(String[] args) {
        ReturnEmptyArray returnEmptyArray = new ReturnEmptyArray();
        //test the ouput of the empty array returned by getStringArray
        System.out.println(returnEmptyArray.getStringArray());
        System.out.println(returnEmptyArray.names);
        returnEmptyArray.addName("Samson");
        System.out.println(returnEmptyArray.getStringArray());
        System.out.println(EMPTY_STRING_ARRAY);
    }
}
