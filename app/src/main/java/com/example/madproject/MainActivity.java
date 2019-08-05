package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private Button button,button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.btn2);
        button2 = findViewById(R.id.viewMore);

    }

    public void setbutton(View v) {
        Intent intent01 = new Intent(MainActivity.this,Main4Activity.class);
        intent01.putExtra("first",0);
        startActivity(intent01);
    }
    public void setButton2(View V)
    {
        Intent intent02 = new Intent(MainActivity.this,Main2Activity.class);
        intent02.putExtra("second",0);
        startActivity(intent02);
    }


}