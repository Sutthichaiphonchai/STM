package com.example.freedom.myapplication.Project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.freedom.myapplication.Helper.RecyclerViewAdapterProject;
import com.example.freedom.myapplication.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Project_activity extends AppCompatActivity {
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_activity);

        get_Select_Project();

    }

    private void get_Select_Project() {
        Service_Project service = ApiClientProject.getRetrofit().create(Service_Project.class);
        Call<List<User_project>> call = service.getUserData();

        call.enqueue(new Callback<List<User_project>>() {
            @Override
            public void onResponse(Call<List<User_project>> call, Response<List<User_project>> response) {
                List<User_project> userList = response.body();

                Log.d("sadasd", String.valueOf(userList));
                layoutManager = new LinearLayoutManager(Project_activity.this);
                layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.card_recycler_view);
                recyclerView.setLayoutManager(layoutManager);
                RecyclerViewAdapterProject recyclerViewAdapterProject = new RecyclerViewAdapterProject(userList);
                recyclerView.setAdapter(recyclerViewAdapterProject);
            }

            @Override
            public void onFailure(Call<List<User_project>> call, Throwable t) {
                Log.d("Error", t.getMessage());

            }
        });
    }

//
}


