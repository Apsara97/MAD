package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    private Button button3, button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button3 = findViewById(R.id.btn2);
        button1 = findViewById(R.id.btn3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openMain5Activity();
            }

            private void openMain5Activity() {
                Intent intent1 = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(intent1);
            }

        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain6Activity();
            }

            private  void openMain6Activity() {
                Intent intent1 = new Intent(Main4Activity.this, Main6Activity.class);
                startActivity(intent1);
            }
        });
    }
}
