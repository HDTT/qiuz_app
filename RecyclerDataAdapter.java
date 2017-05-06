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
