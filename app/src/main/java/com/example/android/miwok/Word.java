package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mAudioResourceId;
    private final int NO_VALID_IMAGE = -1;
    private int mImageResourceId = NO_VALID_IMAGE;


    public Word(String miwokTranslation, String defaultTranslation, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    public int getAudio() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_VALID_IMAGE;
    }
}
