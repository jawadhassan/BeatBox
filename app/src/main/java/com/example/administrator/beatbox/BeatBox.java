package com.example.administrator.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 1/23/2018.
 */

public class BeatBox {
    private static final String TAG = "BeatBox";
    private static final String SOUND_FOLDER = "sample_sounds";
    private AssetManager mAssets;
    private List<Sound> mSounds = new ArrayList<>();

    public BeatBox(Context context) {
        mAssets = context.getAssets();
        LoadSounds();

    }

    public void LoadSounds() {
        String[] soundNames;
        try {
            soundNames = mAssets.list(SOUND_FOLDER);
            Log.i(TAG, "Found " + soundNames.length + "sounds");
        } catch (IOException ex) {
            Log.e(TAG, "Could not list assets", ex);
            return;
        }
        for (String filename : soundNames) {
            String assetPath = SOUND_FOLDER + "/" + filename;

            Sound sound = new Sound(assetPath);
            mSounds.add(sound);
        }

    }

    public List<Sound> getSounds() {
        return mSounds;
    }
}
