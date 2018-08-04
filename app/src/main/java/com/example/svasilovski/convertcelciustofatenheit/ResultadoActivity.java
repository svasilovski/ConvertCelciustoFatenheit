package com.example.svasilovski.convertcelciustofatenheit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    //String temperatura = getIntent().getStringExtra("TEMPERATURA_FAHRENHEIT");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView textView = findViewById(R.id.lblResult);
        Intent intent = getIntent();
        String temp = intent.getStringExtra("TEMPERATURA");

        textView.setText(temp.toString());
    }
}
