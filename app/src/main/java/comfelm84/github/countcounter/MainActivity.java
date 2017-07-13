package comfelm84.github.countcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //region VARIABLES
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Add 3 points into score
    public void addThree(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    // Add 2 points into score
    public void addTwo(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    // Add 1 point into score
    public void addOne(View view) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }
    //---------------------------------------------
// Add 3 points into score
    public void addThreeB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    // Add 2 points into score
    public void addTwoB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    // Add 1 point into score
    public void addOneB(View view) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /* Reset scores*/
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
