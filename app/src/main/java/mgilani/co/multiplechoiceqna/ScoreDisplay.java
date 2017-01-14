package mgilani.co.multiplechoiceqna;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Muslim Gilan on 04-Jan-17.
 */

public class ScoreDisplay extends AppCompatActivity {

    TextView myScore;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scoredisplay);
        score= getIntent().getIntExtra("score",0);
        myScore = (TextView)findViewById(R.id.endingScore);

        myScore.setText(score+"");
    }
}
