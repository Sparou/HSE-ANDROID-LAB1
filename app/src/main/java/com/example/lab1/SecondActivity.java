package com.example.lab1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private Button backToMainActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        String color = getIntent().getStringExtra("color");

        if (color != null) {
            int backgroundColor = getColorByString(color);
            getWindow().getDecorView().setBackgroundColor(backgroundColor);
        }

        backToMainActivityButton = findViewById(R.id.backToMainActivityButton);
        backToMainActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private int getColorByString(String color) {
        switch (color) {
            case "red":
                return Color.RED;
            case "green":
                return Color.GREEN;
            case "blue":
                return Color.BLUE;
            case "black":
                return Color.BLACK;
            case "yellow":
                return Color.YELLOW;
            default:
                return Color.WHITE;
        }
    }


}