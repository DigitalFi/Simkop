package com.example.inge.simkopapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Simkop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_simkop);
    }

    public void informasi_rat(View view) {
        Intent intent = new Intent(Menu_Simkop.this, Jumlah_Koperasi.class);
        startActivity(intent);
    }

    public void data_koperasi(View view) {
        Intent intent = new Intent(Menu_Simkop.this, Jumlah_Anggota.class);
        startActivity(intent);
    }

    public void jenis_koperasi(View view) {
        Intent intent = new Intent(Menu_Simkop.this, Jumlah_Manager.class);
        startActivity(intent);
    }

    public void status_koperasi(View view) {
        Intent intent = new Intent(Menu_Simkop.this, Jumlah_Asset.class);
        startActivity(intent);
    }

    public void Jumlah_Omset (View view) {
        Intent intent = new Intent(Menu_Simkop.this, Jumlah_Omset.class);
        startActivity(intent);
    }

    public void jumlah_koperasi(View view) {
        Intent intent = new Intent(Menu_Simkop.this, Data_Koperasi.class);
        startActivity(intent);
    }
}

