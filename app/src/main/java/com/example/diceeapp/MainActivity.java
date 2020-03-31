package com.example.diceeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int number1;
    int number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
if (savedInstanceState !=null){
    number1 = savedInstanceState.getInt("num1");
    number2 = savedInstanceState.getInt("num2");

}
else {
    number1 = number1;
    number2 = number2;
}
        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollbutton);
        final ImageView leftImage = (ImageView) findViewById(R.id.left_diceimg);
        final ImageView rightImage = (ImageView) findViewById(R.id.right_deceimg);

        final int [] deceeArray = {
                R.drawable.dice13x,
                R.drawable.dice22x,
                R.drawable.dice32x,
                R.drawable.dice43x,
                R.drawable.dice52x,
                R.drawable.dice63x};
        leftImage.setImageResource(deceeArray[number1]);
        rightImage.setImageResource(deceeArray[number2]);
        rollButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    Random randomnumbergenerator1 = new Random();
                    number1 = randomnumbergenerator1.nextInt(6);
                    Random randomnumbergenerator2 = new Random();
                    number2 = randomnumbergenerator2.nextInt(6);
                    leftImage.setImageResource(deceeArray[number1]);
                    rightImage.setImageResource(deceeArray[number2]);

            }
        });


    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("num1",number1);
        outState.putInt("num2",number2);
    }
}
