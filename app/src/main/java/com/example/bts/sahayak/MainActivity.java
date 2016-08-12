package com.example.bts.sahayak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et1, et2;
    TextView tv1;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.textView);
        et1 = (EditText) findViewById(R.id.editText);

        et2= (EditText) findViewById(R.id.editText2);
        btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == btn1) {
            String username = et1.getText().toString();
            String password = et2.getText().toString();
            if (username.equals(password)) {
                Intent i = new Intent(this, Main2Activity.class);
                startActivity(i);
            } else {

                Toast.makeText(this, "WRONG PASSWORD", Toast.LENGTH_SHORT).show();


            }
        }
        else if (v==btn2){
            Intent i=new Intent(this,SignupActivity.class) ;
        startActivity(i);
        }
    }
}