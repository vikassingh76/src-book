package com.example.vikas.bookquotes;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;

import org.w3c.dom.Text;

import java.util.Random;

public class philosophersstone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philosophersstone);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Intent intent= getIntent();

        final TextView tv = (TextView) findViewById(R.id.pstone);
        Button button = (Button) findViewById(R.id.nextbutton);
        Typeface mag = Typeface.createFromAsset(getAssets(),"fonts/cac_champagne.ttf");
        tv.setTypeface(mag);

        String[] strs = getResources().getStringArray(R.array.pstone);
        String quote = strs[new Random().nextInt(strs.length)];
        tv.setText(quote);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] strs = getResources().getStringArray(R.array.pstone);
                String quote = strs[new Random().nextInt(strs.length)];
                tv.setText(quote);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
}
