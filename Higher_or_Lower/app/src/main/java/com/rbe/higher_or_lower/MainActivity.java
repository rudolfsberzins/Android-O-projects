package com.rbe.higher_or_lower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void guess(View view) {

        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        Toast.makeText(MainActivity.this, guessEditText.getText().toString(), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
