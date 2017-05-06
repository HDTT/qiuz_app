package com.example.toanncth.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ToanNcTh on 3/28/2017.
 */
public class ChoiceActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        List<Type> list = new ArrayList();
        list.add(new Type("Khoa Học Xã hội"));
        list.add(new Type("Toán Học"));
        list.add(new Type("Văn Học - Lịch Sử"));
        list.add(new Type("Địa Lý"));
        list.add(new Type("Câu Đố Vui"));
        list.add(new Type("Câu Đố Mẹo"));
        list.add(new Type("Câu Đố Hay"));
        list.add(new Type("Câu Đố Cười"));


        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rcv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerDataAdapter(this,list));


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //finish();
                onBackPressed();
                break;
        }
        return true;
    }



    @Override
    public void onBackPressed() {
       // startActivity(new Intent(ChoiceActivity.this, MainActivity.class));
        finish();

    }
   
}
