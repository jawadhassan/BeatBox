package com.example.administrator.beatbox;

/**
 * Created by Administrator on 1/23/2018.
 */

public class Sound {
    private String mAssetPath;
    private String mName;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");

        String filename =
                components[components.length - 1];
        mName = filename.replace(".wav", "");
    }


    public String getName() {
        return mName;
    }

    public String getAssetPath() {
        return mAssetPath;
    }
}
