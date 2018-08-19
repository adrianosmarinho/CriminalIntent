package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public abstract class SingleFragmentActivity extends AppCompatActivity {

    protected abstract Fragment createFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = createFragment();
            /**
             * Fragment transactions are used to add, remove, attach, detach, or replace fragments in the fragment
             list. They are the heart of how you use fragments to compose and recompose screens at runtime. The
             FragmentManager maintains a back stack of fragment transactions that you can navigate.
             */

            /**
             * The add(…) method is the meat of the transaction. It has two parameters: a container view ID and the
             newly created CrimeFragment. The container view ID should look familiar. It is the resource ID of the
             FrameLayout that you defined in activity_fragment.xmlxml.
             */
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}
