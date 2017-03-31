package com.example.john.hoangp19_hw2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;

import static android.graphics.Color.blue;
import static android.graphics.Color.green;
import static android.graphics.Color.red;

/**
 * Created by Paul Hoang on 3/25/17.
 */

public class AppSurfaceView extends SurfaceView implements View.OnTouchListener{
    public CustomCircle moon;
    public CustomRect building;
    public CustomTree tree;
    public CustomStar star;
    public CustomCircle ball;
    public CustomRect box;
    private int width, height;
    public int numberElement;



    public AppSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);

        //using this makes the SurfaceView coordinates relative to the size of the Surface View
        WindowManager display = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        Display view = display.getDefaultDisplay();
        Point size = new Point();
        view.getSize(size);
        width = size.x;
        height = size.y;

        this.setOnTouchListener(this);

        moon 	= new CustomCircle("Moon", 0xFFE3DEDB, 24*width/25 , 1*height/8,250);
        building 	= new CustomRect("Building", 0xFF8B8D7A,2*width/11,height/6,width/3,height);
        tree = new CustomTree("Tree", 0xFF04FF2F,2*width/4,height/9,width/2);
        star 	= new CustomStar("Star", 0xFFFFFFFF,width/2, 2*height /9,150);
        ball = new CustomCircle("Ball",0xFFE3DEDB,width/2,4*height/5,100);
        box = new CustomRect("box",0xFFD2691E,width/19,7*height/9, width/7,5*height);
    }

    @Override
    public void onDraw(Canvas canvas) {
        //this sets the entire background black to resemble a night sky
        Paint nightTime = new Paint();
        int darkness = Color.rgb(25,25,112);
        nightTime.setColor(darkness);
        canvas.drawRect(0,0,width,height,nightTime);

        //this makes the trunk for the pine tree
        Paint trunk = new Paint();
        int trunkColor = Color.rgb(139,69,19);
        trunk.setColor(trunkColor);
        canvas.drawRect(4*width/5,4*height/7,7*width/10,5*height,trunk);

        moon.drawMe(canvas);
        building.drawMe(canvas);
        tree.drawMe(canvas);
        star.drawMe(canvas);
        ball.drawMe(canvas);
        box.drawMe(canvas);

        if(numberElement == 1) {
            moon.drawHighlight(canvas);
        }
        else if(numberElement == 2) {
            building.drawHighlight(canvas);
        }
        else if(numberElement == 3) {
            tree.drawHighlight(canvas);
        }
        else if(numberElement == 4) {
            star.drawHighlight(canvas);
        }
        else if(numberElement == 5) {
            ball.drawHighlight(canvas);
        }
        else if(numberElement == 6) {
            box.drawHighlight(canvas);
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if(event.getActionMasked() == MotionEvent.ACTION_DOWN) {
            if (moon.containsPoint((int) event.getX(), (int) event.getY())) {
                numberElement = 1;
                MainActivity.redSeek.setProgress(red(moon.getColor()));
                MainActivity.redVal.setText("" + red(moon.getColor()));
                MainActivity.greenSeek.setProgress(green(moon.getColor()));
                MainActivity.greenVal.setText("" + green(moon.getColor()));
                MainActivity.blueSeek.setProgress(blue(moon.getColor()));
                MainActivity.blueVal.setText("" + blue(moon.getColor()));
                MainActivity.element.setText(moon.getName());
                invalidate();
            } else if (building.containsPoint((int) event.getX(), (int) event.getY())) {
                numberElement = 2;
                MainActivity.redSeek.setProgress(red(building.getColor()));
                MainActivity.redVal.setText("" + red(building.getColor()));
                MainActivity.greenSeek.setProgress(green(building.getColor()));
                MainActivity.greenVal.setText("" + green(building.getColor()));
                MainActivity.blueSeek.setProgress(blue(building.getColor()));
                MainActivity.blueVal.setText("" + blue(building.getColor()));
                MainActivity.element.setText(building.getName());
                invalidate();
            } else if (tree.containsPoint((int) event.getX(), (int) event.getY())) {
                numberElement = 3;
                MainActivity.redSeek.setProgress(red(tree.getColor()));
                MainActivity.redVal.setText("" + red(tree.getColor()));
                MainActivity.greenSeek.setProgress(green(tree.getColor()));
                MainActivity.greenVal.setText("" + green(tree.getColor()));
                MainActivity.blueSeek.setProgress(blue(tree.getColor()));
                MainActivity.blueVal.setText("" + blue(tree.getColor()));
                MainActivity.element.setText(tree.getName());
                invalidate();
            } else if (star.containsPoint((int) event.getX(), (int) event.getY())) {
                numberElement = 4;
                MainActivity.redSeek.setProgress(red(star.getColor()));
                MainActivity.redVal.setText("" + red(star.getColor()));
                MainActivity.greenSeek.setProgress(green(star.getColor()));
                MainActivity.greenVal.setText("" + green(star.getColor()));
                MainActivity.blueSeek.setProgress(blue(star.getColor()));
                MainActivity.blueVal.setText("" + blue(star.getColor()));
                MainActivity.element.setText(star.getName());
                invalidate();
            } else if (ball.containsPoint((int) event.getX(), (int) event.getY())) {
                numberElement = 5;
                MainActivity.redSeek.setProgress(red(ball.getColor()));
                MainActivity.redVal.setText("" + red(ball.getColor()));
                MainActivity.greenSeek.setProgress(green(ball.getColor()));
                MainActivity.greenVal.setText("" + green(ball.getColor()));
                MainActivity.blueSeek.setProgress(blue(ball.getColor()));
                MainActivity.blueVal.setText("" + blue(ball.getColor()));
                MainActivity.element.setText(ball.getName());
                invalidate();
            } else if (box.containsPoint((int) event.getX(), (int) event.getY())) {
                numberElement = 6;
                MainActivity.redSeek.setProgress(red(box.getColor()));
                MainActivity.redVal.setText("" + red(box.getColor()));
                MainActivity.greenSeek.setProgress(green(box.getColor()));
                MainActivity.greenVal.setText("" + green(box.getColor()));
                MainActivity.blueSeek.setProgress(blue(box.getColor()));
                MainActivity.blueVal.setText("" + blue(box.getColor()));
                MainActivity.element.setText(box.getName());
                invalidate();
            }
        }
        return true;
    }

}
