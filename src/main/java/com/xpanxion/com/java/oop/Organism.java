package com.xpanxion.com.java.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * An individual, animal, plant, or single-celled life form.
 */
public abstract class Organism {

    //
    // Data members
    //

    protected String creationDate;

    //
    // Constructors
    //

    public Organism() {
    }

    //
    // Public Methods
    //

    public int getYearsOld() throws ParseException {
        var retval = 0L;
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse(creationDate);
        Date todaysDate = new Date();
        long diffInMS = Math.abs(todaysDate.getTime() - firstDate.getTime());
        retval = (TimeUnit.DAYS.convert(diffInMS, TimeUnit.MILLISECONDS))/365;
        return (int)retval;
    }
}
