package com.example.henry.ninjaturtles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cowabunga(View view) {
        int id = view.getId();

        ImageView img = (ImageView)findViewById(R.id.turtleImg);

        if(id == R.id.mike) {
            img.setImageResource(R.drawable.mike);
        }
        else if(id == R.id.don) {
            img.setImageResource(R.drawable.don);
        }
        else if(id == R.id.leo) {
            img.setImageResource(R.drawable.leo);
        }
        else {
            img.setImageResource(R.drawable.raph);
        }
    }
}
