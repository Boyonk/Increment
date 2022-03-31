package com.example.increment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button inc, dec;
    TextView skor, total;
    int count, y, z;
    String x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc = findViewById(R.id.increment);
        dec = findViewById(R.id.decrement);
        skor = findViewById(R.id.score);
        total = findViewById(R.id.total);
        x = skor.getText().toString();
        y = Integer.parseInt(x);

        inc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                count++;
                z = y * count;
                total.setText(z + "");
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                count--;
                z = y * count;
                total.setText(z + "");

            }
        });
    }
}