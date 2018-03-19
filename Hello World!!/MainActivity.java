package com.example.android.helloworld;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;
    Typeface myCustomFont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=(TextView) findViewById(R.id.my_text);
        myCustomFont=Typeface.createFromAsset(getAssets(), "fonts/ESATHNRML.TTF");
        t.setTypeface(myCustomFont);
    }
}
