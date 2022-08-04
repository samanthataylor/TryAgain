package com.example.tryagain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = findViewById(R.id.PLUS);
        Button minusButton = findViewById(R.id.MINUS);
        Button divideButton = findViewById(R.id.DIVIDE);
        Button multiplyButton = findViewById(R.id.MULTIPLY);
        EditText firstNum = findViewById(R.id.firstNum);
        EditText secondNum = findViewById(R.id.secondNum);
        EditText answer = findViewById(R.id.answer);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float numOne = Float.parseFloat(firstNum.getText().toString());
                float numTwo = Float.parseFloat(secondNum.getText().toString());

                float result = numOne + numTwo;

                answer.setText(String.valueOf(result));
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float numOne = Float.parseFloat(firstNum.getText().toString());
                float numTwo = Float.parseFloat(secondNum.getText().toString());

                float result = numOne - numTwo;

                answer.setText(String.valueOf(result));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float numOne = Float.parseFloat(firstNum.getText().toString());
                float numTwo = Float.parseFloat(secondNum.getText().toString());

                float result = numOne / numTwo;

                answer.setText(String.valueOf(result));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float numOne = Float.parseFloat(firstNum.getText().toString());
                float numTwo = Float.parseFloat(secondNum.getText().toString());

                float result = numOne * numTwo;

                answer.setText(String.valueOf(result));
            }
        });

    }
}