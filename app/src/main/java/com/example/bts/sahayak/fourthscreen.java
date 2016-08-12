package com.example.bts.sahayak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class fourthscreen extends AppCompatActivity {
    EditText e8,e9,e10,e11,e12,e13,e14,e15,e16;
    Button btn6,btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthscreen);
        e8= (EditText) findViewById(R.id.editText8);
        e9= (EditText) findViewById(R.id.editText9);
        e10= (EditText) findViewById(R.id.editText10);
        e11= (EditText) findViewById(R.id.editText11);
        e12= (EditText) findViewById(R.id.editText12);
        e13= (EditText) findViewById(R.id.editText13);
        e14= (EditText) findViewById(R.id.editText14);
        e15= (EditText) findViewById(R.id.editText15);
        e16= (EditText) findViewById(R.id.editText16);
        btn6= (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e8.setText("");
                e9.setText("");
                e10.setText("");
                e11.setText("");
                e12.setText("");
                e13.setText("");
                e14.setText("");
                e15.setText("");
                e16.setText("");
            }
        });
        btn7= (Button) findViewById(R.id.button7);

    }
}
