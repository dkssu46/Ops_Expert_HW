package com.example.ops_expert_4thweek_mission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;
    ImageView imgUp, imgDown;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnChange1);
        btn2 = findViewById(R.id.btnChange2);
        imgUp = findViewById(R.id.imgUp);
        imgDown = findViewById(R.id.imgDown);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.bg);
        int bitmapwidth = bitmap.getIntrinsicWidth();
        int bitmapheight = bitmap.getIntrinsicHeight();
        imgUp.setImageDrawable(bitmap);
        imgUp.getLayoutParams().width = bitmapwidth;
        imgUp.getLayoutParams().height = bitmapheight;

        imgDown.setImageDrawable(bitmap);
        imgDown.getLayoutParams().width = bitmapwidth;
        imgDown.getLayoutParams().height = bitmapheight;

        imgDown.setImageResource(0);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgUp.setImageResource(R.drawable.bg);
                imgDown.setImageResource(0);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgDown.setImageResource(R.drawable.bg);
                imgUp.setImageResource(0);

            }
        });

    }
}