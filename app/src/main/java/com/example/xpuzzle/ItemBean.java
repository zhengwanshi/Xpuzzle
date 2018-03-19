package com.example.xpuzzle;

import android.graphics.Bitmap;

/**
 * 拼图Item逻辑实体类：封装逻辑相关属性
 * Created by zhengyg on 2018/1/6.
 */

public class ItemBean {
    //Item的ID
    private int mItemId;
    //Bitmap的ID
    private int mBitmapId;
    //mBitmap
    private Bitmap mBitmap;
    public ItemBean(){}
    public ItemBean(int mItemId,int mBitmapId,Bitmap mBitmap){
        this.mItemId = mItemId;
        this.mBitmapId = mBitmapId;
        this.mBitmap = mBitmap;
    }
    public int getItemId() {
        return mItemId;
    }

    public void setItemId(int mItemId) {
        this.mItemId = mItemId;
    }

    public int getBitmapId() {
        return mBitmapId;
    }

    public void setBitmapId(int mBitmapId) {
        this.mBitmapId = mBitmapId;
    }

    public Bitmap getBitmap() {
        return mBitmap;
    }

    public void setBitmap(Bitmap mBitmap) {
        this.mBitmap = mBitmap;
    }


}
