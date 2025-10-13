package com.example.myapplication2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
    final int [] lives = {5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //**********************
        score = findViewById(R.id.tvScore);
        score.setText("Lives : " + lives[0]+" ");
        blueB=findViewById(R.id.imageView);
        right = findViewById(R.id.button4);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blueB.setX(blueB.getX() + 20);
                Toast.makeText(MainActivity.this,blueB.getX()+", "+blueB.getY(),  Toast.LENGTH_SHORT).show();
                if(blueB.getX() < 50 || blueB.getX() > 100){
                    blueB.setImageResource(R.drawable.butteerfly2);
                    lives[0]--;
                    score.setText("Lives : " + lives[0]+" ");
                }

            }
        });
        left = findViewById(R.id.button3);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blueB.setX(blueB.getX() - 20);
                if (blueB.getX() < 50 || blueB.getX() > 100) {
                    blueB.setImageResource(R.drawable.butteerfly2);
                    lives[0]--;
                    score.setText("Lives : " + lives[0]+" ");
                }
                if(lives[0] == 0){
                    finish();
                    System.exit(0);
                }
            }

            ;
        });
        up = findViewById(R.id.button);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blueB.setY(blueB.getY() - 20);
                if (blueB.getY() < 100 || blueB.getY() > 500){
                    blueB.setImageResource(R.drawable.butteerfly2);
                lives[0]--;
                score.setText("Lives : " + lives[0]+" ");}
                if(lives[0] == 0){
                    finish();
                    System.exit(0);
                }
            }
        });
        down = findViewById(R.id.button2);
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blueB.setY(blueB.getY() + 20);
                if (blueB.getY() < 100 || blueB.getY() > 500) {
                    blueB.setImageResource(R.drawable.butteerfly2);
                    lives[0]--;
                    score.setText("Lives : " + lives[0]+" ");
                }
                if(lives[0] == 0){
                    finish();
                    System.exit(0);
                }
            }
        });
    }}