package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity3 extends AppCompatActivity {
    private Button button ;
    private TextView textview;
    private EditText edittext;
    private EditText editext2;
    private Button bu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DecimalFormat df = new DecimalFormat(".00");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        bu = findViewById(R.id.button4);
        button = findViewById(R.id.button);
        edittext = findViewById(R.id.edittext);
        textview = findViewById(R.id.dis);
        editext2 = findViewById(R.id.edittext2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText()+"";
                String s2 = editext2.getText()+"";
                double num = 2.205*Integer.parseInt(s);
                double num2 = Double.parseDouble(s2)/3.281;
                double x = Integer.parseInt(s);
                textview.setText("Your Weight In pound "+df.format(num)+","+"Your Height In Meter "+df.format(num2)+
                        " & Your BMI is "+df.format(x/(num2*num2)));
                Toast.makeText(MainActivity3.this, "BMI Calulation Done !", Toast.LENGTH_LONG).show();
            }
        });
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =  new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}