package com.example.images_039;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imagen1;

    ImageView imagen2;

    ImageView imagen3;

    ImageView imagen4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen1= (ImageView) findViewById(R.id.imageView2);
        imagen2=(ImageView) findViewById(R.id.imageView3);

        imagen3= (ImageView) findViewById(R.id.imageView4);

        imagen4= (ImageView) findViewById(R.id.imageView5);




        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamar2(""+R.drawable.tel1,""+R.color.blanco);

            }
        });



        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                llamar2(""+R.drawable.tel2,""+R.color.azul);


            }
        });


        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamar2(""+R.drawable.tel3,""+R.color.verde);

            }
        });


        imagen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamar2(""+R.drawable.tel4,""+R.color.rojo);

            }
        });




    }


    protected  void llamar2( String image,String color){

        Intent intento = new Intent(MainActivity.this, MainActivity2.class);
                intento.putExtra("imagen",image);
                 intento.putExtra("color",color);
                 startActivity(intento);

    }
}




