package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Progress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        Button home = findViewById(R.id.home);
        Button journal = findViewById(R.id.journal);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Progress.this, MainActivity.class);
                startActivity(i);
            }
        });
        journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Progress.this, Journal.class);
                startActivity(i);
            }
        });
        TableLayout table = findViewById(R.id.table);
        TableRow top = new TableRow(this);
        String daysHeader = "Days ago ";
        String ratingHeader = "Rating";
        TextView daysView = new TextView(this);
        TextView ratingView = new TextView(this);
        daysView.setText(daysHeader);
        ratingView.setText(ratingHeader);
        TableRow header = new TableRow(this);
        header.addView(daysView);
        header.addView(ratingView);
        table.addView(header);
        for (int i = 0; i < Journal.responseList.size(); i++) {
            TableRow row = new TableRow(this);
            String days = Journal.responseList.size() - i - 1 + " day(s)";
            String response = Journal.ratingList.get(i);
            TextView tv1 = new TextView(this);
            tv1.setText(days);
            TextView tv2 = new TextView(this);
            tv2.setText(response);
            row.addView(tv1);
            row.addView(tv2);
            table.addView(row);
        }
    }
}
