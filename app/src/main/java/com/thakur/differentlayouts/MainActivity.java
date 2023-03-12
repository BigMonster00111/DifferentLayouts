package com.thakur.differentlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LinearLayout = findViewById(R.id.LinearLayout);
        Button RelativeLayout = findViewById(R.id.RelativeLayout);
        Button TableLayout = findViewById(R.id.TableLayout);
        Button FrameLayout = findViewById(R.id.FrameLayout);
        Button ListView = findViewById(R.id.ListView);
        Button GridLayout = findViewById(R.id.GridLayout);

        LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linear = new Intent(MainActivity.this, Linear.class);
                startActivity(linear);
            }
        });

        RelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relative = new Intent(MainActivity.this, Relative.class);
                startActivity(relative);
            }
        });

        TableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent table = new Intent(MainActivity.this, Table.class);
                startActivity(table);
            }
        });

        FrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frame = new Intent(MainActivity.this, Frame.class);
                startActivity(frame);
            }
        });

        ListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list = new Intent(MainActivity.this, ListView.class);
                startActivity(list);
            }
        });

        GridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent grid = new Intent(MainActivity.this, Grid.class);
                startActivity(grid);
            }
        });

    }
}