package com.example.guessnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView tvInfo;
    EditText etInput;
    Button bControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInfo = (TextView)findViewById(R.id.textView3);
        etInput = (EditText)findViewById(R.id.editTextNumber);
        bControl = (Button)findViewById(R.id.button);

    }
    int number = (int) (Math.random()*(100-1+1)+1);

    public void onClick(View view) {
        try {


            int input = Integer.parseInt(etInput.getText().toString());


            if (input > 100 || input < 1){
                tvInfo.setText("Вы ввели число вне диапазона! Повторите ввод.");
            } else if (input < number) {
                tvInfo.setText(getResources().getString(R.string.behind));


            } else if (input > number) {
                tvInfo.setText(getResources().getString(R.string.ahead));



            } else {
                tvInfo.setText(getResources().getString(R.string.hit));
            }
        } catch (Exception ex) {
            tvInfo.setText("Вы не ввели число!");
        }
    }
    public void onClickExit(View v) {
        finish();
    }
}