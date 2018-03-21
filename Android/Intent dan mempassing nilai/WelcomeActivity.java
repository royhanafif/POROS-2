package com.example.android.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent=getIntent();
        String getNama=intent.getStringExtra(ActivityPindahan.PENGGUNA_NAMA);
        String getPass=intent.getStringExtra(ActivityPindahan.PENGGUNA_PASSWORD);

        TextView nama=(TextView) findViewById(R.id.nama1);
        TextView pass=(TextView) findViewById(R.id.pass1);

        nama.setText(getNama);
        pass.setText(getPass);

    }
}
