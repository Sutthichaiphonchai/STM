package com.example.freedom.myapplication.Defect;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freedom.myapplication.Helper.RecyclerViewAdapterDefectLog;
import com.example.freedom.myapplication.R;
import com.example.freedom.myapplication.Report.Fragment.PieSeverity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Fragment_defect_log extends Fragment {

    public static Fragment_defect_log newInstance() {
        Fragment_defect_log fragment = new Fragment_defect_log();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    View myView;
    private List<API_Defect> apiDefects;
    private LinearLayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        myView = inflater.inflate(R.layout.fragment_defect_log, container, false);

        String df_pj_id = getArguments().getString("pj_id");

        get_Defect_log(Integer.valueOf(df_pj_id));
        return myView;
    }

    private void get_Defect_log(Integer df_pj_id) {

        Service_Defect_log service = ApiClientDefectLog.getRetrofit().create(Service_Defect_log.class);
        Log.d("tt", String.valueOf(service));
        Call<List<API_Defect>> call = service.ConnectDefect(df_pj_id);
        call.enqueue(new Callback<List<API_Defect>>() {
            @Override
            public void onResponse(Call<List<API_Defect>> call, Response<List<API_Defect>> response) {
                if (response.isSuccessful()) {
                    apiDefects = response.body();
                    layoutManager = new LinearLayoutManager(getActivity());
                    layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                    RecyclerView recyclerView = (RecyclerView) getView().findViewById(R.id.card_recycler_view);
                    recyclerView.setLayoutManager(layoutManager);
                    RecyclerViewAdapterDefectLog recyclerViewAdapterDefectLog = new RecyclerViewAdapterDefectLog(apiDefects);
                    recyclerView.setAdapter(recyclerViewAdapterDefectLog);


                }
            }

            @Override
            public void onFailure(Call<List<API_Defect>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }

        });

    }
}
