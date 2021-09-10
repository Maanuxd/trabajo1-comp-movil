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
    Intent irActividad2Intent;
    Toast irActividad2Toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i( "MainActivity", "Abriendo MainActivity");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.boton1);
        irActividad2Intent = new Intent(MainActivity.this, Activity2.class);
        irActividad2Toast = Toast.makeText(MainActivity.this, "Ir a la actividad 2", Toast.LENGTH_LONG);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(irActividad2Intent);
                irActividad2Toast.show();
            }
        });
    }
}