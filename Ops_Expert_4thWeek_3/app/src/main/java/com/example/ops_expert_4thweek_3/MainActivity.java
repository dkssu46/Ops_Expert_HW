package com.example.ops_expert_4thweek_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnMinus, btnTimes, btnDivide, btnMod;
    TextView textResult;
    String num1, num2;
    Float result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기 2017038012");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnMinus = (Button) findViewById(R.id.BtnMinus);
        btnTimes = (Button) findViewById(R.id.BtnTimes);
        btnDivide = (Button) findViewById(R.id.BtnDivide);
        btnMod = (Button) findViewById(R.id.BtnMod);
        textResult = (TextView) findViewById(R.id.TextResult);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().equals("") || edit2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"값이 없어요", Toast.LENGTH_SHORT).show();
                }
                else {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().equals("") || edit2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"값이 없어요", Toast.LENGTH_SHORT).show();
                }
                else {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().equals("") || edit2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"값이 없어요", Toast.LENGTH_SHORT).show();
                }
                else {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().equals("") || edit2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"값이 없어요", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(edit2.getText().toString().equals("0")) {
                        Toast.makeText(getApplicationContext(),"0으로 나누지 마세요", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        result = Float.parseFloat(num1) / Float.parseFloat(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().equals("") || edit2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"값이 없어요", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(edit2.getText().toString().equals("0")) {
                        Toast.makeText(getApplicationContext(),"0으로 나누지 마세요", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        result = Float.parseFloat(num1) % Float.parseFloat(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }
            }
        });


    }


}