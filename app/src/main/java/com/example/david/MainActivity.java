package com.example.david;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*  String   texto
         int  ,  Integer,  numero entero
         double, float , numero con decimal
         boolean , true - false
         */
        String jorge = "jorge benaviudes";

        TextView texto = findViewById(R.id.abc);
        texto.setText("来着吧");
        texto.setTextColor(Color.GREEN);
        texto.setOnClickListener(view -> {
            texto.setText(jorge);
            Intent intent = new Intent(this, Botnes.class);
            startActivity(intent);
        });
    }

    private void asdasd(){


    }
}