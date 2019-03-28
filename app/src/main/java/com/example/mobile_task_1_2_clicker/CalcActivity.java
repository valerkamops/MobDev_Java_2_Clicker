package com.example.mobile_task_1_2_clicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalcActivity extends Activity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bm,br;
    String calc="";
    TextView tvcalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        tvcalc = findViewById(R.id.tvcalc);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bm = findViewById(R.id.bm);
        br = findViewById(R.id.br);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc=calc+"0";
                tvcalc.setText(calc);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc=calc+"1";
                tvcalc.setText(calc);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc=calc+"2";
                tvcalc.setText(calc);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc=calc+"3";
                tvcalc.setText(calc);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc=calc+"4";
                tvcalc.setText(calc);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc=calc+"5";
                tvcalc.setText(calc);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc=calc+"6";
                tvcalc.setText(calc);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc=calc+"7";
                tvcalc.setText(calc);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc=calc+"8";
                tvcalc.setText(calc);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc=calc+"9";
                tvcalc.setText(calc);
            }
        });
    }
}



