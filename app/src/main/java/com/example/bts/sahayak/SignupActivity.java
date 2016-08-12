package com.example.bts.sahayak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {
    Button btn3;
    EditText e3,e4,e5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        e3= (EditText) findViewById(R.id.editText3);
        e4= (EditText) findViewById(R.id.editText4);
        e5= (EditText) findViewById(R.id.editText5);
        btn3= (Button) findViewById(R.id.button3);
    }
}
