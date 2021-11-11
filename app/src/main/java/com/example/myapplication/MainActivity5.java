package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    private RadioGroup rg;
    private RadioButton rb;
    private Button bt1,bt2;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

rg = (RadioGroup)findViewById(R.id.radioGroup);
bt1 = (Button)findViewById(R.id.bt2);
bt2 = (Button)findViewById(R.id.but5);
tv = (TextView)findViewById(R.id.dis3);

bt1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
int id = rg.getCheckedRadioButtonId();
        rb = (RadioButton)findViewById(id);

        if (rb.getText().equals("Dhaka")){

            tv.setText("Congratulations! Your Answer is Correct");
            Toast.makeText(MainActivity5.this, "Well Done", Toast.LENGTH_LONG).show();
        }
        else{

            tv.setText("Sorry! Your Answer is Wrong");
            Toast.makeText(MainActivity5.this, "Try Again", Toast.LENGTH_LONG).show();
        }

    }
});
bt2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity5.this,MainActivity6.class);
        startActivity(intent);
    }
});
    }
}