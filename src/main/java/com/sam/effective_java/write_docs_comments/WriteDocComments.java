package com.sam.effective_java.write_docs_comments;

public class WriteDocComments {
    private int size = 10;
    private String[] names = new String[size];

    /**
     * Returns the string at the specified position in this list.
     *
     * <p>This method is <i>not</i> guaranteed to run in constant time. In some implementations it may run in time
     * proportional to the element position.</p>
     *
     * @param index index of the string to return; must be non-negative and less than the size of this array
     * @return the string at the specified position in this array
     * @throws IndexOutOfBoundsException if the index is out of range ({@code index < 0 || index >= this.size })
     */
    String get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("The specified index is not found in the array.");
        }
        return names[index];
    }
}
