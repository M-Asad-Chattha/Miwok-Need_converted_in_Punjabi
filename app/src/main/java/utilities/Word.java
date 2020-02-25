package utilities;

import android.widget.TextView;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    /** Image resource ID for the word*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultWord, String miwokWord) {
        this.mMiwokTranslation = defaultWord;
        this.mDefaultTranslation = miwokWord;
    }

    public Word(String defaultWord, String miwokWord, int imageResourceId){
        mDefaultTranslation = defaultWord;
        mMiwokTranslation = miwokWord;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return weather word has Image Resource
     * */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
