package com.example.yen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Themthietbi extends AppCompatActivity {
    EditText edtTenthietbi, edtMathietbi, edtMatkhauthietbi;
    Button btnQuetthietbi, btnThemthietbi;
    Thietbi thietbi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themthietbi);
        anhxa();
        quetthietbi();
        themthietbi();
    }

    private void quetthietbi() {
        //
    }

    private void themthietbi() {
        btnThemthietbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                senddata();
            }
        });
    }
    private void senddata(){
        Intent intent = new Intent(this, Danhsachthietbi.class);
        Bundle bundle = new Bundle();
        String name = edtTenthietbi.getText().toString();
        String ma = edtMathietbi.getText().toString();
        String password = edtMatkhauthietbi.getText().toString();
        thietbi = new Thietbi(name, ma, password);
        if(name.equals("") || ma.equals("")){
            Toast.makeText(this, "Bạn nhập chưa đủ thông tin", Toast.LENGTH_SHORT).show();
        }
        bundle.putSerializable("doituong", thietbi);
        intent.putExtra("data",bundle);
        startActivityForResult(intent, 100);
        finish();


    }

    private void anhxa() {
        edtTenthietbi = (EditText) findViewById(R.id.edtAddTenthietbi);
        edtMathietbi = (EditText) findViewById(R.id.edtAddMathietbi);
        edtMatkhauthietbi = (EditText) findViewById(R.id.edtAddMkthietbi);
        btnQuetthietbi = (Button) findViewById(R.id.btnQuetthietbi);
        btnThemthietbi = (Button) findViewById(R.id.btnAdd);
    }
}
