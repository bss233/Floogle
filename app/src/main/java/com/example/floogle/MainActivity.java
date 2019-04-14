package com.example.floogle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dnd_mode(View view) {
        Intent switch_screen = new Intent(this, Do_not_disturb.class);
        startActivity(switch_screen);

    }
}
