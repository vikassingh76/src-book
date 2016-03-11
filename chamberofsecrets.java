package com.example.vikas.bookquotes;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class chamberofsecrets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chamberofsecrets);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        final TextView tv= (TextView) findViewById(R.id.cosquote);
        Button button = (Button) findViewById(R.id.cosnext);
        Typeface mag = Typeface.createFromAsset(getAssets(),"fonts/cac_champagne.ttf");
        tv.setTypeface(mag);

        String[] strs = getResources().getStringArray(R.array.cosecrets);
        String quote = strs[new Random().nextInt(strs.length)];
        tv.setText(quote);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] strs = getResources().getStringArray(R.array.cosecrets);
                String quote = strs[new Random().nextInt(strs.length)];
                tv.setText(quote);
            }
        });

    }

}
