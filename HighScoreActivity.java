package com.example.toanncth.quizapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.List;

public class HighScoreActivity extends AppCompatActivity {
    TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7,
            txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15, txt16;
    ImageView img1;
    int score1, score2, score3;
    int scoreOld1;
    HighScore highScore;
    HSHelper dbb ;
    QuizHelper db;
    List<HighScore> highScores;
    List<Question> questions;
    int t,x,a,t1;
    int mang[] = new int[10];
    int qid=0;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);
        getSupportActionBar().setTitle("Điểm Cao");
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        getWindow().getAttributes().windowAnimations = R.style.Fade;

        scrollView=(ScrollView)findViewById(R.id.scrollView);

        txt1 = (TextView)findViewById(R.id.textView1);
        txt2 = (TextView)findViewById(R.id.textView2);
        txt3 = (TextView)findViewById(R.id.textView3);
        txt4 = (TextView)findViewById(R.id.textView4);
        txt5 = (TextView)findViewById(R.id.textView5);
        txt6 = (TextView)findViewById(R.id.textView6);
        txt7 = (TextView)findViewById(R.id.textView7);
        txt8 = (TextView)findViewById(R.id.textView8);
        txt9 = (TextView)findViewById(R.id.textView9);
        txt10 = (TextView)findViewById(R.id.textView10);
        txt11 = (TextView)findViewById(R.id.textView11);
        txt12 = (TextView)findViewById(R.id.textView12);
        txt13 = (TextView)findViewById(R.id.textView13);
        txt14 = (TextView)findViewById(R.id.textView14);
        txt15 = (TextView)findViewById(R.id.textView15);
        txt16 = (TextView)findViewById(R.id.textView16);
        //img1  = (ImageView)findViewById(R.id.imageView);

        dbb = new HSHelper(this);

        highScores = dbb.getHighScore();

        highScore = highScores.get(0);
        txt2.setText(highScore.getDiem().toString().trim());
        highScore = highScores.get(1);
        txt4.setText(highScore.getDiem().toString().trim());
        highScore = highScores.get(2);
        txt6.setText(highScore.getDiem().toString().trim());
        highScore = highScores.get(3);
        txt8.setText(highScore.getDiem().toString().trim());
        highScore = highScores.get(4);
        txt10.setText(highScore.getDiem().toString().trim());
        highScore = highScores.get(5);
        txt12.setText(highScore.getDiem().toString().trim());
        highScore = highScores.get(6);
        txt14.setText(highScore.getDiem().toString().trim());
        highScore = highScores.get(7);
        txt16.setText(highScore.getDiem().toString().trim());

        if(txt2.getText()=="10"){txt2.setTextColor(Color.RED);}
        if(highScores.get(1).getDiem().toString().trim()=="10"){txt4.setText("Đã hoàn thành");}
        if(txt6.getText()=="10"){txt6.setTextColor(Color.RED);}
        if(txt8.getText()=="10"){txt8.setTextColor(Color.RED);}
        if(txt10.getText()=="10"){txt10.setTextColor(Color.RED);}
        if(txt12.getText()=="10"){txt12.setTextColor(Color.RED);}
        if(txt14.getText()=="10"){txt14.setTextColor(Color.RED);}
        if(txt16.getText()=="10"){txt16.setTextColor(Color.RED);}
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
            default:
                // return super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed(){
        finish();
    }
}
