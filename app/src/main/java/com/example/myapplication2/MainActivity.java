package com.example.myapplication2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView score;
    private Button up;
    private Button down;
    private Button right;
    private Button left;
    private ImageView blueB;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //*****************************************************
        count = 0;
        score = findViewById(R.id.textView);
        right = findViewById(R.id.button4);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blueB.setX(blueB.getX() + 20);
                if(blueB.getX() < 28 || blueB.getX() > 228){
                    count += 1;
                    score.setText(count);
                    blueB.setImageResource(R.drawable.butteerfly2);
                }

            }
        });
        left = findViewById(R.id.button3);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blueB.setX(blueB.getX() - 20);
                if (blueB.getX() < 28 || blueB.getX() > 228) {
                    count += 1;
                    score.setText(count);
                    blueB.setImageResource(R.drawable.butteerfly2);
                }
            }

            ;
        });
        up = findViewById(R.id.button);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blueB.setY(blueB.getY() + 20);
                if (blueB.getY() < 228 || blueB.getY() > 648)
                    count += 1;
                score.setText(count);
                blueB.setImageResource(R.drawable.butteerfly2);
            }
        });
        down = findViewById(R.id.button2);
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blueB.setY(blueB.getY() - 20);
                if (blueB.getY() < 228 || blueB.getY() > 648) {
                    count += 1;
                    score.setText(count);
                    blueB.setImageResource(R.drawable.butteerfly2);
                }
            }
        });
    }}