package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Journal extends AppCompatActivity {

    public static ArrayList<String> responseList = new ArrayList<>();
    public static ArrayList<String> ratingList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);
        LinearLayout myLinearLayout = findViewById(R.id.LinearLayout);
        Intent i = getIntent();
        for (int x = 0; x < responseList.size(); x++) {
            if (responseList.size() > 14) {
                while (responseList.size() > 14) {
                    responseList.remove(0);
                }
            }
            if (ratingList.size() > 14) {
                while (ratingList.size() > 14) {
                    ratingList.remove(0);
                }
            }
            TextView addedTextView = new TextView(this);
            String parameter = (responseList.size() - x - 1) + " day(s) ago, you rated your day a " + ratingList.get(x) + ". Reason: " + responseList.get(x);
            addedTextView.setText(parameter);
            myLinearLayout.addView(addedTextView);
        }
        Button home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Journal.this, MainActivity.class);
                startActivity(i);
            }
        });
        Button progress = findViewById(R.id.progress);
        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Journal.this, Progress.class);
                startActivity(i);
            }
        });
    }
}
