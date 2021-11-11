package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
private Button btn ;
private EditText box1;
private EditText sign;
private EditText box2;
private TextView dis;
private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
bt = (Button)findViewById(R.id.button3);
        box1 = (EditText)findViewById(R.id.box1);
        box2 = (EditText)findViewById(R.id.box2);
        sign = (EditText)findViewById(R.id.sign);
        btn = (Button)findViewById(R.id.button2);
dis = (TextView)findViewById(R.id.dis);

bt.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
startActivity(intent);

    }
});

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

String s1 = box1.getText().toString();
String s2 = box2.getText().toString();
String s = sign.getText().toString();
try {
    if (s.equals("+")) {
        double aa = Double.parseDouble(s1) + Double.parseDouble(s2);
        dis.setText(aa + "");
        Toast.makeText(MainActivity2.this, "Calulation Done !", Toast.LENGTH_LONG).show();
    } else if (s.equals("-")) {
        double aa = Double.parseDouble(s1) - Double.parseDouble(s2);
        dis.setText(aa + "");
        Toast.makeText(MainActivity2.this, "Calulation Done !", Toast.LENGTH_LONG).show();
    } else if (s.equals("x")) {
        double aa = Double.parseDouble(s1) * Double.parseDouble(s2);
        dis.setText(aa + "");
        Toast.makeText(MainActivity2.this, "Calulation Done !", Toast.LENGTH_LONG).show();
    } else if (s.equals("/")) {
        double aa = Double.parseDouble(s1) / Double.parseDouble(s2);
        dis.setText(aa + "");
        Toast.makeText(MainActivity2.this, "Calulation Done !", Toast.LENGTH_LONG).show();
    } else {
        Toast.makeText(MainActivity2.this, "You Entered A Wrong Sign", Toast.LENGTH_LONG).show();
    }
} catch (Exception e){
    Toast.makeText(MainActivity2.this,"Please Try Again",Toast.LENGTH_LONG).show();
}

            }
        });

    }
}