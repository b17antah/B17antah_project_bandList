package com.example.b17antah.b17antah_project_bandlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class InformationForBand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_for_band);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String infoMe = intent.getStringExtra("InfoB");

        TextView textViewInfo = (TextView)findViewById(R.id.informationtext_BandName);
        textViewInfo.setText(infoMe);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
