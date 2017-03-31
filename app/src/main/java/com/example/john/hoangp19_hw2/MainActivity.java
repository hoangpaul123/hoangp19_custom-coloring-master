package com.example.john.hoangp19_hw2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;
import static android.graphics.Color.blue;
import static android.graphics.Color.green;
import static android.graphics.Color.red;
import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity{
    public static SeekBar redSeek, greenSeek, blueSeek;
    public static TextView redVal, greenVal, blueVal, element;
    private AppSurfaceView mySurfaceView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {            //please view in landscape
        super.onCreate(savedInstanceState);                         //please view in landscape
        setContentView(R.layout.activity_main);                     //please view in landscape
                                                                    //please view in landscape
        mySurfaceView = (AppSurfaceView) findViewById(R.id.SurfaceViewPic);
                                                                    //please view in landscape
        redSeek		= (SeekBar)findViewById(R.id.RedSeek);          //please view in landscape
        if(redSeek == null){                                        //please view in landscape
            Log.i("red seek", "null");}                             //please view in landscape
        greenSeek	= (SeekBar)findViewById(R.id.GreenSeek);        //please view in landscape
        blueSeek 	= (SeekBar)findViewById(R.id.BlueSeek);         //please view in landscape

        redVal 	= (TextView)findViewById(R.id.redValue);
        greenVal= (TextView)findViewById(R.id.greenValue);
        blueVal = (TextView)findViewById(R.id.blueValue);
        element	= (TextView)findViewById(R.id.elementName);

        redSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar arg0) {}

            @Override
            public void onStartTrackingTouch(SeekBar arg0) {}

            @Override
            public void onProgressChanged(SeekBar arg0, int progress, boolean arg2) {
                redVal.setText("" + redSeek.getProgress());
                if(mySurfaceView.numberElement == 1) {
                    mySurfaceView.moon.setColor(rgb(redSeek.getProgress(),
                            green(mySurfaceView.moon.getColor()), blue(mySurfaceView.moon.getColor())));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 2){
                    mySurfaceView.building.setColor(rgb(redSeek.getProgress(),
                            green(mySurfaceView.building.getColor()), blue(mySurfaceView.building.getColor())));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 3){
                    mySurfaceView.tree.setColor(rgb(redSeek.getProgress(),
                            green(mySurfaceView.tree.getColor()), blue(mySurfaceView.tree.getColor())));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 4){
                    mySurfaceView.star.setColor(rgb(redSeek.getProgress(),
                            green(mySurfaceView.star.getColor()), blue(mySurfaceView.star.getColor())));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 5){
                    mySurfaceView.ball.setColor(rgb(redSeek.getProgress(),
                            green(mySurfaceView.ball.getColor()), blue(mySurfaceView.ball.getColor())));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 6){
                    mySurfaceView.box.setColor(rgb(redSeek.getProgress(),
                            green(mySurfaceView.box.getColor()), blue(mySurfaceView.box.getColor())));
                    mySurfaceView.invalidate();
                }
            }
        });


        greenSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar arg0) {}

            @Override
            public void onStartTrackingTouch(SeekBar arg0) {}

            @Override
            public void onProgressChanged(SeekBar arg0, int progress, boolean arg2) {
                greenVal.setText("" + greenSeek.getProgress());
                if(mySurfaceView.numberElement == 1) {
                    mySurfaceView.moon.setColor(rgb(red(mySurfaceView.moon.getColor()),
                            greenSeek.getProgress(), blue(mySurfaceView.moon.getColor())));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 2){
                    mySurfaceView.building.setColor(rgb(red(mySurfaceView.building.getColor()),
                            greenSeek.getProgress(), blue(mySurfaceView.building.getColor())));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 3){
                    mySurfaceView.tree.setColor(rgb(red(mySurfaceView.tree.getColor()),
                            greenSeek.getProgress(), blue(mySurfaceView.tree.getColor())));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 4){
                    mySurfaceView.star.setColor(rgb(red(mySurfaceView.star.getColor()),
                            greenSeek.getProgress(), blue(mySurfaceView.star.getColor())));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 5){
                    mySurfaceView.ball.setColor(rgb(red(mySurfaceView.ball.getColor()),
                            greenSeek.getProgress(), blue(mySurfaceView.ball.getColor())));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 6){
                    mySurfaceView.box.setColor(rgb(red(mySurfaceView.box.getColor()),
                            greenSeek.getProgress(), blue(mySurfaceView.box.getColor())));
                    mySurfaceView.invalidate();
                }
            }
        });

        blueSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar arg0) {}

            @Override
            public void onStartTrackingTouch(SeekBar arg0) {}

            @Override
            public void onProgressChanged(SeekBar arg0, int progress, boolean arg2) {
                blueVal.setText("" + blueSeek.getProgress());
                if(mySurfaceView.numberElement == 1) {
                    mySurfaceView.moon.setColor(rgb(red(mySurfaceView.moon.getColor()),
                            green(mySurfaceView.moon.getColor()), blueSeek.getProgress()));

                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 2){
                    mySurfaceView.building.setColor(rgb(red(mySurfaceView.building.getColor()),
                            green(mySurfaceView.building.getColor()), blueSeek.getProgress()));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 3){
                    mySurfaceView.tree.setColor(rgb(red(mySurfaceView.tree.getColor()),
                            green(mySurfaceView.tree.getColor()), blueSeek.getProgress()));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 4){
                    mySurfaceView.star.setColor(rgb(red(mySurfaceView.star.getColor()),
                            green(mySurfaceView.star.getColor()), blueSeek.getProgress()));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 5){
                    mySurfaceView.ball.setColor(rgb(red(mySurfaceView.ball.getColor()),
                            green(mySurfaceView.ball.getColor()), blueSeek.getProgress()));
                    mySurfaceView.invalidate();
                }
                else if(mySurfaceView.numberElement == 6){
                    mySurfaceView.box.setColor(rgb(red(mySurfaceView.box.getColor()),
                            green(mySurfaceView.box.getColor()), blueSeek.getProgress()));
                    mySurfaceView.invalidate();
                }
            }
        });
    }


}
