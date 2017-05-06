package com.example.toanncth.quizapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button start,unmute,mute,information,help;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button)findViewById(R.id.btnStart);
        unmute =(Button)findViewById(R.id.btnUnMute);
        mute = (Button)findViewById(R.id.btnMute);
        information = (Button) findViewById(R.id.btnInformation);
        help = (Button) findViewById(R.id.btnHelp);
        start.setOnClickListener( this);
        unmute.setOnClickListener( this);
        mute.setOnClickListener( this);
        information.setOnClickListener( this);
        help.setOnClickListener(this);

        mediaPlayer = MediaPlayer.create(this, R.raw.nhacnen);
        mediaPlayer.start();
//        if(mediaPlayer.isPlaying()){
//            return;
//        }
//        else mediaPlayer.start();

    }
    @Override
    public void onClick(View v){

        switch (v.getId()){
            case R.id.btnStart:
                doOpenChildActivity();
                break;
            case R.id.btnUnMute:
               mediaPlayer.setVolume(1,1);
                break;
            case R.id.btnMute:
               mediaPlayer.setVolume(0,0);
                break;
            case R.id.btnInformation:

                break;
            case R.id.btnHelp:

                break;
        }
    }
    public void doOpenChildActivity()
    {
        Intent myIntent=new Intent(this, ChoiceActivity.class);
        startActivity(myIntent);
    }

}
