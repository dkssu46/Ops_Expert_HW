package com.example.ops_expert_5thweek_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text;
    Button btn;
    TextView vv, name;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout linear = new LinearLayout(this);
        linear.setOrientation(LinearLayout.VERTICAL);
        setContentView(linear, params);

        name = new TextView(this);
        name.setTextSize(30);
        name.setText("2017038012 이시헌");
        linear.addView(name);
        
        text = new EditText(this);
        text.setHint("입력하세요");
        linear.addView(text);

        btn = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.rgb(0,100,100));
        linear.addView(btn);
        
        vv = new TextView(this);
        vv.setTextSize(30);
        vv.setTextColor(Color.rgb(100,0,100));
        linear.addView(vv);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = text.getText().toString();
                vv.setText(str);
            }
        });


    }
}