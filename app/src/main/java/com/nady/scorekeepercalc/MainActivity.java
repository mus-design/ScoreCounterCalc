  package com.nady.scorekeepercalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

  public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);

    }

      /**
       * display a given score for teamB
       * @param score
       */
      private void displayForTeamB(int score) {
       TextView scoreView = findViewById(R.id.tv_teamB);
       scoreView.setText(String.valueOf(score));
      }
      /**
       * increase score for team B by 1
       *
       */
      public void addOneForTeamB(View view){
          displayForTeamB(1);

      }

      /**
       * increase score for teamB by 2
       * @param view
       */
      public void addTwoForTeamB(View view){
          int score = 0;
          int scoreTeam = score + 2;
          displayForTeamB(scoreTeam);
      }

      /**
       * increase score for teamB by 3
       * @param view
       */
      public void addThreeForTeamB(View view){
          int score = 0;
          int scoreTeam = score + 3;
          displayForTeamB(scoreTeam);
      }

      /**
       *  display a given score for TeamA
       * @param scoreTeamA
       */
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = findViewById(R.id.tv_teamA);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

      /**
       * increase score for team A by 1
       * @param view
       */
    public void addOneForTeamA(View view){
        displayForTeamA(1);
    }

      /**
       * increase score for team A by 3
       * @param view
       */
    public void addThreeForTeamA(View view){
        int scoreTeamA = 0;
        int scoreTeam = scoreTeamA + 3;
             displayForTeam(scoreTeam);
    }

      private void displayForTeam(int scoreTeamA) {


      }


      /**
       * increase score for TeamA by 2
       * @param view
       */

          public void addTwoForTeamA(View view){
              int scoreTeamA = 0;
              int scoreTeam = scoreTeamA + 2;
              displayForTeamA(scoreTeam);
          }
}