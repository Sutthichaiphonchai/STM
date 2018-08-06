package com.example.freedom.myapplication.Login;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import android.widget.Toast;

import com.example.freedom.myapplication.Project.Project_activity;
import com.example.freedom.myapplication.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    EditText edt_email,edt_password;
    Button btn_login;

    Service_login mService;

    Animation uptodown,downtoup;
    LinearLayout animate;

    private List<API_Login> api_logins;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // hide ActionBar
        getSupportActionBar().hide();
        //Animation

        animate = (LinearLayout) findViewById(R.id.email_login_form);


        uptodown = AnimationUtils.loadAnimation(this,R.anim.slide_left);


        animate.setAnimation(uptodown);
        //init Service
        mService = Connect_login.getAPI2();

        //init View
        edt_email = (EditText) findViewById(R.id.edt_email);
        edt_password = (EditText) findViewById(R.id.edt_password);
        btn_login = (Button) findViewById(R.id.btn_login);


        //Auto Login


        //Event
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                authenticateUser(edt_email.getText().toString(),edt_password.getText().toString());
                //authenticateUserUMS(edt_email.getText().toString(),edt_password.getText().toString());

            }
        });



    }

    private void authenticateUser(String usLogin, String usPassword) {
        mService.loginUser(usLogin,usPassword)
                .enqueue(new Callback<List<API_Login>>() {
                    @Override
                    public void onResponse(Call<List<API_Login>> call, Response<List<API_Login>> response) {
                        api_logins = response.body();
                        if (!api_logins.isEmpty()) {
                            api_logins = response.body();
                            String name_user = api_logins.get(api_logins.size() - 1).getUsName();
                            String name_dpname = api_logins.get(api_logins.size() - 1).getDpName();
                            Log.d("name:", String.valueOf(name_user));
                            Log.d("Department:", String.valueOf(name_dpname));
                            Intent intent = new Intent(LoginActivity.this, Project_activity.class);
                            intent.putExtra("User_login", name_user);
                            intent.putExtra("Department", name_dpname);
                            startActivity(intent);
                            Toast.makeText(LoginActivity.this, "LOGIN Success ! ", Toast.LENGTH_SHORT).show();
                        }else
                         Toast.makeText(LoginActivity.this,"Login credentials are wrong. Please try again!" , Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onFailure(Call<List<API_Login>> call, Throwable t) {
                        Toast.makeText(LoginActivity.this,"Please complete the information.",Toast.LENGTH_SHORT).show();
                    }

                });
    }

}
