package com.example.vikas.bookquotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent= getIntent();

        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void harrypotter(View view){
        Intent hpbook = new Intent(this,Harrypotter.class);
        startActivity(hpbook);
    }

    public void catcherrye(View view){
        Intent citr = new Intent(this,catcherrye.class);
        startActivity(citr);
    }

    public void lotr(View view){
        Intent lordotr = new Intent(this,lordoftherings.class);
        startActivity(lordotr);
    }

    public void lastmant(View view){
        Intent lmit = new Intent(this,lastmantower.class);
        startActivity(lmit);
    }

    public void perks(View view){
        Intent powf = new Intent(this,perksflower.class);
        startActivity(powf);
    }

    public void whitetiger(View view){
        Intent whitet = new Intent(this,thewhitet.class);
        startActivity(whitet);
    }
}
