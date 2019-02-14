package com.ctdroid.testnew;
import android.media.Image;

import android.util.Log;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class CtdroidActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctdroid);

        final ImageView leftDice=(ImageView) findViewById(R.id.leftdice);

       final ImageView rightDice=(ImageView) findViewById(R.id.rightdice);

      final  Button rollbtn = (Button) findViewById(R.id.rollBtn);

        final int diceArray[]={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};

        rollbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomnumbergenerator=new Random();

                int num=randomnumbergenerator.nextInt(6);

                leftDice.setImageResource(diceArray[num]);


                num=randomnumbergenerator.nextInt(6);

                rightDice.setImageResource(diceArray[num]);

            }
        });


    }

    }

