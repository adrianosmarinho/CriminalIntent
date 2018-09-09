package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    // UUID is a java utils class that provides an easy to generate universally unique ids
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    /**
     * The default constructor sets both the ID of the crime and the date
     * The user will fill the date by typing it
     */
    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
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

    /**
     *
     * @return
     */
    public String getSuspect() {
        return mSuspect;
    }

    /**
     *
     * @param suspect
     */
    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    /**
     *
     * @return
     */
    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }


}