package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText colorEditText;
    private Button startSecondActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorEditText = findViewById(R.id.colorEditText);
        startSecondActivityButton = findViewById(R.id.startSecondActivityButton);

        startSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startSecondActivity();
            }
        });
    }

    private void startSecondActivity() {
        String color = colorEditText.getText().toString().toLowerCase();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("color", color);
        startActivity(intent);
    }
}