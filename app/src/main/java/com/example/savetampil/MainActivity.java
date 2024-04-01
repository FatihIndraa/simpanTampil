package com.example.savetampil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button saveInternal;
    private TextView nim,nama;
    private TextView hnim,hnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nim=(TextView) findViewById(R.id.inputData);
        nama=(TextView) findViewById(R.id.inputData1);
        hnim=(TextView) findViewById(R.id.hasilNim);
        hnama=(TextView) findViewById(R.id.hasilNama);
        saveInternal=(Button) findViewById(R.id.saveInternal);
        saveInternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String xnim,xnama;
                xnim=nim.getText().toString().trim();
                xnama=nama.getText().toString().trim();

                hnim.setText(xnim);
                hnama.setText(xnama);
            }
        });

    }
}