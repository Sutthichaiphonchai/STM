package com.example.freedom.myapplication.Login;

public class Connect_login {

    public static final String BASE_URL = "http://10.80.39.23:2560/";

    public static Service_login getAPI2()
    {
        return RetrofitLogin.getClient(BASE_URL).create(Service_login.class);
    }

}
