package com.example.Gym_Log;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class gym_guide extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_guide);
    };

    public void squatsGuide(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Squats Workout Guide");
        builder.setMessage("Refer to this Video");
        builder.setPositiveButton("Watch Video", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(gym_guide.this, Squats_Screen.class);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("Cancel",null);
        builder.show();
    }


    public void deadliftGuide(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("DeadLift Workout Guide");
        builder.setMessage("Refer to this Video");
        builder.setPositiveButton("Watch Video", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(gym_guide.this, Deadlft_Screen.class);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("Cancel",null);
        builder.show();
    }

    public void bicepsGuide(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Biceps Workout Guide");
        builder.setMessage("Refer to this Video");
        builder.setPositiveButton("Watch Video", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(gym_guide.this, Biceps_Screen.class);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("Cancel",null);
        builder.show();
    }

    public void shoulderGuide(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Shoulder Workout Guide");
        builder.setMessage("Refer to this Video");
        builder.setPositiveButton("Watch Video", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(gym_guide.this, Military_Screen.class);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("Cancel",null);
        builder.show();
    }
    public void abs(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Abs Workout Guide");
        builder.setMessage("Refer to this Video");
        builder.setPositiveButton("Watch Video", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(gym_guide.this, absscreen.class);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("Cancel",null);
        builder.show();
    }
}