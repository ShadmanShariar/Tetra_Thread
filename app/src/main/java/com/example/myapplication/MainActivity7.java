package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;

public class MainActivity7 extends AppCompatActivity {
private Button btn ;
private TextView tv;
//private CalendarView dp;
private Button but2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        btn = (Button) findViewById(R.id.button5);
        tv = (TextView)findViewById(R.id.textView10);
        but2 = (Button) findViewById(R.id.but2);
        //dp = (CalendarView) findViewById((R.id.calendarView));
but2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity7.this,MainActivity.class);
        startActivity(intent);

    }
});

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Date d = new Date();
                tv.setText(d.toString());
//dp.setDate(d.getDate());
            }
        });

    }
}