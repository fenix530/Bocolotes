package com.example.diegoorozco.bocolotes;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragmentemaager= getFragmentManager();
        FragmentTransaction fragmentradaction= fragmentemaager.beginTransaction();

        BocolotesFragment fragment= new BocolotesFragment();
        fragmentradaction.add(android.R.id.content, fragment).commit();


    }

    @Override
    public void onBackPressed() {

        FragmentManager fragmentemaager = getFragmentManager();
        FragmentTransaction fragmentradaction = fragmentemaager.beginTransaction();
        BocolotesFragment fragment = new BocolotesFragment();
        fragmentradaction.replace(android.R.id.content, fragment).commit();

    }
}