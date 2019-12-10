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

public class FourActivity extends AppCompatActivity {

    private ArrayList<String> quotesFour;
    private Random rand;
    private int random;
    private String output;
    private TextView textView;
    private EditText response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        quotesFour = new ArrayList<>();
        quotesFour.add("Positivity always wins. Always.");
        quotesFour.add("Don’t limit your challenges. Challenge your limits.");
        quotesFour.add("It’s the possibility of having a dream come true that makes life interesting.");
        quotesFour.add("You're already having a great day, but I hope it gets even better.");
        quotesFour.add("Cheers to always staying true to yourself and never letting what somebody else says distract you from your goals.");
        rand = new Random();
        random = (int) rand.nextInt(5);
        output = quotesFour.get(random);
        textView = findViewById(R.id.textView);
        textView.setText(output);
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                response = (EditText) findViewById(R.id.et_simple);
                String responseStr = response.getText().toString();
                Intent i = new Intent(FourActivity.this, Journal.class);
                i.putExtra("response", responseStr);
                Journal.responseList.add(response.getText().toString());
                response.getText().clear();
                FourActivity.this.startActivity(i);
            }
        });
    }
}
