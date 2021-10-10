package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas = (EditText) findViewById(R.id.edit_alas);
        final EditText tinggi = (EditText) findViewById(R.id.edit_tinggi);
        final EditText ls = (EditText) findViewById(R.id.edit_luas);

        final Button b_luas = (Button) findViewById(R.id.btn_luasSegitiga);
        b_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = alas.getText().toString();
                String t = tinggi.getText().toString();

                double x = Double.parseDouble(a);
                double y = Double.parseDouble(t);
                double l_segitiga= LuasSegitiga(x,y);
                String hls = String.valueOf(l_segitiga);
                ls.setText(hls.toString());
            }
        });

    }

    public double LuasSegitiga(double i, double j){
        return i*j/2;
    }

}