package com.example.yen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtEmail , edtPass;
    Button btnLogin, btnRegistry, btnQuenmatkhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        anhxa();
        dangnhap();
    }

    private void dangnhap() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean result = isLogin();
                if(result){
                    Toast.makeText(LoginActivity.this, "", Toast.LENGTH_SHORT).show();
                }
                else {
                    luuthongtin();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    String email = edtEmail.getText().toString();
                    intent.putExtra("email", email);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }

    private void luuthongtin(){
        SharedPreferences share = getSharedPreferences("data", MODE_PRIVATE);
        SharedPreferences.Editor editor = share.edit();
        editor.putString("email",edtEmail.getText().toString());
        editor.putString("password", edtPass.getText().toString());
        editor.commit();

    }
    public boolean isLogin(){
        SharedPreferences preferences = getSharedPreferences("data", MODE_PRIVATE);
        String email = preferences.getString("email", "");
        String password = preferences.getString("password", "");
        if(email.isEmpty() && password.isEmpty()){
           return true;
        }
        else {
            return false;
        }
    }

    private void anhxa() {
        edtEmail = (EditText) findViewById(R.id.edtEmailLogin);
        edtPass = (EditText) findViewById(R.id.edtPassLogin);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegistry = (Button) findViewById(R.id.btnDangkyLogin);
        btnQuenmatkhau = (Button) findViewById(R.id.btnQuenmatkhauLogin);
    }
}
