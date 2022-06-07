package com.example.gamelist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String[] list = {
            "EURO TRUCK SIMULATOR 2",
            "TOMB RAIDER",
            "DRAGON AGE: ORIGINS",
            "PAYDAY 2",
            "EVERLASTING SUMMER"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);


        listView.setAdapter(new ArrayAdapter<>(this,R.layout.name_item,R.id.game, list));
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener((a, v, position, id) -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, DetailActivity.class);
            intent.putExtra("title", position);


            startActivity(intent);
        });
    }

}



