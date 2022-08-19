package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Counter counter;
    private TextView countTV;
    private Button toastButton;
    private Button countButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = new Counter();

        countTV = findViewById(R.id.show_count);
        toastButton = findViewById(R.id.Button_toast);
        countButton = findViewById(R.id.button_count);

    }

    public void toastMessage(View view) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
    }
    public void count(View view){
        counter.increment();
        countTV.setText(counter.getValue().toString());

    }
    public void reset(View view){
        counter.reset();
        countTV.setText(counter.getValue().toString());
    }
}