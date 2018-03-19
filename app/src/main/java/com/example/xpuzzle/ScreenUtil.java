package com.example.xpuzzle;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by zhengyg on 2018/1/5.
 * 获取屏幕相关信息
 */

public class ScreenUtil {
    /*
    * @param Content content
    * @return DisplayMetrics
    * 屏幕高宽
    *
    * */
    public static DisplayMetrics getScreenSize(Context context){
        DisplayMetrics metrics = new DisplayMetrics();
        WindowManager wm = (WindowManager)context.getSystemService(
                Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        display.getMetrics(metrics);
        return metrics;
            }


    /*
    * 获取屏幕 density
    *
    * @param Context context
    * @return density
    * */
    public static float getDeviceDensity(Context context){
        DisplayMetrics metrics = new DisplayMetrics();
        WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        wm.getDefaultDisplay().getMetrics(metrics);
        return metrics.density;
    }

}
