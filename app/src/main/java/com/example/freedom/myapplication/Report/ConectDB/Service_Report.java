package com.example.freedom.myapplication.Report.ConectDB;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service_Report {

    @GET("Report")
    Call<List<API_Report>> connectReport(@Query("df_pj_id") Integer df_pj_id);
}
