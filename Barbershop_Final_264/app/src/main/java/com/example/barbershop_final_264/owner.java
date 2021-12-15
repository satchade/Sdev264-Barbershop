package com.example.android.onlinebarbershop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class owner extends AppCompatActivity {

    ImageView instagram;
    ImageView facebook1;
    ImageView git;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner);

        String text2 = "Price";

        WebView riwayat2 = (WebView) findViewById(R.id.riwayat2);
        riwayat2.loadData("<p style=\"text-align: justify\">"+ text2 +"</p>", "text/html", "UTF-8");

        String text3="Name"

        WebView riwayat3 = (WebView) findViewById(R.id.riwayat3);
        riwayat3.loadData("<p style=\"text-align: justify\">"+ text3 +"</p>", "text/html", "UTF-8");

        instagram = (ImageView) findViewById(R.id.instagram);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/samuelatchade/"));
                startActivity(intent);
            }
        });

        facebook1 = (ImageView) findViewById(R.id.facebook1);
        facebook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/samuelatchade"));
                startActivity(intent);
            }
        });

        git = (ImageView) findViewById(R.id.git);
        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://github.com/satchade"));
                startActivity(intent);
            }
        });
    }
}