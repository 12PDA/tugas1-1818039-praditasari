package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        final EditText nama =(EditText) findViewById(R.id.input_nama);
        final EditText nim =(EditText) findViewById(R.id.input_nim);
        final EditText jurusan =(EditText) findViewById(R.id.input_jurusan);
        final EditText angkatan =(EditText) findViewById(R.id.input_angkatan);

        final TextView t_nama = (TextView) findViewById(R.id.txt_nama);
        final TextView t_nim = (TextView) findViewById(R.id.txt_nim);
        final TextView t_jurusan = (TextView) findViewById(R.id.txt_jurusan);
        final TextView t_angkatan = (TextView) findViewById(R.id.txt_angkatan);

        final Button tampil = (Button) findViewById(R.id.btn_tampil);
        tampil.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String nama1 = nama.getText().toString();
                String nim1 = nim.getText().toString();
                String jurusan1 = jurusan.getText().toString();
                String angkatan1 = angkatan.getText().toString();

                t_nama.setText(nama1);
                t_nim.setText(nim1);
                t_jurusan.setText(jurusan1);
                t_angkatan.setText(angkatan1);
            }
        });
    }
}