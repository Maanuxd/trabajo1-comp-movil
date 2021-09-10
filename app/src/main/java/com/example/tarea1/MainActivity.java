package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Log.i( "MainActivity", "onCreate");

        boton = findViewById(R.id.boton1);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Ir a la actividad 2", Toast.LENGTH_LONG).show();

            }
        });
    }


}