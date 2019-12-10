package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one = findViewById(R.id.oneButton);
        Button two = findViewById(R.id.twoButton);
        Button three = findViewById(R.id.threeButton);
        Button four = findViewById(R.id.fourButton);
        Button five = findViewById(R.id.fiveButton);
        Button progress = findViewById(R.id.progress);
        Button journal = findViewById(R.id.journal);
        final MediaPlayer oneSong = MediaPlayer.create(this, R.raw.real_one);
        final MediaPlayer twoSong = MediaPlayer.create(this, R.raw.two_song);
        final MediaPlayer threeSong = MediaPlayer.create(this, R.raw.three_song);
        final MediaPlayer fourSong = MediaPlayer.create(this, R.raw.four_song);
        final MediaPlayer fiveSong = MediaPlayer.create(this, R.raw.five_song);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oneSong.start();
                Journal.ratingList.add("1");
                Intent i = new Intent(MainActivity.this, OneActivity.class);
                startActivity(i);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                twoSong.start();
                Journal.ratingList.add("2");
                Intent i = new Intent(MainActivity.this, TwoActivity.class);
                startActivity(i);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                threeSong.start();
                Journal.ratingList.add("3");
                Intent i = new Intent(MainActivity.this, ThreeActivity.class);
                startActivity(i);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fourSong.start();
                Journal.ratingList.add("4");
                Intent i = new Intent(MainActivity.this, FourActivity.class);
                startActivity(i);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fiveSong.start();
                Journal.ratingList.add("5");
                Intent i = new Intent(MainActivity.this, FiveActivity.class);
                startActivity(i);
            }
        });
        journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Journal.class);
                startActivity(i);
            }
        });
        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Progress.class);
                startActivity(i);
            }
        });
    }
}
