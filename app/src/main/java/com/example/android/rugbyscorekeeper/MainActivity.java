package com.example.android.rugbyscorekeeper;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int fouledScoreA = 0;
    int fouledScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by Try + 5 point .
     */
    public void addTryForTeamA(View v) {
        scoreA += 5;
        displayScoreForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by Conversion + 2 point.
     */
    public void addConversionForTeamA(View v) {
        scoreA += 2;
        displayScoreForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by Penalty + 3 point.
     */
    public void addPenaltyForTeamA(View v) {
        scoreA += 3;
        displayScoreForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by Drop Goal + 3 point.
     */
    public void addDropGoalForTeamA(View v) {
        scoreA += 3;
        displayScoreForTeamA(scoreA);
    }

    /**
     * Increase the Fouled score for Team A by + 1.
     */
    public void addFouledForTeamA(View v) {
        fouledScoreA += 1;
        displayFouledScoreForTeamA(fouledScoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays Fouled score for Team A.
     */
    public void displayFouledScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.afouledscore);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the score for Team B by Try + 5 point .
     */
    public void addTryForTeamB(View v) {
        scoreB += 5;
        displayScoreForTeamB(scoreB);
    }

    /**
     * Increase the score for Team B by Conversion + 2 point.
     */
    public void addConversionForTeamB(View v) {
        scoreB += 2;
        displayScoreForTeamB(scoreB);
    }

    /**
     * Increase the score for Team B by Penalty + 3 point.
     */
    public void addPenaltyForTeamB(View v) {
        scoreB += 3;
        displayScoreForTeamB(scoreB);
    }

    /**
     * Increase the score for Team B by Drop Goal + 3 point.
     */
    public void addDropGoalForTeamB(View v) {
        scoreB += 3;
        displayScoreForTeamB(scoreB);
    }

    /**
     * Increase the Fouled score for Team B by + 1.
     */
    public void addFouledForTeamB(View v) {
        fouledScoreB += 1;
        displayFouledScoreForTeamB(fouledScoreB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Fouled score for Team A.
     */
    public void displayFouledScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouledscore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset all the scores back to 0.
     */
    public void resetScore(View v) {
        scoreA = 0;
        scoreB = 0;
        fouledScoreA = 0;
        fouledScoreB = 0;
        displayScoreForTeamA(scoreA);
        displayScoreForTeamB(scoreB);
        displayFouledScoreForTeamA(fouledScoreA);
        displayFouledScoreForTeamB(fouledScoreB);
    }
}