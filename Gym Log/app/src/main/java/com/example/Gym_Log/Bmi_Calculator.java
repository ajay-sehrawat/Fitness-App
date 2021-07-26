package com.example.Gym_Log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Bmi_Calculator extends AppCompatActivity {
    EditText editHeight;
    EditText editweight;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);

    }

    public void Calculate_BMI(View view) {
        editHeight = findViewById((R.id.edt_height));
        resultView = findViewById(R.id.result_bmi);
        editweight = findViewById(R.id.edt_weight);
        String hgt= editHeight.getText().toString();
        double i=0;
        if (!"".equals(hgt)){
            i=Double.parseDouble(hgt);
        }
        String wgt = editweight.getText().toString();
        double j=0;
        if (!"".equals(wgt)){
            j=Double.parseDouble(wgt);
        }
        float result = (float) calcBMI(i,j);
        String finalresult = new Float(result).toString();
        resultView.setText(finalresult);
    }

    private double calcBMI(double i, double j) {
       float v = (float) (j/(i*i));
        return v;
    }
}