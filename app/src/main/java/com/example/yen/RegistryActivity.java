package com.example.yen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class RegistryActivity extends AppCompatActivity {
    private EditText edtHoten, edtPhone, edtEmail, edtPass, edtNhaplaiPass;
    private Button btnRegistry;
    TextView twName;
    private ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);
        AnhXa();
        Dangky();
    }


    private void Dangky() {
        btnRegistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name  = edtHoten.getText().toString();
                String phone = edtPhone.getText().toString();
                String email = edtEmail.getText().toString();
                String pass  = edtPass.getText().toString();
                String nhaplaipass = edtNhaplaiPass.getText().toString();

            }
        });
    }
    private void sendata(){
        Intent intent = new Intent(this, MainActivity.class);

    }

    private void AnhXa() {
        edtHoten = (EditText) findViewById(R.id.edtHoten);
        edtPhone = (EditText) findViewById(R.id.edtSDT);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPass  = (EditText) findViewById(R.id.edtMatkhau);
        edtNhaplaiPass = (EditText) findViewById(R.id.edtNhaplaimatkhau);
        btnRegistry = (Button) findViewById(R.id.btnDangky);
        imgView     = (ImageView) findViewById(R.id.imgView);
        twName = (TextView) findViewById(R.id.twName);
    }
}
