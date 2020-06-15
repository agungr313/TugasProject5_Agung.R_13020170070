package com.example.apliaksibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.apliaksibudaya.model.Budaya;

import org.json.JSONException;

public class daftar extends AppCompatActivity {
    private Budaya budaya;
    private EditText username, namalengkap, alamat, kontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        username = findViewById(R.id.txtusername);
        namalengkap = findViewById(R.id.txtnamalengkap);
        alamat = findViewById(R.id.txtalamay);
        kontak = findViewById(R.id.txtkontak);

    }
    public void btnsimpanClick(View view){
        budaya = new Budaya(
                username.getText().toString(),
                namalengkap.getText().toString(),
                alamat.getText().toString(),
                kontak.getText().toString()
        );


    }
}