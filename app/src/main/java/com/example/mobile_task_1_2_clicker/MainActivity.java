package com.example.mobile_task_1_2_clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    Button mainBtn;
    Button decreaseBtn;
    TextView tvNumber;

    private long score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        tvNumber = findViewById(R.id.tvNumber);
        mainBtn = (Button) findViewById(R.id.button);
        decreaseBtn = findViewById(R.id.btnDecrease);



        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                String s = "Кликов: " + score;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        decreaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = score == 0 ? 0 : score-1;
                UpdateNumberView();
            }
        });

        mainBtn.setOnClickListener(clickListener);

    }

    private void UpdateNumberView() {
        tvNumber.setText(String.valueOf(score));
    }
}

