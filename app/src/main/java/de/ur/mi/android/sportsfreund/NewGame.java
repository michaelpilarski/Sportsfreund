package de.ur.mi.android.sportsfreund;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);

        // back-button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}