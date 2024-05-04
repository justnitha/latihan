package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnTampilkan,btnBersihkan;
    EditText nim,nama,tahun;
    TextView nim1,nama1,tahun1,umur1;

    String namaa,nimm;
    Integer tahunn,numur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nim = (EditText) findViewById(R.id.edtNim);
        nama = (EditText) findViewById(R.id.edtNama);
        tahun = (EditText) findViewById(R.id.edtTahun);
        nim1 = (TextView) findViewById(R.id.txtNim);
        nama1 = (TextView) findViewById(R.id.txtNama);
        tahun1 = (TextView) findViewById(R.id.txtTahun);
        umur1 = (TextView) findViewById(R.id.txtUmur);
        btnTampilkan = findViewById(R.id.btnTampil);
        btnBersihkan= findViewById(R.id.btnBersih);


        btnTampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nimm = nim.getText().toString().trim();
                tahunn = Integer.valueOf(tahun.getText().toString().trim());
                namaa = nama.getText().toString();
                numur = (2024 - tahunn);

                nim1.setText("nim   :" + nimm);
                nama1.setText("nama :"+namaa);
                tahun1.setText("tahun lahir   :" + tahunn);
                umur1.setText("Umur :" + numur);


            }
        });

        btnBersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nim.setText("");
                tahun.setText("");
                nama.setText("");

                nim1.setText("nim   :" );
                nama1.setText("nama :");
                tahun1.setText("tahun lahir   :");
                umur1.setText("Umur :" );
            }
        });
    }
}