package com.example.pirmasprojektas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button  btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnC, btnEqual, btnAdd, btnDivide, btnFactorial, btnSin, btnCos, btnMinus, btnMultiply, btnExpo;
    float number0, number1;
    double answer;
    boolean add, divide, minus, multiply, expo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.textView);

        btn0=(Button)findViewById(R.id.button0);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);

        btnC=(Button)findViewById(R.id.buttonC);
        btnEqual=(Button)findViewById(R.id.buttonEqual);

        btnAdd=(Button)findViewById(R.id.buttonAdd);
        btnDivide=(Button)findViewById(R.id.buttonDivide);
        btnFactorial=(Button)findViewById(R.id.buttonFactor);
        btnSin=(Button)findViewById(R.id.buttonSin);
        btnCos=(Button)findViewById(R.id.buttonCos);
        btnMinus=(Button)findViewById(R.id.buttonMinus);
        btnMultiply=(Button)findViewById(R.id.buttonMultiply);
        btnExpo=(Button)findViewById(R.id.buttonExp);

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText(tv.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText(tv.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText(tv.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText(tv.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText(tv.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText(tv.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText(tv.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText(tv.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText(tv.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText(tv.getText() + "9");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText("");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (tv == null) {
                    tv.setText("");
                } else {
                    number0 = Float.parseFloat(tv.getText().toString());
                    add = true;
                    tv.setText(null);
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (tv == null) {
                    tv.setText("");
                } else {
                    number0 = Float.parseFloat(tv.getText().toString());
                    minus = true;
                    tv.setText(null);
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (tv == null) {
                    tv.setText("");
                } else {
                    number0 = Float.parseFloat(tv.getText().toString());
                    divide = true;
                    tv.setText(null);
                }
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (tv == null) {
                    tv.setText("");
                } else {
                    number0 = Float.parseFloat(tv.getText().toString());
                    multiply = true;
                    tv.setText(null);
                }
            }
        });
        btnExpo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (tv == null) {
                    tv.setText("");
                } else {
                    number0 = Float.parseFloat(tv.getText().toString());
                    expo = true;
                    tv.setText(null);
                }
            }
        });
        btnFactorial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (tv == null) {
                    tv.setText("");
                } else {
                    number0 = Float.parseFloat(tv.getText() + "");
                    int factorial = 1;
                    for (int i = (int)number0; i > 0; i--) {
                        factorial *= i;
                    }
                    tv.setText(factorial + "");
                }
            }
        });
        btnSin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (tv == null) {
                    tv.setText("");
                } else {
                    number0 = Float.parseFloat(tv.getText() + "");
                    answer = Math.sin(number0);
                    tv.setText(answer + "");
                }
            }
        });
        btnCos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (tv == null) {
                    tv.setText("");
                } else {
                    number0 = Float.parseFloat(tv.getText()  + "");
                    answer = Math.cos(number0);
                    tv.setText(answer + "");
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Float.parseFloat(tv.getText().toString());

                if (add) {
                    tv.setText((int)number0 + (int)number1 + "");
                    add = false;
                }

                if (minus) {
                    tv.setText((int)number0 - (int)number1 + "");
                    minus = false;
                }

                if (multiply) {
                    tv.setText((int)number0 * (int)number1 + "");
                    multiply = false;
                }

                if (expo) {
                    tv.setText(Math.pow(number0, number1) + "");
                    expo = false;
                }

                if (divide) {
                    if ((number0 == 0) || (number1 == 0)) {
                        tv.setText("Klaida");
                        divide = false;
                    } else {
                        tv.setText(number0 / number1 + "");
                        divide = false;
                    }
                }
            }
        });
    }
}