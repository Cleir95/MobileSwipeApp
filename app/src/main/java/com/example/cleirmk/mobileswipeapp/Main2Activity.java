package com.example.cleirmk.mobileswipeapp;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    int score = 0;
    boolean touched;
    int secondsleft;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    CountDownTimer timer;
    {
        timer = new CountDownTimer(60000, 1000) {

            @Override
            public void onTick(long timeleft) {
               secondsleft = (int) (timeleft/1000);

            }

            @Override
            public void onFinish() {
                Log.v("asf", "timer");

            }
        };

    }


    public static Point getTouchPositionFromDragEvent( MotionEvent event) {
        Rect rItem = new Rect();
        return new Point(rItem.left + Math.round(event.getX()), rItem.top + Math.round(event.getY()));

    }

    //find the difference between drag and motion event


        public boolean onTouchEvent( MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    //etc etc. do some stuff with the drag event
                    Log.v("dfdfs","dkjfksdjkfaj");
                    break;
                case MotionEvent.ACTION_UP:
                    Point touchPosition = getTouchPositionFromDragEvent( event);
                    //do something with the position (a scroll i.e);
                    Log.v("dfdfs","this also");
                    break;

                default:
            }
            return true;
        }

   /*
           public boolean onTouchEvent(MotionEvent event) {
           if (action) {
           score++;}
           else if () {displayScore;}
           else (){timer.start()
           }
           }
           */


    }






