package com.example.android.miwok;

/**
 * Created by piyush on 26/1/18.
 */

public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;

    public  word(String defaultTranslation, String miwokTranslation,int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=AudioResourceId;
    }
    public  word(String defaultTranslation, String miwokTranslation,int ImageResourceId,int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId=ImageResourceId;
        mAudioResourceId=AudioResourceId;
    }
    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {

        return mMiwokTranslation;
    }
    public int getImageResourceId() {

        return mImageResourceId;
    }
    public int getAudioResourceId() {

            return mAudioResourceId;
    }


}
