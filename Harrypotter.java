package com.example.vikas.bookquotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Harrypotter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent= getIntent();
        setContentView(R.layout.activity_harrypotter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void philosopherstone(View view){
        Intent pstone = new Intent(Harrypotter.this,philosophersstone.class);
        startActivity(pstone);
    }

    public void chambersecrets(View view){
        Intent chambersec = new Intent(Harrypotter.this,chamberofsecrets.class);
        startActivity(chambersec);
    }

    public void prisonerazkaban(View view){
        Intent prisoneraz = new Intent(Harrypotter.this,prisonerazkaban.class);
        startActivity(prisoneraz);
    }

    public void gobletfire(View view){
        Intent gobletfire = new Intent(Harrypotter.this,gobletfire.class);
        startActivity(gobletfire);
    }

    public void orderphoenix(View view){
        Intent ophoenix = new Intent(Harrypotter.this,orderphoenix.class);
        startActivity(ophoenix);
    }

    public void halfbloodprince(View view){
        Intent hbprince = new Intent(Harrypotter.this,halfbloodprince.class);
        startActivity(hbprince);
    }

    public void deathlyhallows(View view){
        Intent dhallows = new Intent(Harrypotter.this,deathlyhallows.class);
        startActivity(dhallows);
    }
}
