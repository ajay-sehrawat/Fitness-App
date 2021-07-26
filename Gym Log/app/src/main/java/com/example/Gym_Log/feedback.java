package com.example.Gym_Log;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        EditText edt1 = findViewById(R.id.name);
        EditText edt2 = findViewById(R.id.name2);
        Button btn = findViewById(R.id.btn);
        RatingBar ratingBar = findViewById(R.id.ratingBar);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((Intent.ACTION_SEND));
                intent.setType("message/html");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"a@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback from App");

                intent.putExtra(Intent.EXTRA_TEXT,"Name: "+edt1.getText().toString()+"\n Message: "+edt2.getText().toString());
                startActivity(intent.createChooser(intent,"Please select Mail"));




            }
        });
    }

}