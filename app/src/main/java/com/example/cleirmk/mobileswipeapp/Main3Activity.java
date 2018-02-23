package com.example.cleirmk.mobileswipeapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class Main3Activity extends AppCompatActivity {
int score=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        View myView = (View) findViewById(R.id.myView);
        myView.setOnTouchListener(new com.example.cleirmk.mobileswipeapp.OnSlidingTouchListener(this) {
            @Override
            public boolean onSlideLeft() {
                Log.d("left","" + score + "" );
                return true;
            }

            @Override
            public boolean onSlideRight() {
                Log.d("right","" + score + "" );


                return true;
            }

            @Override
            public boolean onSlideUp() {

score++;
                Log.d("up","" + score + "" );

                return true;
            }

            @Override
            public boolean onSlideDown() {
               score++;
                Log.d("down","" + score + "" );
                return true;
            }




        });
    }
}






