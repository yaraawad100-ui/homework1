package com.example.myapplication2;

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

    private TextView tvScore;
    private ImageView img1;
    private ImageView img2;
    private Button right;
    private Button left;
    private Button up;
    private Button down;
    private int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScore=findViewById(R.id.textView);
        img1=findViewById(R.id.imageView);
        img2=findViewById(R.id.imageView2);
        down=findViewById(R.id.down);
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setY(img1.getY()-5);
            }
        });
        up=findViewById(R.id.up);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setY(img1.getY()+5);
            }
        });
        right=findViewById(R.id.right);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setX(img1.getX()+5);
            }
        });
        left=findViewById(R.id.left);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setX(img1.getX()-5);
            }
        });
        if((img1.getX()>90 || img1.getX()<10) || (img1.getY()>90) || img1.getY()<10){
            count+=1;
            img1.setImageResource(R.drawable.butteerfly2);
        }

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}