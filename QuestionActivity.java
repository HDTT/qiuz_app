import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class QuestionActivity extends AppCompatActivity {
    List<Question> quesList;
    int score = 0; int max = 0;
    int qid = 0;
    Question currentQ;
    public TextView txtQuestion, times, scored;
    Button button1, button2, button3;
  //  int a = 0;
    MediaPlayer mediaPlayer;
    int a; int t;
    Type type;
    CounterClass timer;
    Question question;
    QuizHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        //question = new Question();

        // A timer of 60 seconds to play for, with an interval of 1 second (1000 milliseconds)
        timer = new CounterClass(30000, 1000);
      // timer.start();



            db = new QuizHelper(this);  // my question bank class

            Bundle b = getIntent().getExtras();
            a = b.getInt("position");

            if (a == 0) {    quesList = db.getAllQuestions0();  timer.start(); }
            if (a == 1) {    quesList = db.getAllQuestions1();  timer.start(); }
            if (a == 2) {    quesList = db.getAllQuestions2();  timer.start(); }
            if (a == 3) {    quesList = db.getAllQuestions3();  timer.start(); }
            if (a == 4) {    quesList = db.getAllQuestions4();  timer.start(); }
            if (a == 5) {    quesList = db.getAllQuestions5();  timer.start(); }
            if (a == 6) {    quesList = db.getAllQuestions6();  timer.start(); }
            if (a == 7) {    quesList = db.getAllQuestions7();  timer.start(); }


        SharedPreferences prefs = this.getSharedPreferences("myPrefsKey1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("id", a);
        editor.commit();

     //   else
     //       quesList = db.getAllQuestions1();

         // this will fetch all quetonall questions
        currentQ = quesList.get(qid); // the current question

        t = quesList.size();

        txtQuestion = (TextView) findViewById(R.id.txtQuestion);
        // the textview in which the question will be displayed

        // the three buttons,
        // the idea is to set the text of three buttons with the options from question bank
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        // the textview in which score will be displayed
        scored = (TextView) findViewById(R.id.score);

        // the timer
        times = (TextView) findViewById(R.id.timers);



        // method which will set the things up for our game
        setQuestionView();
       // times.setText("00:02:00");


        // button click listeners
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // passing the button text to other method
                // to check whether the anser is correct or not
                // same for all three buttons
                getAnswer(button1.getText().toString());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAnswer(button2.getText().toString());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAnswer(button3.getText().toString());
            }
        });
    }





    public void getAnswer(String AnswerString) {
        if (currentQ.getANSWER().equals(AnswerString)) {
            mediaPlayer = MediaPlayer.create(this,R.raw.dung);
            mediaPlayer.start();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            score++;
            scored.setText("Score : " + score);

        } else {
            mediaPlayer = MediaPlayer.create(this,R.raw.sai);
            mediaPlayer.start();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


           // if(a==0) {
              //  question = new Question();
               // question.setSCORE1(scored.getText().toString().trim());
           // question.setSCORE1(String.valueOf(score).toString().trim());
           // }
            // if unlucky start activity and finish the game
           // db.addScore(question);
            timer.cancel();
            Intent intent = new Intent(QuestionActivity.this,
                    ResultActivity.class);
            // passing the int value
            Bundle b = new Bundle();
            b.putInt("score", score); // Your score

            intent.putExtras(b); // Put your score to your next
            startActivity(intent);
            finish();


        }
        if (qid < 10) {

            // if questions are not over then do this
            currentQ = quesList.get(qid);
            setQuestionView();

        } else {
            // if over do this
            Intent intent = new Intent(QuestionActivity.this,
                    WinnerActivity.class);
            Bundle b = new Bundle();

            b.putInt("score", score); // Your score
            intent.putExtras(b); // Put your score to your next
            startActivity(intent);
            finish();
            //lm them
            timer.cancel();
            //lm them
        //    if(a==0) question.setSCORE1(score);
        }


    }


    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @SuppressLint("NewApi")
    public class CounterClass extends CountDownTimer {

        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
            // TODO Auto-generated constructor stub
        }


        @Override
        public void onFinish() {
            times.setText("Time is up");
            Intent intent = new Intent(QuestionActivity.this,
                    ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", score); // Your score
            intent.putExtras(b); // Put your score to your next
            startActivity(intent);
            finish();
        }

        @Override
        public void onTick(long millisUntilFinished) {
            // TODO Auto-generated method stub

            long millis = millisUntilFinished;
            String hms = String.format(
                    "%02d:%02d:%02d",
                    TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis)
                            - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS
                            .toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis)
                            - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS
                            .toMinutes(millis)));
            System.out.println(hms);
            times.setText(hms);
        }


    }

    private void setQuestionView() {

        // the method which will put all things together
        txtQuestion.setText(currentQ.getQUESTION());
        button1.setText(currentQ.getOPTA());
        button2.setText(currentQ.getOPTB());
        button3.setText(currentQ.getOPTC());



        qid++;
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


                // mediaPlayer.setVolume(0,0);
                //mediaPlayer.setVolume(1,1);
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed(){
        timer.cancel();
        finish();
    }
}
