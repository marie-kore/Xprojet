package com.example.calco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnRepertoire;
    Button btnCalculatrice;
    Button btnCalculIbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculatrice = (Button) findViewById(R.id.btncalco);
        btnCalculIbm    = (Button) findViewById(R.id.btncalibm);
        btnRepertoire   = (Button) findViewById(R.id.btnrepertoire);

        btnRepertoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pas Disponible Ici", Toast.LENGTH_LONG).show();
            }
        });

        btnCalculatrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCalco  = new Intent(MainActivity.this, CaculatriceActivity.class);
                startActivity(intentCalco);
            }
        });

        btnCalculIbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCibm   = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intentCibm);
            }
        });
    }
}
