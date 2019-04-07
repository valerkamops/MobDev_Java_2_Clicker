package com.example.mobile_task_1_2_clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    ImageButton tvNumber;
    Button mainBtn;
    Button tvNull;


    private long score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        tvNumber = (ImageButton) findViewById(R.id.tvNumber);
        mainBtn = (Button) findViewById(R.id.mainBtn);
        tvNull = (Button) findViewById(R.id.tvNull);



        tvNumber.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                score += 1;
                UpdateTextView();
            }
        });

        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = score == 0 ? 0 : score - 1;
                UpdateTextView();
            }
        });


        tvNull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                UpdateTextView();
            }
        });
    }

    private void UpdateTextView() {
        mainText.setText("Pressed" + " " + score);
    }
}

