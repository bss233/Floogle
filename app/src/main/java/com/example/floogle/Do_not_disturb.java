package com.example.floogle;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Do_not_disturb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_not_disturb);

    }

    public void createNewTime(View view) {

    }

    public void backToMain(View view) {
        Intent switch_screen = new Intent(this, MainActivity.class);
        startActivity(switch_screen);

    }
}
