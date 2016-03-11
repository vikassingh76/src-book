package com.example.vikas.bookquotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class lordoftherings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lordoftherings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent=  getIntent();

    }

    public void fellowship(View view){
        Intent fellow = new Intent(lordoftherings.this,fellowshipofthering.class);
        startActivity(fellow);
    }

    public void twotowers(View view){
        Intent ttowers = new Intent(lordoftherings.this,thetwotowers.class);
        startActivity(ttowers);
    }

    public void retking(View view){
        Intent roking = new Intent(lordoftherings.this,returnoftheking.class);
        startActivity(roking);
    }
}
