package com.example.android.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityPindahan extends AppCompatActivity {

    public static final String PENGGUNA_NAMA="com.example.android.helloworld.NAMA";
    public static final String PENGGUNA_PASSWORD="com.example.android.helloworld.PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindahan);
    }

    public void kembali(View view) {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent=new Intent(this, WelcomeActivity.class);
        EditText bacaNama=(EditText) findViewById(R.id.nama);
        EditText bacaPass=(EditText) findViewById(R.id.password);

        String nama=bacaNama.getText().toString();
        String pass=bacaPass.getText().toString();

        intent.putExtra(PENGGUNA_NAMA, nama);
        intent.putExtra(PENGGUNA_PASSWORD, pass);

        startActivity(intent);


    }
}
