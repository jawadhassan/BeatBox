package com.example.administrator.beatbox;

/**
 * Created by Administrator on 1/23/2018.
 */

public class SoundViewModel {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
    }

    public BeatBox getBeatBox() {
        return mBeatBox;
    }

    public void setBeatBox(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    public String getTitle() {
        return mSound.getName();
    }
}
