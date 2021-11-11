package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
private CheckBox ch1, ch2 , ch3 , ch4;
private Button bt5;
private TextView dis2;
private  Button bb ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        bt5 = (Button)findViewById(R.id.bt5);
        ch1 = (CheckBox)findViewById(R.id.cb1);
        ch2 = (CheckBox)findViewById(R.id.cb2);
        ch3 = (CheckBox)findViewById(R.id.cb3);
        ch4 = (CheckBox)findViewById(R.id.cb4);
        dis2 = (TextView)findViewById(R.id.dis2);
bb=(Button) findViewById(R.id.button7);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();
                if (ch1.isChecked()){

                    sb.append(ch1.getText().toString()+" is ordered\n");

                }
                if (ch2.isChecked()){

                    sb.append(ch2.getText().toString()+" is ordered\n");

                }
                if (ch3.isChecked()){

                    sb.append(ch3.getText().toString()+" is ordered\n");

                }
                if (ch4.isChecked()){

                    sb.append(ch4.getText().toString()+" is ordered\n");

                }
dis2.setText(sb+"");
                Toast.makeText(MainActivity4.this, "Ordered Successful !", Toast.LENGTH_LONG).show();
            }
        });

bb.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent intent = new Intent (MainActivity4.this,MainActivity5.class);
        startActivity(intent);

    }
});

    }
}