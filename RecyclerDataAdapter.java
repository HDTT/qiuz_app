<<<<<<< HEAD
package com.example.toanncth.quizapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ToanNcTh on 3/28/2017.
 */
public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.DataViewHolder> {

    private List<Type> name;
    private Context context;

    public RecyclerDataAdapter(Context context, List<Type> name) {
        this.context = context;
        this.name = name;
    }

    @Override
    public int getItemCount() {
        return name == null ? 0 : name.size();
    }

    @Override
    public RecyclerDataAdapter.DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);


        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerDataAdapter.DataViewHolder holder, int position) {
        String name1 = name.get(position).getName();
        holder.tvName.setText(name1);
    }

    /**
     * Data ViewHolder class.
     */
    public static class DataViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tvName;
        private MediaPlayer mediaPlayer;
        private  Context context;
        private Intent intent;

        ChoiceActivity choice = new ChoiceActivity();
        public DataViewHolder(View itemView) {
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.tvName);
            itemView.setOnClickListener(this);
            context = itemView.getContext();
        }



        //cai này khi mình kích vào chọn 1 item nó sẽ gửi cái vị trí lựa chọn đó sang bên trang question , trang question sẽ dựa vào cái số để lấy kiểu câu hỏi,
        @Override
        public void onClick(View v) {
            intent = new Intent(context,QuestionActivity.class);
            int position = getAdapterPosition();
            intent.putExtra("so",position);
            context.startActivity(intent);
        }

    }



}
=======
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.DataViewHolder> {

    private List<Type> name;
    private Context context;
    private LayoutInflater mInflater;
    private RecyclerDataAdapter mAdapter;

    public RecyclerDataAdapter(Context context, List<Type> name) {
        this.context = context;
        this.name = name;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemCount() {
        return name.size();
     //   return name == null ? 0 : name.size();
    }

    @Override
    public RecyclerDataAdapter.DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);


        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerDataAdapter.DataViewHolder holder, int position) {
       // String name1 = name.get(position).getName();
        //holder.tvName.setText(name1);
        Type type = name.get(position);
        holder.tvName.setText(type.getName());
    }

    /**
     * Data ViewHolder class.
     */
  //  public class DataViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public class DataViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView tvName;
        private MediaPlayer mediaPlayer;
        private  Context context;
        private Intent intent;

        ChoiceActivity choice = new ChoiceActivity();
        public DataViewHolder(View itemView) {
            super(itemView);

            itemView.setClickable(true);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            itemView.setOnClickListener(this);
            context = itemView.getContext();
        }

        @Override
        public void onClick(View v) {
            int position  =   getAdapterPosition();
            Intent intent = new Intent(context,QuestionActivity.class);
            Bundle b = new Bundle();
            b.putInt("position", position); // Your score
            intent.putExtras(b); // Put your score to your next
            context.startActivity(intent);
            Toast.makeText(context, String.valueOf(getAdapterPosition()), Toast.LENGTH_SHORT).show();



            Intent intent1 = new Intent(context,HighScoreActivity.class);
            Bundle b1 = new Bundle();
            b1.putInt("position1", position); // Your score
            intent1.putExtras(b1);
            //context.startActivity(intent1);// Put your score to your next



        }


//        @Override
//        public void onClick(View v) {
//            intent = new Intent(context,QuestionActivity.class);
//           // mediaPlayer.pause();
//            int position = getAdapterPosition();
//            Bundle bundle = new Bundle();
///           bundle.putInt("position",position);
///           intent.putExtra("DATA",bundle);
//            intent.putExtra("so",position);
//            context.startActivity(intent);
//        }

    }



}
>>>>>>> origin/master
