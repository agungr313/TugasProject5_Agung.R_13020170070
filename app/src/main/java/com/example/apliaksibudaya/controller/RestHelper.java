package com.example.apliaksibudaya.controller;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.example.apliaksibudaya.model.Budaya;
import java.util.ArrayList;

public class RestHelper {

    private RequestQueue requestQueue;
    private Context context;
    private final int REQ_METHOD = Request.Method.POST;
    private final String URL = "http://192.168.1.7/aplikasibudaya/";
    private ArrayList<Budaya> arrListbudaya = new ArrayList<>();

}
