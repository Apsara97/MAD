package com.example.madproject;

import android.content.Intent;
import  android.os.Bundle;
import android.view.View;
import  android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Main6Activity extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        button1 = findViewById(R.id.btn2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain7Activity();
            }

            private void openMain7Activity() {
                Intent intent1 = new Intent(Main6Activity.this, Main7Activity.class);
                startActivity(intent1);

            }

        });
    }
}


