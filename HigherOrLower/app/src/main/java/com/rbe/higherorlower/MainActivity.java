package com.rbe.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int givenNumber;

    public void makeToast(String givenString) {
        Toast.makeText(MainActivity.this, givenString, Toast.LENGTH_SHORT).show();
    }

    public void makeAGuess(View view) {

        EditText guessEditText = findViewById(R.id.guessEditText);

        int givenGuessInt = Integer.parseInt(guessEditText.getText().toString());

        if (givenNumber == givenGuessInt){
            makeToast("Correct! Try Again!");
            Random randomNumber = new Random();
            givenNumber = randomNumber.nextInt(20)+1;
        } else if (givenNumber > givenGuessInt){
            makeToast("Higher!");
        } else if (givenNumber < givenGuessInt){
            makeToast("Lower!");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randNumber = new Random();

        givenNumber = randNumber.nextInt(20) + 1;
    }
}
