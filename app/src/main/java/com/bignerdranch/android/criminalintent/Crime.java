package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    // UUID is a java utils class that provides an easy to generate universally unique ids
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    /**
     * The default constructor sets both the ID of the crime and the date
     * The user will fill the date by typing it
     */
    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date(); // this initializes mDate with the current date
    }

    /**
     * getID
     * @return mId
     */
    public UUID getId() {
        return mId;
    }

    /**
     *
     * @return mTitle
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Sets mTitle
     * @param title
     */
    public void setTitle(String title) {
        mTitle = title;
    }

    /**
     *
     * @return mDate
     */
    public Date getDate() {
        return mDate;
    }

    /**
     * Sets mDate
     * @param date
     */
    public void setDate(Date date) {
        mDate = date;
    }

    /**
     * Verify if the crime was solved
     * @return
     */
    public boolean isSolved() {
        return mSolved;
    }

    /**
     * sets isSolved
     * @param solved
     */
    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}