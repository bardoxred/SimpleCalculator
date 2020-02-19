package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNum);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNum);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                float num1 = Float.parseFloat(firstNumEditText.getText().toString());
                float num2 = Float.parseFloat(secondNumEditText.getText().toString());
                float result = num1+num2;

                resultTextView.setText(result+"");

            }
        });

        Button subBtn = (Button) findViewById(R.id.subBtn);
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNum);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNum);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                float num1 = Float.parseFloat(firstNumEditText.getText().toString());
                float num2 = Float.parseFloat(secondNumEditText.getText().toString());
                float result = num1-num2;

                resultTextView.setText(result+"");
            }
        });

        Button multiplyBtn = (Button) findViewById(R.id.multiplyBtn);
        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNum);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNum);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                float num1 = Float.parseFloat(firstNumEditText.getText().toString());
                float num2 = Float.parseFloat(secondNumEditText.getText().toString());
                float result = num1*num2;

                resultTextView.setText(result+"");
            }
        });

        Button divideBtn = (Button) findViewById(R.id.divideBtn);
        divideBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNum);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNum);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                float num1 = Float.parseFloat(firstNumEditText.getText().toString());
                float num2 = Float.parseFloat(secondNumEditText.getText().toString());
                if(num2==0){
                    resultTextView.setText("Do not divide by 0");
                }
                else{
                    float result = num1/num2;
                    resultTextView.setText(result+"");
                }

            }
        });

        Button resetBtn = (Button) findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNum);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNum);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                firstNumEditText.setText("0");
                secondNumEditText.setText("0");
                resultTextView.setText("");
            }
        });

    }
}
