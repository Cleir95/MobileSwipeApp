package com.example.cleirmk.mobileswipeapp;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.CountDownTimer;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Switch;

public class Main2Activity extends AppCompatActivity {

    int score = 0;
    boolean touched;
    int secondsleft;



    private GestureDetectorCompat mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        View myView = (View) findViewById(R.id.myView);
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


   /* public static Point getTouchPositionFromDragEvent( MotionEvent event) {
        Rect rItem = new Rect();
        return new Point(rItem.left + Math.round(event.getX()), rItem.top + Math.round(event.getY()));

    }

    //find the difference between drag and motion event
    private static final String DEBUG_TAG = "Gestures";

    //@Override
    public boolean onTouch(int screenX, int screenY){


        return true;}




    public  boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX,
                            float distanceY) {
        Log.d(DEBUG_TAG, "onScroll: " + event1.toString() + event2.toString());
        return true;
    }


*/

    public boolean onTouchEvent( MotionEvent event) {


        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN: {
                // Find the index of the active pointer and fetch its position
               final float x = event.getX();
                final float y = event.getY();
                Log.d("start", "" + x + "" + y);



                break;
            }


            case MotionEvent.ACTION_MOVE: {

                // Find the index of the active pointer and fetch its position
                final float x2 = event.getX();
                final float y2 = event.getY();

                Log.d("current", "" + x2 + "" + y2);



            }
        }

        return true;
    }

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


   /* switch (event.getAction()) {
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

    */







