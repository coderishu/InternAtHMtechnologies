package com.example.ishumishra97.internathmtechnologies;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private List<Model> studentlist;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, classs, section;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.textViewName);
            classs = (TextView) view.findViewById(R.id.textViewClass);
            section = (TextView) view.findViewById(R.id.textViewSection);
        }
    }


    public CustomAdapter(List<Model> studentlist) {
        this.studentlist = studentlist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view_item_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Model model = studentlist.get(position);
        holder.name.setText(model.getName());
        holder.classs.setText(model.getClasss());
        holder.section.setText(model.getSection());
    }

    @Override
    public int getItemCount() {
        return studentlist.size();
    }
}