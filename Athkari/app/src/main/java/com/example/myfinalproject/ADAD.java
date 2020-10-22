package com.example.myfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ADAD extends AppCompatActivity {
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_d_a_d);
        Button count = findViewById(R.id.button3);
        final TextView num = findViewById(R.id.textView4);
        Button reset = findViewById(R.id.button4);


        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              i++ ;
                   num.setText(i + "");


            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.setText(0 + "");

            }
        });

    }
}