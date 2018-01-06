package com.example.android.pokemonsterclash;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    ProgressBar prgR;
    ProgressBar prgB;
    int redScore = 0;
    int blueScore = 0;
    int redMatchScore = 0;
    int blueMatchScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMatchScoreR(int score){
        TextView matchView = (TextView) findViewById(R.id.red_match_score);
        matchView.setText(String.valueOf(score));
    }

    public void displayMatchScoreB(int score){
        TextView matchView = (TextView) findViewById(R.id.blue_match_score);
        matchView.setText(String.valueOf(score));
    }


    public void displayScoreR(int score){
        TextView scoreView = (TextView) findViewById(R.id.red_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreB(int score){
        TextView scoreView = (TextView) findViewById(R.id.blue_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusOneRed(View view){
        prgB = (ProgressBar) findViewById(R.id.blue_progress_bar);
        prgB.incrementProgressBy(-10);
        redScore += 1;
        displayScoreR(redScore);
        if (redScore >= 11 && blueScore <=(redScore - 2)){
            redMatchScore += 1;
            displayMatchScoreR(redMatchScore);
            Toast gameToast = Toast.makeText(this,"PLAYER RED WINS GAME", Toast.LENGTH_LONG);
            gameToast.setGravity(Gravity.CENTER_VERTICAL,0,0);
            gameToast.show();
            if (redMatchScore == 3 && blueMatchScore <= 2){
                Toast matchToast = Toast.makeText(this,"PLAYER RED WON " + redMatchScore + ":" + blueMatchScore + "! ASTONISHING VICTORY!!!!", Toast.LENGTH_LONG);
                matchToast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                matchToast.show();
                prgR = (ProgressBar) findViewById(R.id.red_progress_bar);
                prgR.setProgress(110);
                prgB = (ProgressBar) findViewById(R.id.blue_progress_bar);
                prgB.setProgress(110);
                redScore = 0;
                displayScoreR(redScore);
                blueScore = 0;
                displayScoreB(blueScore);
                redMatchScore = 0;
                displayMatchScoreR(redMatchScore);
                blueMatchScore = 0;
                displayMatchScoreB(blueMatchScore);
            } else {
                prgR = (ProgressBar) findViewById(R.id.red_progress_bar);
                prgR.setProgress(110);
                prgB = (ProgressBar) findViewById(R.id.blue_progress_bar);
                prgB.setProgress(110);
                redScore = 0;
                displayScoreR(redScore);
                blueScore = 0;
                displayScoreB(blueScore);
            }
        }
    }

    public void plusOneBlue(View view){
        prgR = (ProgressBar) findViewById(R.id.red_progress_bar);
        prgR.incrementProgressBy(-10);
        blueScore += 1;
        displayScoreB(blueScore);
        if (blueScore >= 11 && redScore <=(blueScore - 2)){
            blueMatchScore += 1;
            displayMatchScoreB(blueMatchScore);
            Toast gameToast = Toast.makeText(this,"PLAYER RED WINS GAME", Toast.LENGTH_LONG);
            gameToast.setGravity(Gravity.CENTER_VERTICAL,0,0);
            gameToast.show();
            if (blueMatchScore == 3 && redMatchScore <= 2){
                Toast matchToast = Toast.makeText(this,"PLAYER BLUE WON " + blueMatchScore + ":" + redMatchScore + "! ASTONISHING VICTORY!!!!", Toast.LENGTH_LONG);
                matchToast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                matchToast.show();
                prgR = (ProgressBar) findViewById(R.id.red_progress_bar);
                prgR.setProgress(110);
                prgB = (ProgressBar) findViewById(R.id.blue_progress_bar);
                prgB.setProgress(110);
                redScore = 0;
                displayScoreR(redScore);
                blueScore = 0;
                displayScoreB(blueScore);
                redMatchScore = 0;
                displayMatchScoreR(redMatchScore);
                blueMatchScore = 0;
                displayMatchScoreB(blueMatchScore);
            } else {
                prgR = (ProgressBar) findViewById(R.id.red_progress_bar);
                prgR.setProgress(110);
                prgB = (ProgressBar) findViewById(R.id.blue_progress_bar);
                prgB.setProgress(110);
                redScore = 0;
                displayScoreR(redScore);
                blueScore = 0;
                displayScoreB(blueScore);
            }
        }
    }

    public void resetButton(View view){
        prgR = (ProgressBar) findViewById(R.id.red_progress_bar);
        prgR.setProgress(110);
        prgB = (ProgressBar) findViewById(R.id.blue_progress_bar);
        prgB.setProgress(110);
        redScore = 0;
        displayScoreR(redScore);
        blueScore = 0;
        displayScoreB(blueScore);
        redMatchScore = 0;
        displayMatchScoreR(redMatchScore);
        blueMatchScore = 0;
        displayMatchScoreB(blueMatchScore);
    }


}
