package com.example.dam_diegovega;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.envio);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Se envio tus datos", Toast.LENGTH_SHORT).show());

        TextView tv2 = findViewById(R.id.envio);
        tv2.setOnClickListener(view -> Toast.makeText(this, "Se envio tus datos", Toast.LENGTH_SHORT).show());
    }
}