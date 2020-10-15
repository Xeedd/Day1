package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
      Random rn = new Random();
     private Button buttonB;
     private TextView txtRandomB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonB = findViewById(R.id.buttonB);
        txtRandomB = findViewById(R.id.txtRandomB);
        txtRandomB.setText(Integer.toString(rn.nextInt(100)+ 1));

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}