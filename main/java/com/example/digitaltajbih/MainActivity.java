package com.example.digitaltajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count =0;

    TextView tvResult;
    Button buttonAdd, buttonSub, buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult= findViewById(R.id.tvResult);
        buttonAdd= findViewById(R.id.buttonAdd);
        buttonSub= findViewById(R.id.buttonSub);
        buttonReset= findViewById(R.id.buttonRest);


        //==========================================================================================

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count = count +1;
                tvResult.setText(""+count);
            }
        });


        //==========================================================================================

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count = count -1;
                tvResult.setText(""+count);
            }
        });

        //==========================================================================================

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count= 0;
                tvResult.setText(""+count);
            }
        });


    }
}