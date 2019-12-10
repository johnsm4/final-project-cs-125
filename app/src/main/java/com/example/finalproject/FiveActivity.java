package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class FiveActivity extends AppCompatActivity {

    private ArrayList<String> quotesFive;
    private Random rand;
    private int random;
    private String output;
    private TextView textView;
    private EditText response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        quotesFive = new ArrayList<>();
        quotesFive.add("In your own life, it is important to know how spectacular you are.");
        quotesFive.add("Make each day your masterpiece.");
        quotesFive.add("Be so good they can’t ignore you.");
        quotesFive.add("I can and I will. Watch me.");
        quotesFive.add("Keep it up!");
        rand = new Random();
        random = (int) rand.nextInt(5);
        output = quotesFive.get(random);
        textView = findViewById(R.id.textView);
        textView.setText(output);
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                response = (EditText) findViewById(R.id.et_simple);
                String responseStr = response.getText().toString();
                Intent i = new Intent(FiveActivity.this, Journal.class);
                i.putExtra("response", responseStr);
                Journal.responseList.add(response.getText().toString());
                response.getText().clear();
                FiveActivity.this.startActivity(i);
            }
        });
    }
}
