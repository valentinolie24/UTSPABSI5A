package com.si5a.utspab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvNama;
    TextView tvJalur;
    TextView tvNomor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("UTS Valentino Lie");

        tvNama = findViewById(R.id.tv_nama);
        tvJalur = findViewById(R.id.tv_jalur);
        tvNomor = findViewById(R.id.tv_nomor);

        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");
        String yJalur = terima.getStringExtra("xJalur");
        String yNomor = terima.getStringExtra("xNomor");
        tvNama.setText(yNama);
        tvJalur.setText(yJalur);
        tvNomor.setText(yNomor);
    }
}