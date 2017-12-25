package com.example.alok.bmicalculator;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;
import java.text.DecimalFormat;

public class ActivityTwo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void calcbmi(View view)
    {
        double height=0;
        double weight=0;
        double bmi=0;
        String msg="";
        EditText e1=(EditText)findViewById(R.id.editText1);
        EditText e2=(EditText)findViewById(R.id.editText2);
        Button b1=(Button)findViewById(R.id.button2);
        TextView t1=(TextView)findViewById(R.id.bmi);
        TextView t2=(TextView)findViewById(R.id.result);
        if (e1.getText().toString().trim().equals("")||e2.getText().toString().trim().equals("")){
            t1.setText("Gochu Details dale bina button kyon daba raha hai.");
            t2.setText("Gadha found!!!!");
        }
        else {
            weight = Double.parseDouble(e1.getText().toString());
            height = Double.parseDouble(e2.getText().toString());
            bmi = height * height;
            bmi = weight / bmi;
            DecimalFormat df = new DecimalFormat("#.###");
            bmi = Double.valueOf(df.format(bmi));
            t1.setText(String.valueOf(bmi));
            if (bmi <= 18.5) {
                msg = "Underweight";
            } else if (bmi > 18.5 && bmi <= 25) {
                msg = "Normal";
            } else if (bmi > 25) {
                msg = "overweight";
            }
            t2.setText(msg);
        }

    }

}
