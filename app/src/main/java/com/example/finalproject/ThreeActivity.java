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

public class ThreeActivity extends AppCompatActivity {

    private ArrayList<String> quotesThree;
    private Random rand;
    private int random;
    private String output;
    private TextView textView;
    private EditText response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        quotesThree = new ArrayList<>();
        quotesThree.add("Do what you can with all you have, wherever you are.");
        quotesThree.add("Great things never came from comfort zones.");
        quotesThree.add("Would you like me to give you a formula for success? It’s quite simple, really: Double your rate of failure. You are thinking of failure as the enemy of success. But it isn’t at all. You can be discouraged by failure or you can learn from it, so go ahead and make mistakes.");
        quotesThree.add("When Plan A does not work, don’t worry, you still have 25 more letters to go through.");
        quotesThree.add("There is nothing wrong with things taking time.");
        rand = new Random();
        random = (int) rand.nextInt(5);
        output = quotesThree.get(random);
        textView = findViewById(R.id.textView);
        textView.setText(output);
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                response = (EditText) findViewById(R.id.et_simple);
                String responseStr = response.getText().toString();
                Intent i = new Intent(ThreeActivity.this, Journal.class);
                i.putExtra("response", responseStr);
                Journal.responseList.add(response.getText().toString());
                response.getText().clear();
                ThreeActivity.this.startActivity(i);
            }
        });
    }
}
