package com.example.android.liftmix;

import android.widget.CheckBox;

/**
 * Created by kaity on 2/15/2018.
 */

public class Exercise {
    private String mName;
    private String mDescription;
    private int mImageResourceId;
    private boolean mSelected;

    public Exercise(String name, String description, int imageResourceId) {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
        mSelected = false;
    }

    public String getmName() { return mName; }
    public String getmDescription() { return mDescription; }
    public int getmImageResourceId() { return mImageResourceId; }
//    public boolean getmSelected() { return mSelected; }
}
