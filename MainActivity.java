package com.sam.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    double a=10.5;
    double b=1.2;
    double c=0.7;
    double d=0.07;
    double e=1;
    double f=56;
    double g=16.8;
    double h=15.050;
    double i=6.8;
    double j=151;
    double k=2.1;
    double l=3.5;
    double m=70;
    double n=1.2;
    double o=16.8;
    EditText number1;
    EditText number2;
    EditText number3;
    EditText number4;
    EditText number5;
    EditText number6;
    EditText number7;
    EditText number8;
    EditText number9;
    EditText number10;
    EditText number11;
    EditText number12;
    EditText number13;
    EditText number14;
    EditText number15;
    EditText number16;
    Button Add_button,Next;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.editText);
        number2 = (EditText) findViewById(R.id.editText2);
        number3 = (EditText) findViewById(R.id.editText10);
        number4 = (EditText) findViewById(R.id.editText4);
        number5 = (EditText) findViewById(R.id.editText5);
        number6 = (EditText) findViewById(R.id.editText6);
        number7 = (EditText) findViewById(R.id.editText7);
        number8 = (EditText) findViewById(R.id.editText8);
        number9 = (EditText) findViewById(R.id.editText3);
        number10 = (EditText) findViewById(R.id.editText9);
        number11 = (EditText) findViewById(R.id.editText12);
        number12 = (EditText) findViewById(R.id.editText11);
        number13 = (EditText) findViewById(R.id.editText17);
        number14 = (EditText) findViewById(R.id.editText15);
        number15 = (EditText) findViewById(R.id.editText16);
        number16 = (EditText) findViewById(R.id.editText19);
        Add_button = (Button) findViewById(R.id.button2);
        result = (TextView) findViewById(R.id.editText18);



        Add_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double num3 = Double.parseDouble(number3.getText().toString());
                double num4 = Double.parseDouble(number4.getText().toString());
                double num5 = Double.parseDouble(number5.getText().toString());
                double num6 = Double.parseDouble(number6.getText().toString());
                double num7 = Double.parseDouble(number7.getText().toString());
                double num8 = Double.parseDouble(number8.getText().toString());
                double num9 = Double.parseDouble(number9.getText().toString());
                double num10 = Double.parseDouble(number10.getText().toString());
                double num11 = Double.parseDouble(number11.getText().toString());
                double num12 = Double.parseDouble(number12.getText().toString());
                double num13 = Double.parseDouble(number13.getText().toString());
                double num14 = Double.parseDouble(number14.getText().toString());
                double num15 = Double.parseDouble(number15.getText().toString());
                double num16 = Double.parseDouble(number16.getText().toString());



                double sum = num1 * a + num2*b + num3*c + num4*d + num5*e + num6*f + num7*g + num8*h + num9*i + num10*j + num11*k + num12*l + num13+num14*m+num15*n+num16*o;

                result.setText(Double.toString(sum));
            }
        });
        Next = (Button) findViewById(R.id.button);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                String str = result.getText().toString();


                Intent intent = new Intent(getApplicationContext(), Activity3.class);


                intent.putExtra("message_key", str);


                startActivity(intent);
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}




