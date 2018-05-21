package com.example.b17antah.b17antah_project_bandlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
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
        String infoMe = intent.getStringExtra("infoB");

        TextView textViewInfo = (TextView)findViewById(R.id.informationtext_BandName);
        textViewInfo.setText(infoMe);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_about) {
            Intent onwardsMySteed = new Intent(getApplicationContext(), AboutTheApp.class);
            startActivity(onwardsMySteed);
            return true;
        }

        if (id == R.id.action_start) {
            Intent getBack = new Intent(getApplicationContext(), Introduction.class);
            startActivity(getBack);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
