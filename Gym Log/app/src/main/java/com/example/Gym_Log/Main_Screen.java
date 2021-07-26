package com.example.Gym_Log;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void bmi_image(View view) {
        Intent intent = new Intent(this, Bmi_Calculator.class);
        startActivity(intent);
    }

    public void gym_logo(View view) {
        Intent intent = new Intent(this, Gym_Screen.class);
        startActivity(intent);
    }

    public void gymGuide(View view) {
        Intent intent = new Intent(this, gym_guide.class);
        startActivity(intent);
    }
    public void feedback(View view) {
        Intent intent = new Intent(this, feedback.class);
        startActivity(intent);
    }
}