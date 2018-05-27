package com.londonappbrewery.destini;

public class Story {
    private int mStoryId;
    private int mAns1Id;
    private int mAns2Id;
    private boolean mEnd;

    public Story(int storyId, int ans1Id, int ans2Id, boolean end) {
        mStoryId = storyId;
        mAns1Id = ans1Id;
        mAns2Id = ans2Id;
        mEnd = end;
    }

    public int getStoryId() {
        return mStoryId;
    }

    public void setStoryId(int storyId) {
        mStoryId = storyId;
    }

    public int getAns1Id() {
        return mAns1Id;
    }

    public void setAns1Id(int ans1Id) {
        mAns1Id = ans1Id;
    }

    public int getAns2Id() {
        return mAns2Id;
    }

    public void setAns2Id(int ans2Id) {
        mAns2Id = ans2Id;
    }

    public boolean isEnd() {
        return mEnd;
    }

    public void setEnd(boolean end) {
        mEnd = end;
    }
}
