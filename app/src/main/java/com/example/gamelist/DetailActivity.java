package com.example.gamelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WebView webView = findViewById(R.id.webView);

        int position = getIntent().getExtras().getInt("title");

        if (position == 0) {
            webView.loadUrl("https://store.steampowered.com/app/227300/Euro_Truck_Simulator_2/");
        }
        if (position == 1) {
            webView.loadUrl("https://store.steampowered.com/app/203160/Tomb_Raider/");

        }
        if (position == 2) {
            webView.loadUrl("https://store.steampowered.com/app/17450/Dragon_Age_Origins/");

        }
        if (position == 3) {
            webView.loadUrl("https://store.steampowered.com/app/218620/PAYDAY_2/");

        }
        if (position == 4) {
            webView.loadUrl("https://store.steampowered.com/app/331470/Everlasting_Summer/");

        }

    }
}