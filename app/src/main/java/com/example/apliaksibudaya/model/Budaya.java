package com.example.apliaksibudaya.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Budaya {

    private String username, namalengkap,alamat,kontak;
    private JSONObject jsonObject;
    private Budaya budaya;

    public Budaya(String username,String namalengkap,String alamat, String kontak){
        this.username = username;
        this.namalengkap = namalengkap;
        this.alamat = alamat;
        this.kontak = kontak;
    }
    public String getusername() {
        return username;
    }

    public String getnamalengkap() {
        return namalengkap;
    }

    public String getalamat() {
        return namalengkap;
    }

    public String getkontak() {
        return kontak;
    }

    public JSONObject toJSON() throws JSONException {
        jsonObject = new JSONObject();
        jsonObject.put("username", username);
        jsonObject.put("namalengkap", namalengkap);
        jsonObject.put("alamat", alamat);
        jsonObject.put("kontak", kontak);
        return jsonObject;
    }

    public Budaya JSONtopembeli(JSONObject jsonObject) throws JSONException {
        budaya = new com.example.apliaksibudaya.model.Budaya(
                jsonObject.getString("username"),
                jsonObject.getString("namalengkap"),
                jsonObject.getString("alamat"),
                jsonObject.getString("kontak")
        );
        return budaya;
    }

}
