package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;


    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    /**
     * Private constructor to implement the singleton via the get method.
     * @param context
     */
    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();

        // eventually we will have user created crimes, but for now lets populate the list
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0); // Every other one is solved
            mCrimes.add(crime);
        }
    }

    /**
     * getter for mCrimes
     * @return
     */
    public List<Crime> getCrimes() {
        return mCrimes;
    }

    /**
     * Gets the Crime by ID
     * @param id
     * @return a crime that matches with the id, null otherwise
     */
    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }



}
