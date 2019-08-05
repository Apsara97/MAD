package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import  android.widget.Button;


public class Main7Activity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        button = findViewById(R.id.btn2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain82Activity();
            }

            private void openMain82Activity() {
                Intent intent1 = new Intent(Main7Activity.this, Main82Activity.class);
                startActivity(intent1);

            }

        });
    }
}

