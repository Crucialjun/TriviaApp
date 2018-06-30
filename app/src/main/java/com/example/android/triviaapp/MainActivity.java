package com.example.android.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {
        int score = 0;

        CheckBox checkBox2a = findViewById(R.id.question2a);
        CheckBox checkBox2c = findViewById(R.id.question2c);

        RadioButton  radioButton1D = findViewById(R.id.question1d);
        if (radioButton1D.isChecked()){
            score = score + 1;
        }

        if (checkBox2a.isChecked() && checkBox2c.isChecked()){
            score = score + 1;
        }


    }

}
