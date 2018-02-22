package com.example.abdel.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //  score for Team A
    int scoreTeamA = 0;
    //  score for Team B
    int scoreTeamB = 0;
    // Fouls for Team A
    int foulsTeamA = 0;
    // Fouls For Team B
    int foulsTeamB = 0;
    // Red Cards For Team A
    int redCardsTeamA = 0;
    // Red Cards For Team B
    int redCardsTeamB = 0;
    // Yellow Cards For  Team A
    int yellowCardsTeamA = 0;
    // Yellow Cards For  Team B
    int yellowCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 points.
     */
    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase the Fouls for Team A by 2 points.
     */
    public void addFoulForTeamA(View v) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsForTeamA(foulsTeamA);
    }

    /**
     * Increase the Red Cards for Team A by 1 points.
     */
    public void addRedCardForTeamA(View v) {
        redCardsTeamA = redCardsTeamA + 1;
        displayRedCardsForTeamA(redCardsTeamA);
    }

    /**
     * Increase the Yellow Cards for Team A by 1 points.
     */
    public void addYelleowCardForTeamA(View v) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayYellowCardsForTeamA(yellowCardsTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase the Fouls for Team A by 2 points.
     */
    public void addFoulForTeamB(View v) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Increase the Red Cards for Team A by 1 points.
     */
    public void addRedCardForTeamB(View v) {
        redCardsTeamB = redCardsTeamB + 1;
        displayRedCardsForTeamB(redCardsTeamB);
    }

    /**
     * Increase the Yellow Cards for Team A by 1 points.
     */
    public void addYelleowCardForTeamB(View v) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayYellowCardsForTeamB(yellowCardsTeamB);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;

        scoreTeamB = 0;

        foulsTeamA = 0;

        foulsTeamB = 0;

        redCardsTeamA = 0;

        redCardsTeamB = 0;

        yellowCardsTeamA = 0;

        yellowCardsTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);
        displayRedCardsForTeamA(redCardsTeamA);
        displayRedCardsForTeamB(redCardsTeamB);
        displayYellowCardsForTeamA(yellowCardsTeamA);
        displayYellowCardsForTeamB(yellowCardsTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goals_a_text);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goals_b_text);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the fouls for Team B.
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_a_text);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls for Team B.
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_b_text);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the Red Cards for Team B.
     */
    public void displayRedCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_a_text);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the Red Cards for Team B.
     */
    public void displayRedCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_b_text);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the Yellow Cards for Team A.
     */
    public void displayYellowCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_a_text);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the Yellow Cards for Team B.
     */
    public void displayYellowCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_b_text);
        scoreView.setText(String.valueOf(score));
    }
}

