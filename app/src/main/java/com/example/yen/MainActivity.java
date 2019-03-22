package com.example.yen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView twName;
    private Button btnDanhsachthietbi, btnCapnhatthongtin, btnDangXuat;
    private ImageView imgView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        nhandata();
    }

    private void nhandata() {
        Intent intent = getIntent();
        String email=intent.getStringExtra("email");
        twName.setText("Email:"+email);
    }
    private void AnhXa() {
        twName = (TextView) findViewById(R.id.twName);
        btnDanhsachthietbi = (Button) findViewById(R.id.btnDanhSachThietBi);
        btnCapnhatthongtin = (Button) findViewById(R.id.btnUpdatethongtin);
        btnDangXuat = (Button) findViewById(R.id.btnDangXuat);
        imgView1 = (ImageView) findViewById(R.id.imgV);
    }
}
