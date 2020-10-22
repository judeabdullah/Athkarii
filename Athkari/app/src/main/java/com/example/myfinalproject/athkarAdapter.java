package com.example.myfinalproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class athkarAdapter extends RecyclerView.Adapter {

    ArrayList<athkar> aArray ;
    Context context ;

    public athkarAdapter(ArrayList<athkar> aArray, Context context) {
        this.aArray = aArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).name.setText(aArray.get(position).getName());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,MainActivity2.class);
                i.putExtra("athkar",aArray.get(position));
                context.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return aArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name ;
        public View view ;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           view= itemView;
           name = itemView.findViewById(R.id.textView);


        }
    }



}
