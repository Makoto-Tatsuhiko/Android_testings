package com.example.androidassignment1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyWagashiAdapter extends RecyclerView.Adapter<MyWagashiAdapter.ViewHolder>{


    MyWagashiData[] myWagashiData;
    Context context;

    public MyWagashiAdapter(MyWagashiData myWagashiData[], MainActivity activity) {
        this.myWagashiData = myWagashiData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.wagashi_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final MyWagashiData myWagashiDataList = myWagashiData[position];
        holder.textViewName.setText(myWagashiDataList.getWagashiName());
        holder.textViewLocation.setText(myWagashiDataList.getWagashiLocation());
        holder.wagashiImage.setImageResource(myWagashiDataList.getWagashiImage());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(context,myWagashiDataList.getWagashiName(),Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return myWagashiData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView wagashiImage;
        TextView textViewName;
        TextView textViewLocation;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            wagashiImage = itemView.findViewById(R.id.imageview);
            textViewName = itemView.findViewById(R.id.textName);
            textViewLocation = itemView.findViewById(R.id.textlocation);

        }
    }
}
