package com.example.android.miwok;

/**
 * Created by hasan on 21.01.2018.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMivokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;

    public static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String mivokTranslation) {

        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = mivokTranslation;

    }

    public Word(String defaultTranslation, String mivokTranslation, int AudioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = mivokTranslation;
        mAudioResourceId = AudioResourceId;

    }

    public Word(String defaultTranslation, String mivokTranslation, int imageResourceId, int AudioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = mivokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = AudioResourceId;


    }

    public String getmDefaultTranslation() {

        return mDefaultTranslation;
    }

    public String getmMivokTranslation() {
        return mMivokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

}
