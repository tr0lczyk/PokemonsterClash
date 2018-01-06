package com.example.android.pokemonsterclash;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    ProgressBar prgR;
    ProgressBar prgB;
    int redScore = 0;
    int blueScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreB(int score){
        TextView scoreView = (TextView) findViewById(R.id.blue_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusOneBlue(View view){
        prgR = (ProgressBar) findViewById(R.id.red_progress_bar);
        prgR.incrementProgressBy(-10);
        blueScore += 1;
        displayScoreB(blueScore);
    }

    public void displayScoreR(int score){
        TextView scoreView = (TextView) findViewById(R.id.red_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusOneRed(View view){
        prgB = (ProgressBar) findViewById(R.id.blue_progress_bar);
        prgB.incrementProgressBy(-10);
        redScore += 1;
        displayScoreR(redScore);
    }


}
