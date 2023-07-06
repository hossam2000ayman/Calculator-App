package com.example.calculatorapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonDot;
    Button buttonEquals;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMultiply;
    Button buttonDivide;

    TextView newNumber;
    TextView result;
    TextView operation;

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newNumber =  findViewById(R.id.newNumber);
        result =  findViewById(R.id.result);
        result.setText("0");
        operation = findViewById(R.id.operation);

        button0 =  findViewById(R.id.button0);

        View.OnClickListener btn0OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            newNumber.append("0");
            }
        };
        button0.setOnClickListener(btn0OnClickListener);

        button1 =  findViewById(R.id.button1);
        View.OnClickListener btn1OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.append("1");
            }
        };
        button1.setOnClickListener(btn1OnClickListener);


        button2 =  findViewById(R.id.button2);
        View.OnClickListener btn2OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.append("2");
            }
        };
        button2.setOnClickListener(btn2OnClickListener);

        button3 =  findViewById(R.id.button3);
        View.OnClickListener btn3OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.append("3");
            }
        };
        button3.setOnClickListener(btn3OnClickListener);

        button4 =  findViewById(R.id.button4);
        View.OnClickListener btn4OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.append("4");
            }
        };
        button4.setOnClickListener(btn4OnClickListener);


        button5 =  findViewById(R.id.button5);
        View.OnClickListener btn5OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.append("5");
            }
        };
        button5.setOnClickListener(btn5OnClickListener);

        button6 =  findViewById(R.id.button6);
        View.OnClickListener btn6OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.append("6");
            }
        };
        button6.setOnClickListener(btn6OnClickListener);

        button7 =  findViewById(R.id.button7);
        View.OnClickListener btn7OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.append("7");
            }
        };
        button7.setOnClickListener(btn7OnClickListener);

        button8 =  findViewById(R.id.button8);
        View.OnClickListener btn8OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.append("8");
            }
        };
        button8.setOnClickListener(btn8OnClickListener);

        button9 =  findViewById(R.id.button9);
        View.OnClickListener btn9OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.append("9");
            }
        };
        button9.setOnClickListener(btn9OnClickListener);


        buttonDot =  findViewById(R.id.buttonDot);


        View.OnClickListener btnDotOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.append(".");
            }
        };
        buttonDot.setOnClickListener(btnDotOnClickListener);



        buttonEquals =  findViewById(R.id.buttonEquals);

        //convert string to double
//        Double textResult  =  Double.valueOf(result.getText().toString());
//        Double textNewNumber = Double.valueOf(newNumber.getText().toString());
        View.OnClickListener btnEqualOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation.getText().equals("+")) {
                    double resultValue = Double.parseDouble(result.getText().toString());
                    double newValue = Double.parseDouble(newNumber.getText().toString());
                    double calculatedResult = resultValue + newValue;
                    result.setText(String.valueOf(calculatedResult));
                } else if (operation.getText().equals("-")) {
                    double resultValue = Double.parseDouble(result.getText().toString());
                    double newValue = Double.parseDouble(newNumber.getText().toString());
                    double calculatedResult = resultValue - newValue;
                    result.setText(String.valueOf(calculatedResult));
                } else if (operation.getText().equals("*")) {
                    double resultValue = Double.parseDouble(result.getText().toString());
                    double newValue = Double.parseDouble(newNumber.getText().toString());
                    double calculatedResult = resultValue * newValue;
                    result.setText(String.valueOf(calculatedResult));
                } else if (operation.getText().equals("/")) {
                    double resultValue = Double.parseDouble(result.getText().toString());
                    double newValue = Double.parseDouble(newNumber.getText().toString());
                    if (newValue != 0) {
                        double calculatedResult = resultValue / newValue;
                        result.setText(String.valueOf(calculatedResult));
                    } else {
                        result.setText("Error: Division by zero");
                    }
                }

            }
        };
        buttonEquals.setOnClickListener(btnEqualOnClickListener);




        buttonPlus =  findViewById(R.id.buttonPlus);

        View.OnClickListener btnPlusOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText("+");

                newNumber.setText("");
            }
        };
        buttonPlus.setOnClickListener(btnPlusOnClickListener);



        buttonMinus =  findViewById(R.id.buttonMinus);
        View.OnClickListener btnMinusOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText("-");
                newNumber.setText("");
            }
        };
        buttonMinus.setOnClickListener(btnMinusOnClickListener);

        buttonMultiply =  findViewById(R.id.buttonMultiply);
        View.OnClickListener btnMultiplyOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText("*");

                newNumber.setText("");
            }
        };
        buttonMultiply.setOnClickListener(btnMultiplyOnClickListener);


//
        buttonDivide =  findViewById(R.id.buttonDivide);
        View.OnClickListener btnDivideOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText("/");

                newNumber.setText("");
            }
        };
        buttonDivide.setOnClickListener(btnDivideOnClickListener);

    }
}