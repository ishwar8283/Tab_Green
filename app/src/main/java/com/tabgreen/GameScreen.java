package com.tabgreen;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;


public class GameScreen extends AppCompatActivity {

    @BindView(R.id.iv_back)
    ImageView iv_back;

    @BindView(R.id.tv_title_sub)
    TextView tv_title_sub;

    @BindView(R.id.your_score)
    TextView Prompt;

    @BindView(R.id.total_Score)
    TextView total_Score;

    @BindView(R.id.tab_One)
    Button tab_One;

    @BindView(R.id.tab_Two)
    Button tab_Two;

    @BindView(R.id.tab_Three)
    Button tab_Three;

    @BindView(R.id.tab_Four)
    Button tab_Four;

    @BindView(R.id.tab_Five)
    Button tab_Five;

    @BindView(R.id.tab_Six)
    Button tab_Six;

    @BindView(R.id.tab_Seven)
    Button tab_Seven;

    @BindView(R.id.tab_Eight)
    Button tab_Eight;

    @BindView(R.id.tab_Nine)
    Button tab_Nine;

    @BindView(R.id.tab_Ten)
    Button tab_Ten;

    @BindView(R.id.tab_Eleven)
    Button tab_Eleven;

    @BindView(R.id.tab_Twelve)
    Button tab_Twelve;

    @BindView(R.id.tab_13)
    Button tab_13;

    @BindView(R.id.tab_14)
    Button tab_14;

    @BindView(R.id.tab_15)
    Button tab_15;

    @BindView(R.id.tab_16)
    Button tab_16;

    @BindView(R.id.tv_timer)
    TextView tv_timer;


    Random randGen = new Random();
    Random r = new Random();
    ArrayList<int[]> randColor = new ArrayList<int[]>();
    ArrayList<String> colorNames = new ArrayList<String>();
    int counter = 0;
    int total = -1;
    MediaPlayer mp;
    private Context mContext;
    private Activity activity;
    private SessionManager sessionManager;
    private CountDownTimer countDownTimer;
    private boolean FlagStart=true;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        ButterKnife.bind(this);
        mContext=this;
        activity=this;

        sessionManager = new SessionManager(mContext);
        mp = MediaPlayer.create(this, R.raw.fart);
        colorNames.add("Red");colorNames.add("Green");colorNames.add("Blue");colorNames.add("Orange");

        tv_title_sub.setText("Don't miss the green color");

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        Prompt.setText("Score : "+String.valueOf(0));
        total_Score.setText("Best : "+sessionManager.getBestScore());

        updateInitial();

        tab_One.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(0)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });


        tab_Two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(1)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });

        tab_Three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(2)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });



        tab_Four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(3)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });

        tab_Five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(4)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });

        tab_Six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(5)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });

        tab_Seven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(6)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });

        tab_Eight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(7)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });

        tab_Nine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(8)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });

        tab_Ten.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(9)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });

        tab_Eleven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(10)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });

        tab_Twelve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(11)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });

        tab_13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(12)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });

        tab_14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(13)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();

                }
                else{
                    DialogGameOver();
                }
            }
        });
        tab_15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(14)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();
                }
                else{
                    DialogGameOver();
                }
            }
        });

        tab_16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(randColor.get(15)[3]==colorNames.indexOf("Green")){
                    counter++;
                    Prompt.setText("Score : "+String.valueOf(counter));
                    update();

                }
                else{
                    DialogGameOver();
                }
            }
        });


    }


    public void updateInitial(){

        randColor = new ArrayList<int[]>();
        randColor.add(new int[]{255,0,0,0});//red
        randColor.add(new int[]{0,255,0,1});//green
        randColor.add(new int[]{255,0,0,2});//blue
        randColor.add(new int[]{255,0,0,3});//orange

        randColor.add(new int[]{255,0,0,4});//orange
        randColor.add(new int[]{255,0,0,5});//parple
        randColor.add(new int[]{255,0,0,6});//parple
        randColor.add(new int[]{255,0,0,7});//blue

        randColor.add(new int[]{255,0,0,8});//orange
        randColor.add(new int[]{255,0,0,9});//parple
        randColor.add(new int[]{255,0,0,10});//parple
        randColor.add(new int[]{255,0,0,11});//blue

        randColor.add(new int[]{255,0,0,12});//orange
        randColor.add(new int[]{255,0,0,13});//parple
        randColor.add(new int[]{255,0,0,14});//parple
        randColor.add(new int[]{255,0,0,15});//blue

        Collections.shuffle(randColor);
        int nextColor = randGen.nextInt(4);
        int textColor =r.nextInt(4);
        tab_One.setBackgroundColor(Color.rgb(randColor.get(0)[0], randColor.get(0)[1], randColor.get(0)[2]));
        tab_Two.setBackgroundColor(Color.rgb(randColor.get(1)[0],randColor.get(1)[1],randColor.get(1)[2]));
        tab_Three.setBackgroundColor(Color.rgb(randColor.get(2)[0], randColor.get(2)[1], randColor.get(2)[2]));
        tab_Four.setBackgroundColor(Color.rgb(randColor.get(3)[0],randColor.get(3)[1],randColor.get(3)[2]));

        tab_Five.setBackgroundColor(Color.rgb(randColor.get(4)[0],randColor.get(4)[1],randColor.get(4)[2]));
        tab_Six.setBackgroundColor(Color.rgb(randColor.get(5)[0],randColor.get(5)[1],randColor.get(5)[2]));
        tab_Seven.setBackgroundColor(Color.rgb(randColor.get(6)[0],randColor.get(6)[1],randColor.get(6)[2]));
        tab_Eight.setBackgroundColor(Color.rgb(randColor.get(7)[0],randColor.get(7)[1],randColor.get(7)[2]));

        tab_Nine.setBackgroundColor(Color.rgb(randColor.get(8)[0],randColor.get(8)[1],randColor.get(8)[2]));
        tab_Ten.setBackgroundColor(Color.rgb(randColor.get(9)[0],randColor.get(9)[1],randColor.get(9)[2]));
        tab_Eleven.setBackgroundColor(Color.rgb(randColor.get(10)[0],randColor.get(10)[1],randColor.get(10)[2]));
        tab_Twelve.setBackgroundColor(Color.rgb(randColor.get(11)[0],randColor.get(11)[1],randColor.get(11)[2]));

        tab_13.setBackgroundColor(Color.rgb(randColor.get(12)[0],randColor.get(12)[1],randColor.get(12)[2]));
        tab_14.setBackgroundColor(Color.rgb(randColor.get(13)[0],randColor.get(13)[1],randColor.get(13)[2]));
        tab_15.setBackgroundColor(Color.rgb(randColor.get(14)[0],randColor.get(14)[1],randColor.get(14)[2]));
        tab_16.setBackgroundColor(Color.rgb(randColor.get(15)[0],randColor.get(15)[1],randColor.get(15)[2]));

    }

    public void update(){
        if(FlagStart){
            tv_timer.setVisibility(View.VISIBLE);
            FlagStart=false;
            countDownTimer = new CountDownTimer(30000, 1000) {//180000
                @Override
                public void onTick(long millisUntilFinished) {
                    try{
                        tv_timer.setText("Remaining time = "+String.format("%d min, %d sec",
                                TimeUnit.MILLISECONDS.toMinutes( millisUntilFinished),
                                TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));

                        int seconds = (int) (millisUntilFinished / 1000) % 60 ;
                        int minutes = (int) ((millisUntilFinished / (1000*60)) % 60);

                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        long[] pattern = {0, 100, 1000, 100, 1000,100, 1000};
                        Animation anim = new AlphaAnimation(0.0f, 1.0f);
                        if(minutes==0 && seconds<=1){
                            anim.cancel();
                        }
                        if(minutes==0 && seconds<6) {
                            anim.setDuration(50);
                            anim.setStartOffset(20);
                            anim.setRepeatMode(Animation.REVERSE);
                            anim.setRepeatCount(Animation.RESTART);
                            tv_timer.startAnimation(anim);
                            anim.cancel();

                            if (Build.VERSION.SDK_INT >= 26) {
                                VibrationEffect vibrationEffect = VibrationEffect.createWaveform(pattern, -1);
                                v.vibrate(vibrationEffect);
                            } else {
                                v.vibrate(pattern, -1);
                            }
                        }

                    }catch (Exception ignored){
                        tv_timer.setVisibility(View.GONE);
                    }

                }

                @Override
                public void onFinish() {
                    tv_timer.setText("Time Over");
                    FlagStart=false;
                    DialogGameOver();
                }
            }.start();


        }


        if(counter<5){
            randColor = new ArrayList<int[]>();
            randColor.add(new int[]{255,0,0,0});//red
            randColor.add(new int[]{0,255,0,1});//green
            randColor.add(new int[]{255,0,0,2});//blue
            randColor.add(new int[]{255,0,0,3});//orange

            randColor.add(new int[]{255,0,0,4});//orange
            randColor.add(new int[]{255,0,0,5});//parple
            randColor.add(new int[]{255,0,0,6});//parple
            randColor.add(new int[]{255,0,0,7});//blue

            randColor.add(new int[]{255,0,0,8});//orange
            randColor.add(new int[]{255,0,0,9});//parple
            randColor.add(new int[]{255,0,0,10});//parple
            randColor.add(new int[]{255,0,0,11});//blue

            randColor.add(new int[]{255,0,0,12});//orange
            randColor.add(new int[]{255,0,0,13});//parple
            randColor.add(new int[]{255,0,0,14});//parple
            randColor.add(new int[]{255,0,0,15});//blue
        }else if(counter>=5 && counter<10){
            randColor = new ArrayList<int[]>();
            randColor.add(new int[]{255,0,0,0});//red
            randColor.add(new int[]{0,255,0,1});//green
            randColor.add(new int[]{0,0,255,2});//blue
            randColor.add(new int[]{0,0,255,3});//orange

            randColor.add(new int[]{0,0,255,4});//orange
            randColor.add(new int[]{0,0,255,5});//parple
            randColor.add(new int[]{0,0,255,6});//parple
            randColor.add(new int[]{0,0,255,7});//blue

            randColor.add(new int[]{0,0,255,8});//orange
            randColor.add(new int[]{255,0,0,9});//parple
            randColor.add(new int[]{255,0,0,10});//parple
            randColor.add(new int[]{255,0,0,11});//blue

            randColor.add(new int[]{255,0,0,12});//orange
            randColor.add(new int[]{255,0,0,13});//parple
            randColor.add(new int[]{255,0,0,14});//parple
            randColor.add(new int[]{255,0,0,15});//blue
        }else if(counter>=10 && counter<15){
            randColor = new ArrayList<int[]>();
            randColor.add(new int[]{255,0,0,0});//red
            randColor.add(new int[]{0,255,0,1});//green
            randColor.add(new int[]{0,0,255,2});//blue
            randColor.add(new int[]{255,127,0,3});//orange

            randColor.add(new int[]{0,0,255,4});//orange
            randColor.add(new int[]{0,0,255,5});//parple
            randColor.add(new int[]{0,0,255,6});//parple
            randColor.add(new int[]{0,0,255,7});//blue

            randColor.add(new int[]{255,127,0,8});//orange
            randColor.add(new int[]{255,127,0,9});//parple
            randColor.add(new int[]{255,127,0,10});//parple
            randColor.add(new int[]{255,127,0,11});//blue

            randColor.add(new int[]{255,0,0,12});//orange
            randColor.add(new int[]{255,0,0,13});//parple
            randColor.add(new int[]{255,0,0,14});//parple
            randColor.add(new int[]{255,0,0,15});//blue
        }else if(counter>=15 && counter<20){
            randColor = new ArrayList<int[]>();
            randColor.add(new int[]{255,0,0,0});//red
            randColor.add(new int[]{0,255,0,1});//green
            randColor.add(new int[]{0,0,255,2});//blue
            randColor.add(new int[]{255,127,0,3});//orange

            randColor.add(new int[]{144,12,63,4});//orange
            randColor.add(new int[]{0,0,255,5});//parple
            randColor.add(new int[]{0,0,255,6});//parple
            randColor.add(new int[]{0,0,255,7});//blue

            randColor.add(new int[]{255,127,0,8});//orange
            randColor.add(new int[]{255,127,0,9});//parple
            randColor.add(new int[]{255,127,0,10});//parple
            randColor.add(new int[]{144,12,63,11});//blue

            randColor.add(new int[]{144,12,63,12});//orange
            randColor.add(new int[]{144,12,63,13});//parple
            randColor.add(new int[]{255,0,0,14});//parple
            randColor.add(new int[]{255,0,0,15});//blue
        }else if(counter>=20 && counter<25){
            randColor = new ArrayList<int[]>();
            randColor.add(new int[]{255,0,0,0});//red
            randColor.add(new int[]{0,255,0,1});//green
            randColor.add(new int[]{0,0,255,2});//blue
            randColor.add(new int[]{255,127,0,3});//orange

            randColor.add(new int[]{255,0,0,0,4});//orange
            randColor.add(new int[]{0,0,255,5});//parple
            randColor.add(new int[]{0,0,255,6});//parple
            randColor.add(new int[]{165,105,189,7});//blue

            randColor.add(new int[]{255,127,0,8});//orange
            randColor.add(new int[]{255,127,0,9});//parple
            randColor.add(new int[]{255,0,0,10});//parple
            randColor.add(new int[]{144,12,63,11});//blue

            randColor.add(new int[]{144,12,63,12});//orange
            randColor.add(new int[]{144,12,63,13});//parple
            randColor.add(new int[]{165,105,189,14});//parple
            randColor.add(new int[]{165,105,189,15});//blue
        }else if(counter>=25 && counter<30){
            randColor = new ArrayList<int[]>();
            randColor.add(new int[]{255,0,0,0});//red
            randColor.add(new int[]{0,255,0,1});//green
            randColor.add(new int[]{0,0,255,2});//blue
            randColor.add(new int[]{255,127,0,3});//orange

            randColor.add(new int[]{244,208,63,4});//orange
            randColor.add(new int[]{0,0,255,5});//parple
            randColor.add(new int[]{0,0,255,6});//parple
            randColor.add(new int[]{165,105,189,7});//blue

            randColor.add(new int[]{255,127,0,8});//orange
            randColor.add(new int[]{255,127,0,9});//parple
            randColor.add(new int[]{255,0,0,10});//parple
            randColor.add(new int[]{144,12,63,11});//blue

            randColor.add(new int[]{144,12,63,12});//orange
            randColor.add(new int[]{144,12,63,13});//parple
            randColor.add(new int[]{165,105,189,14});//parple
            randColor.add(new int[]{244,208,63,15});//blue
        }else if(counter>=30 && counter<35){
            randColor = new ArrayList<int[]>();
            randColor.add(new int[]{255,0,0,0});//red
            randColor.add(new int[]{0,255,0,1});//green
            randColor.add(new int[]{0,0,255,2});//blue
            randColor.add(new int[]{255,127,0,3});//orange

            randColor.add(new int[]{244,208,63,4});//orange
            randColor.add(new int[]{0,0,255,5});//parple
            randColor.add(new int[]{63,244,241,6});//parple
            randColor.add(new int[]{165,105,189,7});//blue

            randColor.add(new int[]{63,244,241,8});//orange
            randColor.add(new int[]{255,127,0,9});//parple
            randColor.add(new int[]{255,0,0,10});//parple
            randColor.add(new int[]{144,12,63,11});//blue

            randColor.add(new int[]{144,12,63,12});//orange
            randColor.add(new int[]{144,12,63,13});//parple
            randColor.add(new int[]{165,105,189,14});//parple
            randColor.add(new int[]{244,208,63,15});//blue
        }else if(counter>=35 && counter<40){
            randColor = new ArrayList<int[]>();
            randColor.add(new int[]{255,0,0,0});//red
            randColor.add(new int[]{0,255,0,1});//green
            randColor.add(new int[]{0,0,255,2});//blue
            randColor.add(new int[]{255,127,0,3});//orange

            randColor.add(new int[]{244,208,63,4});//orange
            randColor.add(new int[]{244,63,115,5});//parple
            randColor.add(new int[]{63,244,241,6});//parple
            randColor.add(new int[]{165,105,189,7});//blue

            randColor.add(new int[]{63,244,241,8});//orange
            randColor.add(new int[]{255,127,0,9});//parple
            randColor.add(new int[]{255,0,0,10});//parple
            randColor.add(new int[]{144,12,63,11});//blue

            randColor.add(new int[]{144,12,63,12});//orange
            randColor.add(new int[]{144,12,63,13});//parple
            randColor.add(new int[]{244,63,115,14});//parple
            randColor.add(new int[]{244,208,63,15});//blue
        }else if(counter>=40 && counter<45){
            randColor = new ArrayList<int[]>();
            randColor.add(new int[]{255,0,0,0});//red
            randColor.add(new int[]{0,255,0,1});//green
            randColor.add(new int[]{0,0,255,2});//blue
            randColor.add(new int[]{255,127,0,3});//orange

            randColor.add(new int[]{244,208,63,4});//orange
            randColor.add(new int[]{244,63,115,5});//parple
            randColor.add(new int[]{63,244,241,6});//parple
            randColor.add(new int[]{165,105,189,7});//blue

            randColor.add(new int[]{63,244,241,8});//orange
            randColor.add(new int[]{255,127,0,9});//parple
            randColor.add(new int[]{255,0,0,10});//parple
            randColor.add(new int[]{144,12,63,11});//blue

            randColor.add(new int[]{78,75,89,12});//orange
            randColor.add(new int[]{144,12,63,13});//parple
            randColor.add(new int[]{244,63,115,14});//parple
            randColor.add(new int[]{78,75,89,15});//blue
        }else if(counter>=45 && counter<=50){
            randColor = new ArrayList<int[]>();
            randColor.add(new int[]{143,188,143,0});//red
            randColor.add(new int[]{0,255,0,1});//green
            randColor.add(new int[]{0,0,255,2});//blue
            randColor.add(new int[]{255,127,0,3});//orange

            randColor.add(new int[]{244,208,63,4});//orange
            randColor.add(new int[]{244,63,115,5});//parple
            randColor.add(new int[]{63,244,241,6});//parple
            randColor.add(new int[]{165,105,189,7});//blue

            randColor.add(new int[]{63,244,241,8});//orange
            randColor.add(new int[]{255,127,0,9});//parple
            randColor.add(new int[]{143,188,143,10});//parple
            randColor.add(new int[]{144,12,63,11});//blue

            randColor.add(new int[]{78,75,89,12});//orange
            randColor.add(new int[]{144,12,63,13});//parple
            randColor.add(new int[]{244,63,115,14});//parple
            randColor.add(new int[]{78,75,89,15});//blue
        }else if(counter>=50 && counter<55){
            randColor = new ArrayList<int[]>();
            randColor.add(new int[]{143,188,143,0});//red
            randColor.add(new int[]{0,255,0,1});//green
            randColor.add(new int[]{0,0,255,2});//blue
            randColor.add(new int[]{255,127,0,3});//orange

            randColor.add(new int[]{244,208,63,4});//orange
            randColor.add(new int[]{244,63,115,5});//parple
            randColor.add(new int[]{63,244,241,6});//parple
            randColor.add(new int[]{165,105,189,7});//blue

            randColor.add(new int[]{63,244,241,8});//orange
            randColor.add(new int[]{75,173,173,9});//parple
            randColor.add(new int[]{143,188,143,10});//parple
            randColor.add(new int[]{144,12,63,11});//blue

            randColor.add(new int[]{78,75,89,12});//orange
            randColor.add(new int[]{144,12,63,13});//parple
            randColor.add(new int[]{244,63,115,14});//parple
            randColor.add(new int[]{78,75,89,15});//blue
        }else if(counter>=55 ){
            randColor = new ArrayList<int[]>();
            randColor.add(new int[]{255,0,0,0});//red
            randColor.add(new int[]{0,255,0,1});//green
            randColor.add(new int[]{0,0,255,2});//blue
            randColor.add(new int[]{255,127,0,3});//orange

            randColor.add(new int[]{144,12,63,4});//orange
            randColor.add(new int[]{165,105,189,5});//parple
            randColor.add(new int[]{244,208,63,6});//parple
            randColor.add(new int[]{63,244,241,7});//blue

            randColor.add(new int[]{244,63,115,8});//orange
            randColor.add(new int[]{78,75,89,9});//parple
            randColor.add(new int[]{143,188,143,10});//parple
            randColor.add(new int[]{75,173,173,11});//blue

            randColor.add(new int[]{239,243,9,12});//orange
            randColor.add(new int[]{190,123,38,13});//parple
            randColor.add(new int[]{173,193,93,14});//parple
            randColor.add(new int[]{173,255,47,15});//blue
        }


        Collections.shuffle(randColor);
        int nextColor = randGen.nextInt(4);
        int textColor =r.nextInt(4);
        tab_One.setBackgroundColor(Color.rgb(randColor.get(0)[0], randColor.get(0)[1], randColor.get(0)[2]));
        tab_Two.setBackgroundColor(Color.rgb(randColor.get(1)[0],randColor.get(1)[1],randColor.get(1)[2]));
        tab_Three.setBackgroundColor(Color.rgb(randColor.get(2)[0], randColor.get(2)[1], randColor.get(2)[2]));
        tab_Four.setBackgroundColor(Color.rgb(randColor.get(3)[0],randColor.get(3)[1],randColor.get(3)[2]));

        tab_Five.setBackgroundColor(Color.rgb(randColor.get(4)[0],randColor.get(4)[1],randColor.get(4)[2]));
        tab_Six.setBackgroundColor(Color.rgb(randColor.get(5)[0],randColor.get(5)[1],randColor.get(5)[2]));
        tab_Seven.setBackgroundColor(Color.rgb(randColor.get(6)[0],randColor.get(6)[1],randColor.get(6)[2]));
        tab_Eight.setBackgroundColor(Color.rgb(randColor.get(7)[0],randColor.get(7)[1],randColor.get(7)[2]));

        tab_Nine.setBackgroundColor(Color.rgb(randColor.get(8)[0],randColor.get(8)[1],randColor.get(8)[2]));
        tab_Ten.setBackgroundColor(Color.rgb(randColor.get(9)[0],randColor.get(9)[1],randColor.get(9)[2]));
        tab_Eleven.setBackgroundColor(Color.rgb(randColor.get(10)[0],randColor.get(10)[1],randColor.get(10)[2]));
        tab_Twelve.setBackgroundColor(Color.rgb(randColor.get(11)[0],randColor.get(11)[1],randColor.get(11)[2]));

        tab_13.setBackgroundColor(Color.rgb(randColor.get(12)[0],randColor.get(12)[1],randColor.get(12)[2]));
        tab_14.setBackgroundColor(Color.rgb(randColor.get(13)[0],randColor.get(13)[1],randColor.get(13)[2]));
        tab_15.setBackgroundColor(Color.rgb(randColor.get(14)[0],randColor.get(14)[1],randColor.get(14)[2]));
        tab_16.setBackgroundColor(Color.rgb(randColor.get(15)[0],randColor.get(15)[1],randColor.get(15)[2]));

    }


    private void DialogGameOver() {
        final Dialog dialogMsg = new Dialog(mContext);
        dialogMsg.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogMsg.setContentView(R.layout.dialog_game);
        dialogMsg.setCancelable(false);
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialogMsg.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.gravity = Gravity.CENTER;
        dialogMsg.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialogMsg.getWindow().setAttributes(lp);
        dialogMsg.show();

        TextView tv_score = dialogMsg.findViewById(R.id.tv_score);
        TextView tv_best = dialogMsg.findViewById(R.id.tv_best);
        TextView tv_Share = dialogMsg.findViewById(R.id.tv_Share);
        TextView tv_Cancel = dialogMsg.findViewById(R.id.tv_Cancel);
        TextView tv_play_Again = dialogMsg.findViewById(R.id.tv_play_Again);
        FlagStart=true;

        mp.start();

        try{
            if(countDownTimer!=null)
            countDownTimer.cancel();
        }catch (Exception e){

        }

        tv_score.setText(String.valueOf(counter));
        tv_best.setText(String.valueOf(sessionManager.getBestScore()));

        if(sessionManager.getBestScore()<=counter){
            sessionManager.setBestScore(counter);
            //total_Score.setText("Best : "+String.valueOf(sessionManager.getBestScore()));
            //tv_best.setText(String.valueOf(sessionManager.getBestScore()));
        }

        tv_play_Again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogMsg.dismiss();
                counter = 0;
                total = -1;
                Prompt.setText("Score : "+String.valueOf(0));
                total_Score.setText("Best : "+String.valueOf(sessionManager.getBestScore()));
                tv_timer.setVisibility(View.GONE);
                updateInitial();
            }
        });

        tv_Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogMsg.dismiss();
                finish();
            }
        });

        tv_Share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogMsg.dismiss();
                String shareBody = "Today's my score is "+String.valueOf(counter);
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                activity.startActivity(Intent.createChooser(sharingIntent, "Choose any one"));
            }
        });

    }


    @Override
    public void onBackPressed() {

        if(counter>0){
            DialogGameOver();
        }else{
            super.onBackPressed();
            finish();
        }
    }
}

