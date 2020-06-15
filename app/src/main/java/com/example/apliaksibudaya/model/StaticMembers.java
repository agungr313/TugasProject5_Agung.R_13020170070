package com.example.apliaksibudaya.model;

import android.content.Context;
import android.widget.Toast;

public class StaticMembers {
    public  static void tampilPesan(Context context, String teks){
        Toast.makeText(context, teks, Toast.LENGTH_LONG).show();
    }
}
