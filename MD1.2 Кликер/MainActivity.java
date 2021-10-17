package com.example.clickerlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    TextView mainText;
    Button mainBtn;
    Button mainBtn1;
    Button mainBtn2;
    ImageButton imgBtn;


    private long score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainText = (TextView) findViewById(R.id.mainTxt);
        mainBtn = (Button) findViewById(R.id.main_btn);
        mainBtn1 = (Button) findViewById(R.id.main_btn1);
        mainBtn2 = (Button) findViewById(R.id.main_btn2);
        imgBtn = (ImageButton) findViewById(R.id.img_btn);
        mainText = (TextView) findViewById(R.id.mainTxt);
        mainBtn.setOnClickListener(clickListener);
        mainBtn1.setOnClickListener(clickListener1);
        mainBtn2.setOnClickListener(clickListener2);
        imgBtn.setOnClickListener(clickListener3);


    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            score++;
            String s = "";
            if (score % 10 == 0 || score % 10 == 1 || score % 10 == 5 || score % 10 == 6 || score % 10 == 7 || score % 10 == 8 || score % 10 == 9 || score == 12 || score == 13 || score == 14) {
                s = "Кнопка нажата " + score + " раз";
            } else {
                s = "Кнопка нажата " + score + " раза";
            }
            mainText.setText(s.toCharArray(), 0, s.length());
            mainBtn.setOnClickListener(clickListener);
        }
    };

    View.OnClickListener clickListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            score--;
            String s = "";
            if (score % 10 == 0 || score % 10 == 1 || score % 10 == 5 || score % 10 == 6 || score % 10 == 7 || score % 10 == 8 || score % 10 == 9 || score == 12 || score == 13 || score == 14) {
                s = "Кнопка нажата " + score + " раз";
            } else {
                s = "Кнопка нажата " + score + " раза";
            }
            mainText.setText(s.toCharArray(), 0, s.length());
            mainBtn1.setOnClickListener(clickListener1);
        }
    };

    View.OnClickListener clickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            score = 0;
            String s = "Кнопка нажата 0 раз";
            mainText.setText(s.toCharArray(), 0, s.length());
            mainBtn2.setOnClickListener(clickListener2);

        }
    };

    View.OnClickListener clickListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            score = 0;
            String s = "Кнопка нажата 0 раз";
            mainText.setText(s.toCharArray(), 0, s.length());
            imgBtn.setOnClickListener(clickListener3);

        }
    };
}