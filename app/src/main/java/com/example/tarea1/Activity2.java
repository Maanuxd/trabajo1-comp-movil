package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Button boton2;
    Intent volverIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i( "Activity2", "Abriendo Activity 2");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        boton2 = findViewById(R.id.boton2);
        volverIntent = new Intent(Activity2.this, MainActivity.class);

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(volverIntent);
                finish();
            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Activity2", "Cerrando Activity2");
    }
}