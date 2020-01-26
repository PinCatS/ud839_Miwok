package com.example.android.miwok;

import android.media.MediaPlayer;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private MediaPlayer mAudio;
    private final int NO_VALID_IMAGE = -1;
    private int mImageResourceId = NO_VALID_IMAGE;


    public Word(String miwokTranslation, String defaultTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, MediaPlayer mediaPlayer) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudio = mediaPlayer;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaulTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResorceId() {
        return mImageResourceId;
    }

    public MediaPlayer getAudio() {
        return mAudio;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_VALID_IMAGE;
    }
}
