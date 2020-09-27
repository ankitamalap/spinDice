package com.example.spindice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView dice;
    private Random random = new Random();
    private int numLast;
    private boolean spinning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice = findViewById(R.id.dice);
        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int numberNew = random.nextInt(6) + 1;
        dice.animate().rotationBy(180);
        switch (numberNew) {
            case 1:
                dice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dice.setImageResource(R.drawable.dice6);
                break;
        }

    }
}
