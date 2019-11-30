package com.example.calco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CaculatriceActivity extends AppCompatActivity {

    TextView btn0;
    TextView btn1;
    TextView btn2;
    TextView btn3;
    TextView btn4;
    TextView btn5;
    TextView btn6;
    TextView btn7;
    TextView btn8;
    TextView btn9;
    TextView btnEgal;
    TextView btnVirgule;
    TextView btnEffacer;
    TextView btnSuppr;
    TextView btnPo;
    TextView btnPf;
    TextView btnPlus;
    TextView btnMoins;
    TextView btnDiv;
    TextView btnMulti;

    TextView ecran;
    TextView result;


    private double chiffre1;
    private boolean clicOperateur = false;
    private boolean update = false;
    private String operateur = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculatrice);

        btn0 = (TextView) findViewById(R.id.button0);
        btn1 = (TextView) findViewById(R.id.button1);
        btn2 = (TextView) findViewById(R.id.button2);
        btn3 = (TextView) findViewById(R.id.button3);
        btn4 = (TextView) findViewById(R.id.button4);
        btn5 = (TextView) findViewById(R.id.button5);
        btn6 = (TextView) findViewById(R.id.button6);
        btn7 = (TextView) findViewById(R.id.button7);
        btn8 = (TextView) findViewById(R.id.button8);
        btn9 = (TextView) findViewById(R.id.button9);
        btnEgal = (TextView) findViewById(R.id.buttonEgal);
        btnVirgule = (TextView) findViewById(R.id.buttonVirgule);
        btnEffacer = (TextView) findViewById(R.id.buttonEffacer);
        btnSuppr = (TextView) findViewById(R.id.buttonSuppr);
        btnPo = (TextView) findViewById(R.id.buttonPo);
        btnPf = (TextView) findViewById(R.id.buttonPf);
        btnPlus = (TextView) findViewById(R.id.buttonPlus);
        btnMoins = (TextView) findViewById(R.id.buttonMoins);
        btnDiv = (TextView) findViewById(R.id.buttonDiv);
        btnMulti = (TextView) findViewById(R.id.buttonMulti);

        ecran   = (TextView) findViewById(R.id.ecran);
        result   = (TextView) findViewById(R.id.result);

        btnPo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CaculatriceActivity.this, "Pas encore Disponible", Toast.LENGTH_LONG).show();
            }
        });
        btnPf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CaculatriceActivity.this, "Pas encore Disponible", Toast.LENGTH_LONG).show();
            }
        });


        btnPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                plusClick();
            }
        });

        btnMoins.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moinsClick();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                divClick();
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mulClick();
            }
        });

        btnEffacer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetClick();
            }
        });

        btnSuppr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                supprClick();
            }
        });

        btnEgal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                egalClick();
            }
        });

        btnVirgule.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick(".");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("9");
            }
        });


    }



    public void chiffreClick(String str) {
        if(update){
            update = false;
        }else{
            if(!ecran.getText().equals("0"))
                str = ecran.getText() + str;
        }
        ecran.setText(str);
    }

    public void supprClick(){
        clicOperateur = false;
        update = true;
        chiffre1 = 0;
        operateur = "";
        String string = ecran.getText().toString();
        if (!ecran.equals("")) {
            string = string.substring(0, string.length()-1);
            ecran.setText(string);
        } else {
            ecran.setText("");
        }

    }




    //Voici la méthode qui fait le calcul qui a été demandé par l'utilisateur
    public void calcul(){
        if(operateur.equals("+")){
            chiffre1 = chiffre1 + Double.valueOf(ecran.getText().toString()).doubleValue();
            ecran.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("-")){
            chiffre1 = chiffre1 - Double.valueOf(ecran.getText().toString()).doubleValue();
            ecran.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("*")){
            chiffre1 = chiffre1 * Double.valueOf(ecran.getText().toString()).doubleValue();
            ecran.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("/")){
            try{
                chiffre1 = chiffre1 / Double.valueOf(ecran.getText().toString()).doubleValue();
                ecran.setText(String.valueOf(chiffre1));
            }catch(ArithmeticException e){
                ecran.setText("0");
            }
        }
    }


    // fonction pour les operations

    public void plusClick(){

        if(clicOperateur){
            this.calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "+";
        update = true;
    }

    //voici la méthode qui est  exécutée lorsqu'on clique sur le bouton -
    public void moinsClick(){
        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "-";
        update = true;
    }

    //voici la méthode qui est  exécutée lorsqu'on clique sur le bouton *
    public void mulClick(){
        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "*";
        update = true;
    }

    //voici la méthode qui est  exécutée lorsqu'on clique sur le bouton /
    public void divClick(){
        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "/";
        update = true;
    }

    //voici la méthode qui est  exécutée lorsqu'on clique sur le bouton =
    public void egalClick(){
        calcul();
        update = true;
        clicOperateur = false;
    }

    //voici la méthode qui est  exécutée lorsque l'on clique sur le bouton C
    public void resetClick(){
        clicOperateur = false;
        update = true;
        chiffre1 = 0;
        operateur = "";
        ecran.setText("");
    }
}

