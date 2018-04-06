package com.andela.mrm;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by andeladeveloper on 06/04/2018.
 */

public class CountryActivity extends AppCompatActivity {
    FragmentManager manager;
    FragmentTransaction transaction;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        CountryFragment countryFragment = new CountryFragment();
        manager = getFragmentManager();
        transaction = manager.beginTransaction();

        transaction.add(R.id.frameLayout, countryFragment, "countryFragment");
        transaction.commit();
    }
}
