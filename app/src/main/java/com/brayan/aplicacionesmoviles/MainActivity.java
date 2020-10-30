package com.brayan.aplicacionesmoviles;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView resultadofinal;
    Button btncero, btnuno, btndos, btntres, btncuatro, btncinco, btnseis, btnsiete, btnocho,
            btnnueve, btnigual, btnsuma, btnresta, btnmulti, btnporcentaje, btndiv, btnClear;
    double resultado;
    String operacion, sumatoria,temp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncero = findViewById(R.id.cero);
        btnuno = findViewById(R.id.uno);
        btndos = findViewById(R.id.dos);
        btntres = findViewById(R.id.tres);
        btncuatro = findViewById(R.id.cuatro);
        btncinco = findViewById(R.id.cinco);
        btnseis = findViewById(R.id.seis);
        btnsiete = findViewById(R.id.siete);
        btnocho = findViewById(R.id.ocho);
        btnnueve = findViewById(R.id.nueve);
        btnsuma = findViewById(R.id.mas);
        btnresta = findViewById(R.id.menos);
        btnmulti = findViewById(R.id.mult);
        btndiv = findViewById(R.id.dividir);
        btnporcentaje = findViewById(R.id.percentage);
        btnigual = findViewById(R.id.resultado);
        resultadofinal = findViewById(R.id.resultadofinal);

        btnClear = findViewById(R.id.btnClear);
        resultadofinal = findViewById(R.id.resultadofinal);
    }
        public void EqualButton(View view){
            switch (operacion){
                case "+":
                    resultado = Double.parseDouble(temp) + Double.parseDouble(resultadofinal.getText().toString());
                    resultadofinal.setText(String.valueOf(resultado));
                break;
                case "-":
                    resultado = Double.parseDouble(temp) - Double.parseDouble(resultadofinal.getText().toString());
                    resultadofinal.setText(String.valueOf(resultado));
                    break;
                case "*":
                    resultado = Double.parseDouble(temp) * Double.parseDouble(resultadofinal.getText().toString());
                    resultadofinal.setText(String.valueOf(resultado));
                    break;
                case "/":
                    resultado = Double.parseDouble(temp) / Double.parseDouble(resultadofinal.getText().toString());
                    resultadofinal.setText(String.valueOf(resultado));
                    break;
                case "%":
                    resultado = (Double.parseDouble(temp)/100) * Double.parseDouble(resultadofinal.getText().toString());
                    resultadofinal.setText(String.valueOf(resultado));
                    break;
                case "**":
                    for (int i=1;i<= Double.parseDouble(resultadofinal.getText().toString());i++){
                        resultado = resultado * Double.parseDouble(temp);
                    }
                    resultadofinal.setText(String.valueOf(resultado));
                    break;
            }
        }
    public void PressButton(View view) {

        switch (view.getId()){
            case R.id.cero:
                sumatoria = resultadofinal.getText().toString();
                sumatoria = sumatoria + "0";
                resultadofinal.setText(sumatoria);
                break;
            case R.id.uno:
                sumatoria = resultadofinal.getText().toString();
                sumatoria = sumatoria + "1";
                resultadofinal.setText(sumatoria);
                break;
            case R.id.dos:
                sumatoria = resultadofinal.getText().toString();
                sumatoria = sumatoria + "2";
                resultadofinal.setText(sumatoria);
                break;
            case R.id.tres:
                sumatoria = resultadofinal.getText().toString();
                sumatoria = sumatoria + "3";
                resultadofinal.setText(sumatoria);
                break;
            case R.id.cuatro:
                sumatoria = resultadofinal.getText().toString();
                sumatoria = sumatoria + "4";
                resultadofinal.setText(sumatoria);
                break;
            case R.id.cinco:
                sumatoria = resultadofinal.getText().toString();
                sumatoria = sumatoria + "5";
                resultadofinal.setText(sumatoria);
                break;
            case R.id.seis:
                sumatoria = resultadofinal.getText().toString();
                sumatoria = sumatoria + "6";
                resultadofinal.setText(sumatoria);
                break;
            case R.id.siete:
                sumatoria = resultadofinal.getText().toString();
                sumatoria = sumatoria + "7";
                resultadofinal.setText(sumatoria);
                break;
            case R.id.ocho:
                sumatoria = resultadofinal.getText().toString();
                sumatoria = sumatoria + "8";
                resultadofinal.setText(sumatoria);
                break;
            case R.id.nueve:
                sumatoria = resultadofinal.getText().toString();
                sumatoria = sumatoria + "9";
                resultadofinal.setText(sumatoria);
                break;
            case R.id.punto:
                sumatoria = resultadofinal.getText().toString();
                sumatoria = sumatoria + ".";
                resultadofinal.setText(sumatoria);
                break;
            case R.id.mas:
                operacion="+";
                temp=resultadofinal.getText().toString();
                resultadofinal.setText("");
                break;
            case R.id.menos:
                operacion="-";
                temp=resultadofinal.getText().toString();
                resultadofinal.setText("");
                break;
            case R.id.dividir:
                operacion="/";
                temp=resultadofinal.getText().toString();
                resultadofinal.setText("");
                break;
            case R.id.mult:
                operacion="*";
                temp=resultadofinal.getText().toString();
                resultadofinal.setText("");
                break;
            case R.id.percentage:
                operacion="%";
                temp=resultadofinal.getText().toString();
                resultadofinal.setText("");
                break;
            case R.id.btnClear:
                temp="";
                operacion="";
                resultadofinal.setText("");
                break;
        }
    }


    public void Exit(View view) {
        finish();
    }
}