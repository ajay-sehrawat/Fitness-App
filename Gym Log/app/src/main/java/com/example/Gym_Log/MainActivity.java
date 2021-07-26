package com.example.Gym_Log;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    //Splash Screen For 2 Seconds
    //We don't touch main activity in case of splash screen everything happens in the side activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Hide The title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.activity_main);

    }

    public void start_app(View view) {
        Intent intent =new Intent(this, Main_Screen.class);
        startActivity(intent);
    }
}