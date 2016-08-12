package com.example.bts.sahayak;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Formicon extends Fragment {
    EditText e6,e7;
    Button btn4,btn5;
    TextView tv2,tv3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_formicon, container, false);


        e6 = (EditText) v.findViewById(R.id.editText6);
        e7 = (EditText) v.findViewById(R.id.editText7);
        btn4 = (Button) v.findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e6.setText("");
                e7.setText("");
            }
        });
        btn5 = (Button) v.findViewById(R.id.button5);
        tv2 = (TextView) v.findViewById(R.id.textView3);
        tv3 = (TextView) v.findViewById(R.id.textView4);
        tv3.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent i=new Intent(getContext(),fourthscreen.class);
                                               startActivity(i);

                                           }
                                       });


        return v;
    }}
