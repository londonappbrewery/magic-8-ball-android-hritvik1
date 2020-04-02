package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn;
        btn = findViewById(R.id.button);

        final ImageView img;
        img = findViewById(R.id.img1);

        final int[] arr = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int number1;

                number1 = rand.nextInt(5);
                img.setImageResource(arr[number1]);
            }
        });
    }
}
