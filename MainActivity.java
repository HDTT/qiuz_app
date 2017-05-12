package com.example.toanncth.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button start, unmute, information, help, highscore;
    private MediaPlayer mediaPlayer;
    int p = 9, q = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.btnStart);
        unmute = (Button) findViewById(R.id.btnUnMute);
        // mute = (Button)findViewById(R.id.btnMute);
        information = (Button) findViewById(R.id.btnInformation);
        highscore = (Button) findViewById(R.id.highscore);
        help = (Button) findViewById(R.id.btnHelp);
        start.setOnClickListener(this);
        unmute.setOnClickListener(this);
        //  mute.setOnClickListener( this);
        information.setOnClickListener(this);
        help.setOnClickListener(this);
        highscore.setOnClickListener(this);


        //mediaPlayer.release();
        mediaPlayer = MediaPlayer.create(this, R.raw.nhacnen);

        //mediaPlayer = new MediaPlayer();
        //mediaPlayer.pause();
        //mediaPlayer.setLooping(true);


        mediaPlayer.start();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {


            case R.id.btnStart:

                doOpenChildActivity();
                break;
            case R.id.btnUnMute:

                if (mediaPlayer.isPlaying()) {
                    unmute.setBackgroundResource(R.drawable.mute);
                    mediaPlayer.setVolume(0, 0);
                    mediaPlayer.pause();
                } else if (!mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                    mediaPlayer.isPlaying();
                    unmute.setBackgroundResource(R.drawable.volume1);
                    mediaPlayer.setVolume(1, 1);
                }

                break;

            case R.id.highscore:

                Intent myIntent = new Intent(this, HighScoreActivity.class);
                startActivity(myIntent);

                break;
            case R.id.btnHelp:

                Intent myIntent1 = new Intent(this, HelpActivity.class);
                startActivity(myIntent1);

                break;
            case R.id.btnInformation:

                Intent myIntent3 = new Intent(this, Infor.class);
                startActivity(myIntent3);

                break;
        }
    }
    public void doOpenChildActivity() {
        // finish();

        Intent myIntent = new Intent(this, ChoiceActivity.class);
        startActivity(myIntent);
        //finish();

    }


}
