package com.example.yen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //goi tu shared preference
        shredprefernce();
        boolean isLogin = true;
        if (isLogin) {
            Intent intent = new Intent(this, Danhsachthietbi.class);
            startActivity(intent);
        } else {
            //intent dang nhap
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }

    private boolean shredprefernce() {
        SharedPreferences share = getSharedPreferences("data", MODE_PRIVATE);
        String email = share.getString("email","");
        String password = share.getString("password","");
        if(email.isEmpty() && password.isEmpty()){
            return true;
        }
        else
            return false;


    }
}
