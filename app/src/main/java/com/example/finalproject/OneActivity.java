package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import java.util.ArrayList;

import java.util.Random;

public class OneActivity extends AppCompatActivity {

    private ArrayList<String> quotesOne;
    private Random rand;
    private int random;
    private String output;
    private TextView textView;
    private EditText response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        quotesOne = new ArrayList<>();
        quotesOne.add("We are all just walking and walking and walking to find our way.");
        quotesOne.add("How would your life be different if you stopped validating your victim mentality? Let today be the day you shake off your self-defeating drama and embrace your innate ability to recover and achieve.");
        quotesOne.add("You say you are depressed, but all I see is resilience. You are allowed to feel messed up and inside out. It doesn't mean you are defective; it means you are human.");
        quotesOne.add("You’ll have bad times, but it’ll always wake you up to the good stuff you were not paying attention to.");
        quotesOne.add("Opportunity does not knock; it presents itself when you beat down the door.");
        rand = new Random();
        random = (int) rand.nextInt(5);
        output = quotesOne.get(random);
        textView = findViewById(R.id.textView);
        textView.setText(output);
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                response = (EditText) findViewById(R.id.et_simple);
                String responseStr = response.getText().toString();
                Intent i = new Intent(OneActivity.this, Journal.class);
                i.putExtra("response", responseStr);
                Journal.responseList.add(response.getText().toString());
                response.getText().clear();
                OneActivity.this.startActivity(i);
            }
        });
    }
}
