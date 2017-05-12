package com.example.toanncth.quizapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class ResultActivity extends AppCompatActivity implements View.OnClickListener {
    public int score, a, scoremax1, score1;
    Button home1, replay;
    MediaPlayer mediaPlayer;
    QuestionActivity.CounterClass timer;
    HighScore highScore;
    HSHelper dbb;
    List<HighScore> highScores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketqua);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        getWindow().getAttributes().windowAnimations = R.style.Fade;

        getSupportActionBar().setTitle("Score");

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(this, R.raw.nhacnen);
        TextView textResult = (TextView) findViewById(R.id.textResult);
        TextView textSoDiem = (TextView) findViewById(R.id.textSoDiem);
        TextView textHigh = (TextView) findViewById(R.id.textHigh);
        TextView textHighScore = (TextView) findViewById(R.id.textHighScore);
        home1 = (Button) findViewById(R.id.imageView2);
        replay = (Button) findViewById(R.id.imageView3);

        home1.setOnClickListener(this);
        replay.setOnClickListener(this);
        //	cc = (ImageView) findViewById(R.id.imageView);

        Bundle b = getIntent().getExtras();

        score = b.getInt("score");
        //	score1 = b.getInt("score1");scoremax1 = b.getInt("scoremax1");


        textResult.setText("SCORE");
        textHigh.setText("HIGHSCORE");
        textSoDiem.setText(String.valueOf(score));

        SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("sssss", score);
        editor.commit();

        SharedPreferences sharedPreferencess = this.getSharedPreferences("myPrefsKey1", Context.MODE_PRIVATE);
        a = sharedPreferencess.getInt("id", 0);

        dbb = new HSHelper(this);
        highScores = dbb.getHighScore();

        if (a == 0) {
            highScore = highScores.get(0);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(ResultActivity.this, "Đã update điểm số của bạn", Toast.LENGTH_LONG).show();
                textHighScore.setText(String.valueOf(score));
                dbb.updateContact(highScore);
            } else textHighScore.setText(highScore.getDiem());
        }
        if (a == 1) {
            highScore = highScores.get(1);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(ResultActivity.this, "Đã update điểm số của bạn", Toast.LENGTH_LONG).show();
                //	Toast.makeText(ResultActivity.this, String.valueOf(score), Toast.LENGTH_LONG).show();
                textHighScore.setText(String.valueOf(score));
                dbb.updateContact(highScore);
            } else {
                textHighScore.setText(highScore.getDiem());
                //Toast.makeText(ResultActivity.this, highScore.getDiem(), Toast.LENGTH_LONG).show();}
            }
        }
        if (a == 2) {
            highScore = highScores.get(2);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(ResultActivity.this, "Đã update điểm số của bạn", Toast.LENGTH_LONG).show();
                textHighScore.setText(String.valueOf(score));
                dbb.updateContact(highScore);
            } else textHighScore.setText(highScore.getDiem());
        }
        if (a == 3) {
            highScore = highScores.get(3);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(ResultActivity.this, "Đã update điểm số của bạn", Toast.LENGTH_LONG).show();
                textHighScore.setText(String.valueOf(score));
                dbb.updateContact(highScore);
            } else textHighScore.setText(highScore.getDiem());
        }
        if (a == 4) {
            highScore = highScores.get(4);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(ResultActivity.this, "Đã update điểm số của bạn", Toast.LENGTH_LONG).show();
                textHighScore.setText(String.valueOf(score));
                dbb.updateContact(highScore);
            } else textHighScore.setText(highScore.getDiem());
        }
        if (a == 5) {
            highScore = highScores.get(5);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(ResultActivity.this, "Đã update điểm số của bạn", Toast.LENGTH_LONG).show();
                textHighScore.setText(String.valueOf(score));
                dbb.updateContact(highScore);
            } else textHighScore.setText(highScore.getDiem());
        }
        if (a == 6) {
            highScore = highScores.get(6);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(ResultActivity.this, "Đã update điểm số của bạn", Toast.LENGTH_LONG).show();
                textHighScore.setText(String.valueOf(score));
                dbb.updateContact(highScore);
            } else textHighScore.setText(highScore.getDiem());
        }
        if (a == 7) {
            highScore = highScores.get(7);
            if (score > Integer.parseInt(highScore.getDiem())) {
                highScore.setDiem(String.valueOf(score).toString());
                Toast.makeText(ResultActivity.this, "Đã update điểm số của bạn", Toast.LENGTH_LONG).show();
                textHighScore.setText(String.valueOf(score));
                dbb.updateContact(highScore);
            } else textHighScore.setText(highScore.getDiem());
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
                onBackPressed();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView2:
                finish();
                break;
            case R.id.imageView3:
                Intent myIntent = new Intent(this, QuestionActivity.class);
                Bundle b = new Bundle();
                b.putInt("position", a);
                //lm them cai nay la cai lay diem cao nhat moi lan replay qua ben questionActivity
                myIntent.putExtras(b);
                startActivity(myIntent);
                finish();
                break;
        }
    }

    @Override
    public void onBackPressed() {

        //Intent myIntent2=new Intent(this, ChoiceActivity.class);
        //startActivity(myIntent2);
        finish();
    }
}
