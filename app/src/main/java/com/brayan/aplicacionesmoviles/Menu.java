package com.brayan.aplicacionesmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void OnclickCalculator(View view) {
                                    //en donde estoy   ,   a donde me dirijo
        Intent myIntent=new Intent(Menu.this,MainActivity.class);
        //ejecutar mi accion de redirigir
        startActivity(myIntent);

    }



}


