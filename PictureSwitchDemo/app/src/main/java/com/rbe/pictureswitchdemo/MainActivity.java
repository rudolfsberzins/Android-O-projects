package com.rbe.pictureswitchdemo;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void switchImage(View view) {

        Log.i("Test", "Button Clicked");
        ImageView iv = (ImageView) findViewById(R.id.iv);
        iv.setImageResource(R.drawable.index);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
