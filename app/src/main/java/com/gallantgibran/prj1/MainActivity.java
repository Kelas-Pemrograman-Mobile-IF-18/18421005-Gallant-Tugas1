package com.gallantgibran.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNama;
    TextView txtUmur;
    TextView txtHobi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (TextView) findViewById(R.id.txtNama);
        txtNama.setText("Gallant Gibran G P");

        txtUmur = (TextView) findViewById(R.id.txtUmur);
        txtUmur.setText("Belum 21 tahun");

        txtHobi = (TextView) findViewById(R.id.txtHobi);
        txtHobi.setText("Main Game");
    }
}