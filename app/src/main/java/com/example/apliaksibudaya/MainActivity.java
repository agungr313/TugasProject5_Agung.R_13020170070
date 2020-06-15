package com.example.apliaksibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtuser, txtpass;
    private Button btnmasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtuser = findViewById(R.id.txtusername);
        txtpass = findViewById(R.id.txtpassword);
        btnmasuk = findViewById(R.id.btnmasuk);

    }

        public void btndaftarclick(View view) {
            Intent intent = new Intent(MainActivity.this, daftar.class);
            startActivity(intent);
        }

        public void btndmasukclick(View view) {
            Intent intent = new Intent(MainActivity.this, HalamanHome.class);
            startActivity(intent);
        }



}