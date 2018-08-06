package com.example.freedom.myapplication.Login;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Service_login {

    @FormUrlEncoded
    @POST("Login")
    Call<List<API_Login>> loginUser(@Field("UsLogin") String usLogin, @Field("UsPassword") String usPassword);

}
