package com.example.freedom.myapplication.Project;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service_Project {

    @GET("Project")
    Call<List<User_project>> getUserData();
}

