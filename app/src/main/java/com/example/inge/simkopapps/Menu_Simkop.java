package com.example.inge.simkopapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Menu_Simkop extends AppCompatActivity {
    private long backPressedTime;

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

    @Override
    public void onBackPressed() {
        if(backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else{
            Toast.makeText(getBaseContext(),"Klik tombol kembali lagi untuk keluar",Toast.LENGTH_SHORT).show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}



