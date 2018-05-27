package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button mAnswer1Button;
    private Button mAnswer2Button;
    private TextView mStoryTextView;
    private int mIndex;
    private Story mCurrentStory;

    Story[] mStoryFlow = new Story[]{
            new Story(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2, false),
            new Story(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2, false),
            new Story(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2, false),
            new Story(R.string.T4_End,0,0, true),
            new Story(R.string.T5_End,0,0, true),
            new Story(R.string.T6_End,0,0, true)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mAnswer1Button = findViewById(R.id.buttonTop);
        mAnswer2Button = findViewById(R.id.buttonBottom);
        // Setting initial Text and buttons
        mCurrentStory = mStoryFlow[mIndex];
        mStoryTextView.setText(mCurrentStory.getStoryId());
        mAnswer1Button.setText(mCurrentStory.getAns1Id());
        mAnswer2Button.setText(mCurrentStory.getAns2Id());

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAnswer1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(1);
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAnswer2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(2);
            }
        });


    }

    private void updateStory(int answerNumber) {
        if(mIndex == 0 && answerNumber == 1){
            mIndex = 2;
        } else if(mIndex == 0 && answerNumber == 2){
            mIndex = 1;
        } else if(mIndex == 1 && answerNumber == 1){
            mIndex = 2;
        } else if(mIndex == 1 && answerNumber == 2){
            mIndex = 3;
        } else if(mIndex == 2 && answerNumber == 1){
            mIndex = 5;
        } else if(mIndex == 2 && answerNumber == 2){
            mIndex = 4;
        }
            mCurrentStory = mStoryFlow[mIndex];
        mStoryTextView.setText(mCurrentStory.getStoryId());
        if(mCurrentStory.isEnd()){
            mAnswer1Button.setVisibility(View.GONE);
            mAnswer2Button.setVisibility(View.GONE);
        } else {
            mAnswer1Button.setText(mCurrentStory.getAns1Id());
            mAnswer2Button.setText(mCurrentStory.getAns2Id());
        }
    }
}
