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

import com.example.freedom.myapplication.Defect.API_Defect;
import com.example.freedom.myapplication.Defect.Defect_log;
import com.example.freedom.myapplication.Project.Project_activity;

import com.example.freedom.myapplication.R;

import java.util.List;

public class RecyclerViewAdapterDefectLog extends RecyclerView.Adapter<RecyclerViewAdapterDefectLog.RecyclerViewHolder> {

    private List<API_Defect> item;
    private Context context;
    private Defect_log defect_log;

    public RecyclerViewAdapterDefectLog(List<API_Defect> list) {
        this.item = list;
    }

    @Override
    public RecyclerViewAdapterDefectLog.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_defect, null);

        RecyclerViewAdapterDefectLog.RecyclerViewHolder recyclerViewHolder = new RecyclerViewAdapterDefectLog.RecyclerViewHolder(layoutView);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapterDefectLog.RecyclerViewHolder holder, int position) {

//        holder.Project_id.setText(item.get(position).getPjId());
        holder.Defect_Code.setText(item.get(position).getDfCode());
        holder.Df_type.setText(item.get(position).getDftName());
        holder.DF_SV.setText(item.get(position).getSvCode());
        holder.DF_PR.setText(item.get(position).getPrCode());
        holder.setClickListener(new ItemClickListener() {
            @Override
            public void onClick(View v, int position, boolean isLongClick) {
                if (isLongClick){
                    final Intent intent;Intent intent1;
                    intent1 = ((Project_activity) v.getContext()).getIntent();

                    String name = intent1.getStringExtra("User_login");
                    Log.d("ss", name);

//                    intent = new Intent(v.getContext(), Detail_Defect_Log.class);
//                    intent.putExtra("Name",name);
//                    intent.putExtra("code",  String.valueOf(item.get(position).getDfCode()));
//                    intent.putExtra("typename", String.valueOf(item.get(position).getDftName()));
//                    intent.putExtra("svcode", String.valueOf(item.get(position).getSvCode()));
//                    intent.putExtra("prcode", String.valueOf(item.get(position).getPrCode()));
                    //     Log.d("name0",item.get(position).getPjName());
//                    v.getContext().startActivity(intent);
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

        public TextView Defect_Code, Df_type, DF_SV, DF_PR;
        private final Context context;
        private ItemClickListener clickListener;


        public RecyclerViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);


            Defect_Code = (TextView) itemView.findViewById(R.id.Defect_Code);
            Df_type = (TextView) itemView.findViewById(R.id.Df_type);
            DF_SV = (TextView) itemView.findViewById(R.id.DF_SV);
            DF_PR = (TextView) itemView.findViewById(R.id.DF_PR);


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

