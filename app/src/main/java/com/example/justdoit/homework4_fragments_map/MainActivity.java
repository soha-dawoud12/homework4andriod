package com.example.justdoit.homework4_fragments_map;



import android.app.FragmentManager;


import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.ui.PlacePicker;

public class MainActivity extends AppCompatActivity
        implements MainFragment.OnFragmentInteractionListener,
        MapFragment.OnFragmentInteractionListener, PICFragment.OnFragmentInteractionListener {
   static FragmentManager fm;static FragmentTransaction ft;

    private static final String TAG = "MainActivity";


    Button  button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainFragment Main= new MainFragment();

        // get fragment manager
          fm = getFragmentManager();

// add
          ft = fm.beginTransaction();
        ft.add(R.id.container, Main);

        ft.commit();









    }



    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public static void startMapFragment(){
        MapFragment  mapFragment= new MapFragment();

         ft = fm.beginTransaction();
         ft.replace(R.id.container, mapFragment);
         ft.commit();
    }

    public static void startPICFragment(){
        PICFragment   picFragment= new PICFragment();

        ft = fm.beginTransaction();
        ft.replace(R.id.container, picFragment);
        ft.commit();
    }


    public static void startmainFragment(){
        MainFragment    mainFragment= new MainFragment();

        ft = fm.beginTransaction();
        ft.replace(R.id.container, mainFragment);
        ft.commit();
    }
}
