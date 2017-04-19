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


public class ChoiceActivity extends AppCompatActivity {
    private List<Type> list;
    private MediaPlayer mediaPlayer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);


        list = new ArrayList();
        list.add(new Type("Khoa Học Xã hội"));
        list.add(new Type("Toán Học"));
        list.add(new Type("Văn Học - Lịch Sử"));
        list.add(new Type("Địa Lý"));
        list.add(new Type("Câu Đố Vui"));
        list.add(new Type("Câu Đố Mẹo"));
        list.add(new Type("Câu Đố Hay"));
        list.add(new Type("Câu Đố Cười"));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerDataAdapter(this, list));


        mediaPlayer = MediaPlayer.create(this, R.raw.nhacnen);
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


               // mediaPlayer.setVolume(0,0);
                //mediaPlayer.setVolume(1,1);
                break;
            default:
               // return super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed(){
//        mediaPlayer.stop();
//        mediaPlayer.reset();
//        mediaPlayer.release();
//        mediaPlayer = null;
//        if(mediaPlayer.isPlaying())
//            mediaPlayer.stop();
//
//        mediaPlayer.release();
    //    Intent myIntent=new Intent(this, MainActivity.class);
      //  startActivity(myIntent);
        finish();
    }
  //  @Override
    //protected void onDestroy() {

//        super.onDestroy();
//        Intent myIntent=new Intent(this, MainActivity.class);
//        startActivity(myIntent);
//       // mediaPlayer.stop();
//        mediaPlayer.reset();
//        mediaPlayer.release();
//        mediaPlayer = null;
      //  finish();

   // }

}
