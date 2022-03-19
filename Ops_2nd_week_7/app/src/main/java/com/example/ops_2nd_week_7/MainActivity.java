package com.example.ops_2nd_week_7;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    EditText ttext;
    RadioGroup rabu1;
    ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        ttext = (EditText)findViewById(R.id.editTextTextPersonName);
        rabu1 = (RadioGroup)findViewById(R.id.radioGroup);
        img1 = (ImageView) findViewById(R.id.imageView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Toast.makeText(getApplicationContext(),ttext.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(ttext.getText().toString()));
                startActivity(intent);
            }
        });

        rabu1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.rabu1) {
                    img1.setImageResource(R.drawable.and11);
                }
                else {
                    img1.setImageResource(R.drawable.and12);
                }
            }
        });

    }

}