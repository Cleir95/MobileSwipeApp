package com.example.cleirmk.mobileswipeapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        View myView = (View) findViewById(R.id.myView);
        myView.setOnTouchListener(new com.example.cleirmk.mobileswipeapp.OnSlidingTouchListener(this) {
            @Override
            public boolean onSlideLeft() {
                // do something
                return true;
            }

            @Override
            public boolean onSlideRight() {
                // do something
                return true;
            }

            @Override
            public boolean onSlideUp() {
                // do something

                Log.v("fogfigdu","slideup");
                return true;
            }

            @Override
            public boolean onSlideDown() {
                Log.v("fogfigdu","slidedown");
                // do something
                return true;
            }
        });
    }
}






