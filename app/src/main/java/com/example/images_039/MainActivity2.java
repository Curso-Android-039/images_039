package com.example.images_039;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    Button volver;
    ImageView imagen1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intento = getIntent();
        String imagen = intento.getStringExtra("imagen");
        String color = intento.getStringExtra("color");

        // vinculación con los objetos visuales

        volver = (Button) findViewById(R.id.volver);
        imagen1 = (ImageView) findViewById(R.id.recibida);

        imagen1.setImageResource(Integer.parseInt(imagen));

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent atras = new Intent(MainActivity2.this, MainActivity.class);
                 startActivity(atras);
            }
        });




    }
}