package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class Main2Activity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.btn2);


        Intent intent02 = getIntent();
        String s2 = intent02.getStringExtra("first");
    }

    public void setbutton(View v) {
        Intent intent01 = new Intent(Main2Activity.this, Main82Activity.class);
        intent01.putExtra("first", 0);
        startActivity(intent01);
    }

}
