package com.example.toanncth.quizapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

/**
 * Created by ToanNcTh on 3/28/2017.
 */
public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.DataViewHolder> {

    private List<Type> name;
    private Context context;
    private LayoutInflater mInflater;
    private RecyclerDataAdapter mAdapter;
    private int lastPosition = -1;
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

        holder.setAnimation(holder.itemView, position);
    }
    @Override
    public void onViewDetachedFromWindow(final RecyclerDataAdapter.DataViewHolder holder)
    {
        (holder).clearAnimation();
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
           // Toast.makeText(context, String.valueOf(getAdapterPosition()), Toast.LENGTH_SHORT).show();
        }

//        protected void setAnimation(View viewToAnimate, int position) {
//            if (position > lastPosition) {
//                ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//                anim.setDuration(new Random().nextInt(501));//to make duration random number between [0,501)
//                viewToAnimate.startAnimation(anim);
//                lastPosition = position;
//            }
//        }
        private void setAnimation(View viewToAnimate, int position)
        {
            // If the bound view wasn't previously displayed on screen, it's animated
//            if (position > lastPosition)
//            {
//                Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
//                viewToAnimate.startAnimation(animation);
//                lastPosition = position;
//            }
            if (position > lastPosition) {
                ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                anim.setDuration(new Random().nextInt(501));//to make duration random number between [0,501)
                viewToAnimate.startAnimation(anim);
                lastPosition = position;
            }
        }
        public void clearAnimation()
        {
            itemView.clearAnimation();
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
