package com.example.toanncth.quizapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class WinnerActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    HighScore highScore;
    HSHelper dbb;
    List<HighScore> highScores;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        getSupportActionBar().setTitle("Score");
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textResult = (TextView) findViewById(R.id.textResult);
        TextView textSoDiem = (TextView) findViewById(R.id.textSoDiem);

        Bundle b = getIntent().getExtras();

        int score = b.getInt("score");
        mediaPlayer = MediaPlayer.create(this, R.raw.win);
        mediaPlayer.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        textResult.setText("BESTSCORE");
        textSoDiem.setText(String.valueOf(score));

        SharedPreferences sharedPreferencess = this.getSharedPreferences("myPrefsKey1", Context.MODE_PRIVATE);
        a = sharedPreferencess.getInt("id", 0);

        dbb = new HSHelper(this);
        highScores = dbb.getHighScore();

        if (a == 0) {
            highScore = highScores.get(0);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(WinnerActivity.this, "Chúc mừng bạn đã hoàn thành xong chủ đề", Toast.LENGTH_LONG).show();
                dbb.updateContact(highScore);
            }
        }
        if (a == 1) {
            highScore = highScores.get(1);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(WinnerActivity.this, "Chúc mừng bạn đã hoàn thành xong chủ đề", Toast.LENGTH_LONG).show();
                dbb.updateContact(highScore);
            }
        }
        if (a == 2) {
            highScore = highScores.get(2);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(WinnerActivity.this, "Chúc mừng bạn đã hoàn thành xong chủ đề", Toast.LENGTH_LONG).show();
                dbb.updateContact(highScore);
            }
        }
        if (a == 3) {
            highScore = highScores.get(3);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(WinnerActivity.this, "Chúc mừng bạn đã hoàn thành xong chủ đề", Toast.LENGTH_LONG).show();
                dbb.updateContact(highScore);
            }
        }
        if (a == 4) {
            highScore = highScores.get(4);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(WinnerActivity.this, "Chúc mừng bạn đã hoàn thành xong chủ đề", Toast.LENGTH_LONG).show();
                dbb.updateContact(highScore);
            }
        }
        if (a == 5) {
            highScore = highScores.get(5);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(WinnerActivity.this, "Chúc mừng bạn đã hoàn thành xong chủ đề", Toast.LENGTH_LONG).show();
                dbb.updateContact(highScore);
            }
        }
        if (a == 6) {
            highScore = highScores.get(6);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(WinnerActivity.this, "Chúc mừng bạn đã hoàn thành xong chủ đề", Toast.LENGTH_LONG).show();
                dbb.updateContact(highScore);
            }
        }
        if (a == 7) {
            highScore = highScores.get(7);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(WinnerActivity.this, "Chúc mừng bạn đã hoàn thành xong chủ đề", Toast.LENGTH_LONG).show();
                dbb.updateContact(highScore);
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
//				SharedPreferences prefs2 = this.getSharedPreferences("myPrefsKey3", Context.MODE_PRIVATE);
//				SharedPreferences.Editor editor2 = prefs2.edit();
//				editor2.putInt("scoreback", score);
//				editor2.commit();
                onBackPressed();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }

    public void Return(View o) {
        //Intent intent = new Intent(this, ChoiceActivity.class);
        //startActivity(intent);
        finish();
    }

    public void home(View o) {
        // Intent intent = new Intent(this, MainActivity.class);
        // startActivity(intent);
        finish();
    }
}

