package com.si5a.utspab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnDaftar;
    EditText etNama;
    EditText etNomor;
    Spinner spJalur;
    CheckBox cbKonfir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("UTS Valentino Lie");

        btnDaftar = findViewById(R.id.btn_daftar);
        etNama = findViewById(R.id.et_nama);
        etNomor = findViewById(R.id.et_nomor);
        spJalur = findViewById(R.id.sp_jalur);
        cbKonfir = findViewById(R.id.cb_konfir);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etNama.getText().toString();
                String nomor = etNomor.getText().toString();
                String jalur = spJalur.getSelectedItem().toString();
                Boolean konfir = cbKonfir.isChecked();

                if(nama.trim().equals("")){
                    etNama.setError("Nama Harus Diisi!!");
                }

                else if (nomor.trim().equals("")){
                    etNomor.setError("Nomor Pendaftaran Harus Diisi!!");
                }

                else if (jalur.trim().equals("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Jalur Pendaftaran Belum Dipilih", Toast.LENGTH_SHORT).show();
                }

                else if (konfir == Boolean.FALSE){
                    Toast.makeText(MainActivity.this, "Harus Konfirmasi!!", Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent daftar = new Intent(MainActivity.this, SecondActivity.class);
                    daftar.putExtra("xNama", nama);
                    daftar.putExtra("xJalur", jalur);
                    daftar.putExtra("xNomor", nomor);
                    startActivity(daftar);
                }
            }
        });

    }
}