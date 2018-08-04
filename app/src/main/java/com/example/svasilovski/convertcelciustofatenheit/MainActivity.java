package com.example.svasilovski.convertcelciustofatenheit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void convertCelsiusToFahrenheit(View view){
        EditText temp= findViewById(R.id.txtTemperature);
        if(!temp.getText().toString().trim().isEmpty()) {
            double temperatura = Double.parseDouble(temp.getText().toString())*9/5+32;

            Intent intent = new Intent(this, ResultadoActivity.class);
            intent.putExtra("TEMPERATURA", String.format(getString(R.string.message), temperatura));
            startActivity(intent);
        }else{
            Toast.makeText(this, getString(R.string.messageTempNull), Toast.LENGTH_SHORT).show();
        }
    }
}
