package com.example.android.miwok;

/**
 * Created by piyush on 26/1/18.
 */

public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;

    public  word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public  word(String defaultTranslation, String miwokTranslation,int ImageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId=ImageResourceId;
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


}
