package com.example.yen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Danhsachthietbi extends AppCompatActivity {

    EditText edtTimkiem;
    ListView lwDanhsachthietbi;
    ImageButton imgbtnAdd;
    ArrayList<Thietbi> arrayList ;
    ArrayAdapter<Thietbi> arrayAdapter;
    Thietbi thietbi;
    int vitri=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsachthietbi);
        anhxa();
        arrayList = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        lwDanhsachthietbi.setAdapter(arrayAdapter);
        danhsachthietbi();
        themthietbi();
        nhandata();
    }
    private void nhandata(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        if(bundle != null){
            thietbi = (Thietbi) bundle.getSerializable("doituong") ;
            if(arrayList.contains(thietbi)){
                Toast.makeText(this, "Thiết bị đã tồn taị", Toast.LENGTH_SHORT);
            }
            else {
                arrayList.add(thietbi);
                arrayAdapter.notifyDataSetChanged();
            }


        }
    }
    private void themthietbi() {
        imgbtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Danhsachthietbi.this, Themthietbi.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void danhsachthietbi() {
        lwDanhsachthietbi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                vitri=position;
                Intent intent = new Intent(Danhsachthietbi.this, Chitietthietbi.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void anhxa() {
        edtTimkiem = (EditText) findViewById(R.id.edtTim);
        lwDanhsachthietbi = (ListView) findViewById(R.id.listView);
        imgbtnAdd = (ImageButton) findViewById(R.id.imgbtnAdd);
    }
}
