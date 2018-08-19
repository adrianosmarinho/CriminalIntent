package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

// controller for CrimeList
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment(){
        return new CrimeListFragment();

    }
}
