package com.sam.effective_java.defensive_copy_of_objects;

import java.util.Date;

/**
 * This class demonstrates the use and necessity of defensive copy of the objects.
 * <b>instead of passing Date object pass long millies which is more efficient and elegant.</b>
 */
public class DefensiveCopyOfObjects {
    private Date startDate = null;
    private Date endDate = null;

    /**
     * The constructor does not directly assign the values it creates a new object with the given values and
     * assigns them to instance variables.
     *
     * @param startDate startDate not to be modified
     * @param endDate   end date not to be modified
     */
    public DefensiveCopyOfObjects(Date startDate, Date endDate) {
        this.startDate = new Date(startDate.getTime());
        this.endDate = new Date(endDate.getTime());
    }

    /**
     * This constructor is better than the previous as it takes the primitive types as args
     * this is very defensive compared to the previous one.
     *
     * @param startDateMillies start date in millies
     * @param endDateMillies   end date in millies
     */
    public DefensiveCopyOfObjects(long startDateMillies, long endDateMillies) {
        this.startDate = new Date(startDateMillies);
        this.endDate = new Date(endDateMillies);
    }
}
