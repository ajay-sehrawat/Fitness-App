package com.example.Gym_Log;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Gym_Screen extends AppCompatActivity {
    private Spinner menu;
    private Spinner weight;
    TextView selectdate;

    private int day,month,year;
    Button save,history;
    db DB;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_screen);

        menu = findViewById(R.id.ex);
        String[] exercises = getResources().getStringArray(R.array.exercises);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,exercises);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        menu.setAdapter(adapter);


        weight = findViewById(R.id.weight);
        String[] weights = getResources().getStringArray(R.array.weights);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,weights);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weight.setAdapter(adapter1);



        selectdate = findViewById(R.id.date);

        save = findViewById(R.id.save);
        history = findViewById(R.id.history);
        DB = new db(this);
        save.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                String exname = menu.getSelectedItem().toString();
                String wgt = weight.getSelectedItem().toString();
                String dt = selectdate.getText().toString();

                Boolean checkinsertdata = DB.insertuserdata(exname,wgt,dt);
                if (checkinsertdata==true){
                    Toast.makeText(Gym_Screen.this,"New Entry Inserted",Toast.LENGTH_SHORT).show();}
                else {
                    Toast.makeText(Gym_Screen.this,"New Entry Not Inserted",Toast.LENGTH_SHORT).show();


                }
            }

        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = DB.getdata();

                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()){
                    buffer.append("Exercise Name: "+res.getString(0)+"\n");
                    buffer.append("Weights Used: "+res.getString(1)+"\n");
                    buffer.append("Date: "+res.getString(2)+"\n\n");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(Gym_Screen.this);
                builder.setCancelable(true);
                builder.setTitle("WORKOUT HISTORY");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });

    }
    public void click(View view){
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        selectdate.setText(dayOfMonth + "-"+ (month+1) + "-"+ year);
                    }
                },year,day,month);
        datePickerDialog.show();
    }
}