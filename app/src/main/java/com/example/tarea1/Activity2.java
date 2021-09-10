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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Log.i( "Activity2", "onCreate");

        boton2 = findViewById(R.id.boton2);

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Activity2", "onStop: ");
    }
}