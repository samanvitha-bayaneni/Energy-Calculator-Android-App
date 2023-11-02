package com.sam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Activity3 extends AppCompatActivity {


    TextView receiver_msg;
    EditText number2;
    Button compare,setalarm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        receiver_msg = (TextView)findViewById(R.id.editText14);
        number2 = (EditText) findViewById(R.id.editText13);
        compare = (Button)findViewById(R.id.button3);
        compare.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View view) {



                    double num1 = Double.parseDouble(receiver_msg.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());{
                        if (num1>=num2) {
                            Toast.makeText(getApplicationContext(), "Good job! Keep it up! You are cosuming enough!", Toast.LENGTH_LONG).show();
                        }
                         else
                            Toast.makeText(getApplicationContext(), "You are consuming more!", Toast.LENGTH_LONG).show();
                    }}
                });
        setalarm =(Button) findViewById(R.id.button6);
        setalarm.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent=new Intent(AlarmClock.ACTION_SET_ALARM);
                intent.putExtra(AlarmClock.EXTRA_HOUR,11);
                intent.putExtra(AlarmClock.EXTRA_MINUTES,30);
                startActivity(intent);            }
        }));
        Intent intent = getIntent();

                String str = intent.getStringExtra("message_key");
                receiver_msg.setText(str);



    }
}


