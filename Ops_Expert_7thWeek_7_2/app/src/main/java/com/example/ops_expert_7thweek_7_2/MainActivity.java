package com.example.ops_expert_7thweek_7_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기 (컨텍스트 메뉴)");
        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        btn1 = (Button) findViewById(R.id.btn1);
        registerForContextMenu(btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        registerForContextMenu(btn2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflater = getMenuInflater();
        if(v==btn1) {
            menu.setHeaderTitle("배경색 변경");

            mInflater.inflate(R.menu.menu1,menu);
        }
        if(v == btn2) {
            mInflater.inflate(R.menu.menu2, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemred:
                baseLayout.setBackgroundColor(Color.RED);
                break;
            case R.id.itemgreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.itemblue:
                baseLayout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.subrotate:
                btn1.setRotation(45);
                break;
            case R.id.size:
                btn1.setScaleX(2);
                break;
        }
        return true;
    }
}