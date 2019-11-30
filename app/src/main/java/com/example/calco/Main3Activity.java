package com.example.calco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    TextView height;
    TextView weight;
    Button btnCalcul;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        height = (TextView) findViewById(R.id.height);
        weight = (TextView) findViewById(R.id.weight);
        btnCalcul   =   (Button) findViewById(R.id.calc);


        btnCalcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateBMI();
                //Toast.makeText(Main3Activity.this, "resultat si dessous", Toast.LENGTH_LONG).show();
            }
            //

        });
    }

    public void calculateBMI() {
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if (heightStr != null && !"".equals(heightStr)
                && weightStr != null  &&  !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr) / 100;
            float weightValue = Float.parseFloat(weightStr);

            float bmi = weightValue / (heightValue * heightValue);

            displayBMI(bmi);

            System.out.println(bmi);
        }
    }

    private void displayBMI(float bmi) {

        String bmiLabel = "Vote résultat est : " + bmi + "\n\n" + "";
        Toast.makeText(Main3Activity.this, bmiLabel, Toast.LENGTH_LONG).show();

    }
}
