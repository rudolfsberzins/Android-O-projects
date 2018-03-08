package com.rbe.numbersgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void makeToast(String givenString) {
        Toast.makeText(MainActivity.this, givenString, Toast.LENGTH_SHORT).show();
    }

    public void checkNumber(View view) {

        EditText givenNumber = findViewById(R.id.numberEditText);
        if (givenNumber.getText().toString().isEmpty()) {
            makeToast("You have to enter a number!");
            return;
        }

        int givenNumberInt = Integer.parseInt(givenNumber.getText().toString());
        Guesser guess = new Guesser();

        if (guess.isSquare(givenNumberInt) && guess.isTriangular(givenNumberInt)) {
            makeToast(givenNumberInt + " is both triangular and square!");
        } else if (guess.isSquare(givenNumberInt) && !guess.isTriangular(givenNumberInt)) {
            makeToast(givenNumberInt + " is square, but not triangular!");
        } else if (!guess.isSquare(givenNumberInt) && guess.isTriangular(givenNumberInt)) {
            makeToast(givenNumberInt + " is triangular, but not square!");
        } else {
            makeToast(givenNumberInt + " is neither square or triangular!");
        }
    }

    class Guesser {

        public boolean isSquare(long n) {
            if (n <= 0) {
                return false;
            }

            long tst = (long)(Math.sqrt(n) + 0.5);

            return tst*tst == n;
        }


        public boolean isTriangular(long d) {

            if (d <= 0) {
                return false;
            }

            long s = (8*d+1);

            return isSquare(s);
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
