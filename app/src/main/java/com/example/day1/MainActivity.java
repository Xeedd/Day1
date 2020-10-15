package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
       private Button buttonA;
       private TextView txtRandomA;

      Random rn = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        buttonA = findViewById(R.id.buttonA);
        txtRandomA = findViewById(R.id.txtRandomA);


        txtRandomA.setText(Integer.toString(rn.nextInt(100)+ 1));

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                 startActivity(intent);


            }
        });

    }



}