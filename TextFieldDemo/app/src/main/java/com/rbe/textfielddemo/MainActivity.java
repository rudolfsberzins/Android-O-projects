package com.rbe.textfielddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void gatherFields(View view) {

        EditText usernameField = (EditText) findViewById(R.id.usernameField);
        EditText passwordField = (EditText) findViewById(R.id.passwordField);

        Log.i("Username", usernameField.getText().toString());
        Log.i("Password", passwordField.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
