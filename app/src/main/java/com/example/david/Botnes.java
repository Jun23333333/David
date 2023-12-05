package com.example.david;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.squareup.picasso.Picasso;

public class Botnes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botnes);
        TextView texto = findViewById(R.id.textView);
        Button boton = findViewById(R.id.button);
        ImageView imagen = findViewById(R.id.imageView);
        String user = "david";
        TextInputEditText abc = findViewById(R.id.numero);
        boton.setOnClickListener(view -> {
            texto.setTextColor(Color.RED);
            Picasso.get().load("https://img.freepik.com/vector-premium/imagen-dibujos-animados-hongo-palabra-hongo_587001-200.jpg?w=2000").into(imagen);
            int numero1 = 4;
            int numero2 = 3;
            if(numero1>numero2){
                Log.d("abcdf","el numero 1 es mayor al 2");
            }else {
                Log.d("abcdf","el numero 2 no es menboir al 1");
            }

            if(user.equals("david")){
                texto.setText("el usauriop es david");
            }else {
                texto.setText("el usuario no es david");
            }

            int numero = 230;
            for(int i =1 ;i<numero;i++){
                Log.d("asdf", String.valueOf(i));
            }

            String numeroingresado = String.valueOf(abc.getText());
            texto.setText(numeroingresado);

        });

    }
}