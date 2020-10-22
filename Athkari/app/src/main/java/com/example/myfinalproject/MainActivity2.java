package com.example.myfinalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b = getIntent().getExtras();

        TextView title = findViewById(R.id.textView2);
        TextView thikr = findViewById(R.id.textView3);

        athkar x = (athkar) b.getSerializable("athkar");
        title.setText(x.getName());
        thikr.setText(x.getDowaa());

    }
}