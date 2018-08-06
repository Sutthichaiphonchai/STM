package com.example.freedom.myapplication.Helper;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import com.example.freedom.myapplication.Defect.Defect_log;
import com.example.freedom.myapplication.Login.LoginActivity;
import com.example.freedom.myapplication.Project.Project_activity;
import com.example.freedom.myapplication.Project.User_project;
import com.example.freedom.myapplication.R;

import java.util.List;


public  class RecyclerViewAdapterProject extends  RecyclerView.Adapter<RecyclerViewAdapterProject.RecyclerViewHolder>{

    private List<User_project> item;
    private Context context;
    private Project_activity project_activity;


    public RecyclerViewAdapterProject(List<User_project> list) {
        this.item = list;
    }

    @Override
    public RecyclerViewAdapterProject.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_row, null);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(layoutView);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapterProject.RecyclerViewHolder holder, int position) {

//        holder.Project_id.setText(item.get(position).getPjId());
        holder.Project_code.setText(item.get(position).getPjCode());
//        holder.Project_name.setText(item.get(position).getPjName());
        holder.Project_create_user.setText(item.get(position).getUsName());
        holder.Project_start_data.setText(item.get(position).getPjstartdate());
        holder.name_status.setText(item.get(position).getPstthname());
        holder.setClickListener(new ItemClickListener() {
            @Override
            public void onClick(View v, int position, boolean isLongClick) {
                if (isLongClick){
                    final Intent intent;Intent intent1;
                    intent1 = ((Project_activity) v.getContext()).getIntent();

                    String name = intent1.getStringExtra("User_login");
                    String department = intent1.getStringExtra("Department");

                    intent = new Intent(v.getContext(), Defect_log.class);
                    intent.putExtra("User_login",name);
                    intent.putExtra("Department",department);

                    intent.putExtra("pj_id",  String.valueOf(item.get(position).getPjId()));
                    intent.putExtra("pj_code", String.valueOf(item.get(position).getPjCode()));
                    intent.putExtra("pj_name", String.valueOf(item.get(position).getPjName()));
                    intent.putExtra("df_pj_id", String.valueOf(item.get(position).getDfPjId()));
                    //     Log.d("name0",item.get(position).getPjName());
                    v.getContext().startActivity(intent);
                }
                else{
                    Toast.makeText(context, "Nooooooooo !! !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() { return item.size(); }
    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        public TextView Project_id, Project_code, Project_name, Project_create_user,Project_start_data,name_status;
        private final Context context;
        private ItemClickListener clickListener;


        public RecyclerViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);

//        Project_id = (TextView) itemView.findViewById(R.id.Project_id);
            Project_code = (TextView) itemView.findViewById(R.id.Project_code);
           // Project_name = (TextView) itemView.findViewById(R.id.Project_name);
            Project_create_user = (TextView) itemView.findViewById(R.id.Project_create_user);
            Project_start_data = (TextView) itemView.findViewById(R.id.Project_start_data);
            name_status = (TextView) itemView.findViewById(R.id.name_status);


        }

        public void setClickListener(ItemClickListener itemClickListener) {
            this.clickListener = itemClickListener;
        }


        @Override
        public void onClick(View v) {
            clickListener.onClick(v, getPosition(), true);
        }


        @Override
        public boolean onLongClick(View v) {
            clickListener.onClick(v, getPosition(),true);
            return true;
        }

    }
}

