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

public class TwoActivity extends AppCompatActivity {

    private ArrayList<String> quotesTwo;
    private Random rand;
    private int random;
    private String output;
    private TextView textView;
    private EditText response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        quotesTwo = new ArrayList<>();
        quotesTwo.add("If you want better, go get better.");
        quotesTwo.add("Struggle is not the identity. You must learn to live while you struggle , such that anyone who sees you can separate from your life.");
        quotesTwo.add("Do not let another day go by where your dedication to other people's opinions is greater than your dedication to your own emotions.");
        quotesTwo.add("It’s okay to not be okay right now.");
        quotesTwo.add("Whenever you feel like a failure, just remember that even Coca-Cola only sold 25 bottles their first year. Everything is hard before it is easy.");
        rand = new Random();
        random = (int) rand.nextInt(5);
        output = quotesTwo.get(random);
        textView = findViewById(R.id.textView);
        textView.setText(output);
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                response = (EditText) findViewById(R.id.et_simple);
                String responseStr = response.getText().toString();
                Intent i = new Intent(TwoActivity.this, Journal.class);
                i.putExtra("response", responseStr);
                Journal.responseList.add(response.getText().toString());
                response.getText().clear();
                TwoActivity.this.startActivity(i);
            }
        });
    }
}
