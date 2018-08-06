package com.example.freedom.myapplication.Defect;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public  interface Service_Defect_log {

    @GET("Defect_log")
    Call<List<API_Defect>> ConnectDefect(@Query("df_pj_id") Integer df_pj_id);
}
