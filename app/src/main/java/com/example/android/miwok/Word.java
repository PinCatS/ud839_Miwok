package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
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

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaulTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResorceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_VALID_IMAGE;
    }
}
