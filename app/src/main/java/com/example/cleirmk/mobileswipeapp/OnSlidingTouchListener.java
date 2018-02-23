package com.example.cleirmk.mobileswipeapp;


import android.content.Context;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class OnSlidingTouchListener implements OnTouchListener {

    private final GestureDetector gestureDetector;

    public OnSlidingTouchListener(Context context){
        gestureDetector = new GestureDetector(context, new GestureListener());
    }
    public boolean onTouch(View v, MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }

    private final class GestureListener extends SimpleOnGestureListener {

        private final String TAG = GestureListener.class.getSimpleName();

        private static final int SLIDE_THRESHOLD = 100;

        @Override
        public boolean onDown(MotionEvent e) {
           /* float x1= e.getX();
            float y1 =e.getY();

            Log.d("start","" + x1 + "" + y1);

            if ( e.getAction()== MotionEvent.ACTION_MOVE){

                float x2= e.getX();
                float y2 =e.getY();

                Log.d("current","" + x2 + "" + y2);

            }*/

            return true;
        }




        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            return onClick();
        }

        @Override
        public void onLongPress(MotionEvent e) {
            onLongClick();
        }












        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            try {

                float deltaY = e2.getY() - e1.getY();
                float deltaX = e2.getX() - e1.getX();


                if (Math.abs(deltaX) > Math.abs(deltaY)) {
                    if (Math.abs(deltaX) > SLIDE_THRESHOLD) {
                        if (deltaX > 0) {
                            Log.d("right","" +  + "" );
                            // the user made a sliding right gesture
                            Log.v("slideR", "right");

                            return onSlideRight();
                        } else {
                            // the user made a sliding left gesture
                            Log.v("slideR", "Left");
                            return onSlideLeft();
                        }
                    }
                } else {
                    if (Math.abs(deltaY) > SLIDE_THRESHOLD) {
                        if (deltaY > 0 ) {

                                // the user made a sliding down gesture
                                Log.v("slideR", "down");
                                return onSlideDown();

                        } else {
                            // the user made a sliding up gesture
                            Log.v("slideR", "up");
                            return onSlideUp();
                        }
                    }
                }
            } catch (Exception exception) {
                Log.e(TAG, exception.getMessage());
            }

            return false;
        }
    }

    public boolean onClick() {
        return false;
    }

    public boolean onLongClick() {
        return false;
    }

    public boolean onSlideRight() {
        return true;
    }

    public boolean onSlideLeft() {
        return true;
    }

    public boolean onSlideUp() {
        return true;
    }

    public boolean onSlideDown() {
        return true;
    }
}