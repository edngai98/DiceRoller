package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private ImageView imageViewDice2;
    private Random rng = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.rollDiceButton);
        imageViewDice = (ImageView) findViewById(R.id.image_view_dice);
        imageViewDice2 = (ImageView) findViewById(R.id.image_view_dice2);

        final TextView sumDice = (TextView) findViewById(R.id.sumOfDice);

        button.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v) {
               int sum = rollDice1() + rollDice2();

               sumDice.setText(String.valueOf(sum));
           }

        });

    }

    private int rollDice1() {
        int randomNumber = rng.nextInt(6) + 1;


        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.one);
                return 1;
                //break;
            case 2:
                imageViewDice.setImageResource(R.drawable.two);
                return 2;
                //break;
            case 3:
                imageViewDice.setImageResource(R.drawable.three);
                return 3;
                //break;
            case 4:
                imageViewDice.setImageResource(R.drawable.four);
                return 4;
                //break;
            case 5:
                imageViewDice.setImageResource(R.drawable.five);
                return 5;
                //break;
            case 6:
                imageViewDice.setImageResource(R.drawable.six);
                return 6;
                //break;
        }
        return 0;
    }
    private int rollDice2() {
        int randomNumber2 = rng.nextInt(6) +1;
        switch (randomNumber2) {
            case 1:
                imageViewDice2.setImageResource(R.drawable.one);
                return 1;
                //break;
            case 2:
                imageViewDice2.setImageResource(R.drawable.two);
                return 2;
                //break;
            case 3:
                imageViewDice2.setImageResource(R.drawable.three);
                return 3;
                //break;
            case 4:
                imageViewDice2.setImageResource(R.drawable.four);
                return 4;
                //break;
            case 5:
                imageViewDice2.setImageResource(R.drawable.five);
                return 5;
                //break;
            case 6:
                imageViewDice2.setImageResource(R.drawable.six);
                return 6;
                //break;
        }
        return 0;
    }
}
