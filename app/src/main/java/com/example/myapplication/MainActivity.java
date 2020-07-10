package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView goodMorning = findViewById(R.id.goodMorning);
        goodMorning.setText("click me");
        goodMorning.setTextColor(0xFF00FF00);
        goodMorning.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    switch (v.getId()) {
        case R.id.goodMorning:
            TextView goodMorning = (TextView) v;
            goodMorning.setText("Welcome");
            break;
    }
    }
}