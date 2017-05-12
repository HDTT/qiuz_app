package com.example.toanncth.quizapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ToanNcTh on 3/28/2017.
 */
public class ChoiceActivity extends AppCompatActivity {
    private List<Type> list;
    private MediaPlayer mediaPlayer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        getSupportActionBar().setTitle("Thể loại");
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        list = new ArrayList();
        list.add(new Type("Khoa Học Xã hội"));
        list.add(new Type("Toán Học"));
        list.add(new Type("Văn Học - Lịch Sử"));
        list.add(new Type("Địa Lý"));
        list.add(new Type("Câu Đố Mẹo"));
        list.add(new Type("Câu Đố Vui"));
        list.add(new Type("Câu Đố Hay"));
        list.add(new Type("Câu Đố Cười"));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerDataAdapter(this, list));


        mediaPlayer = MediaPlayer.create(this, R.raw.nhacnen);
        mediaPlayer.setLooping(true);
       // mediaPlayer.start();
//        mediaPlayer.setLooping(true);
//        mediaPlayer.start();
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
               // onDestroy();

                onBackPressed();
                break;
            default:
               // return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed(){
       // Activity.overridePendingTransition()

//        if( mediaPlayer.isPlaying() ){
//            mediaPlayer = new MediaPlayer();
//           // finish();
//            mediaPlayer.setVolume(0,0);
//            mediaPlayer.pause();
//            mediaPlayer= null;
//            mediaPlayer.release();
//            Intent myIntent2=new Intent(this, MainActivity.class);
//            startActivity(myIntent2);
//            finish();
//        }
        finish();

    }


}
