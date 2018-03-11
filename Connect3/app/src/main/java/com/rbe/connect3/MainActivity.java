package com.rbe.connect3;

import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.stream.IntStream;

public class MainActivity extends AppCompatActivity {

    // 0 = yellow, 1 = red;
    int activePlayer = 0;
    boolean gameActive = true;

    // 2 = unplayed;
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};

    int[][] winningPositions = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};

    public void dropIn(View view) {

        ImageView counter = (ImageView) view;

        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        if (gameState[tappedCounter] == 2 && gameActive) {

            gameState[tappedCounter] = activePlayer;

            counter.setTranslationY(-1000f);
            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.yellow);
                activePlayer = 1;
            } else if (activePlayer == 1) {
                counter.setImageResource(R.drawable.red);
                activePlayer = 0;
            }

            counter.animate().translationYBy(1000f).setDuration(300);

            for (int[] winningPosition:winningPositions) {
                if (gameState[winningPosition[0]] == gameState[winningPosition[1]]
                        && gameState[winningPosition[1]] == gameState[winningPosition[2]]
                        && gameState[winningPosition[0]] != 2) {
                    System.out.println(gameState[winningPosition[0]]);

                    gameActive = false;

                    // Someone Won!

                    TextView winnerMessage = findViewById(R.id.winTextView);

                    winnerMessage.setText(getResources().getString(R.string.yellow_won));
                    if (gameState[winningPosition[0]] == 1){
                        winnerMessage.setText(getResources().getString(R.string.red_won));
                    }


                    LinearLayout gameOver = findViewById(R.id.gameOverLayout);
                    gameOver.setVisibility(View.VISIBLE);
                    break;
                } else {
                    boolean gameIsOver = true;
                    for (int counterSet:gameState) {
                        if (counterSet == 2) {
                            gameIsOver = false;
                        }
                    }
                        if (gameIsOver) {
                            TextView winnerMessage = findViewById(R.id.winTextView);
                            winnerMessage.setText(getResources().getString(R.string.draw));
                            LinearLayout gameOver = findViewById(R.id.gameOverLayout);
                            gameOver.setVisibility(View.VISIBLE);
                        }
                }
            }

        } else if (gameActive) {
            Toast.makeText(MainActivity.this, "Already used!", Toast.LENGTH_SHORT).show();
        }
    }

    public void newGame(View view) {

        gameActive = true;

        LinearLayout gameOver = findViewById(R.id.gameOverLayout);
        gameOver.setVisibility(View.INVISIBLE);

        // 0 = yellow, 1 = red;
        activePlayer = 0;

        GridLayout gridLayout = findViewById(R.id.gameGridLayout);
        for (int i=0; i < gridLayout.getChildCount(); i++) {
            gameState[i] = 2;
            ((ImageView) gridLayout.getChildAt(i)).setImageResource(0   );
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
