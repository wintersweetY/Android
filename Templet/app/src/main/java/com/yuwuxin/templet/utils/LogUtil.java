package com.yuwuxin.templet.utils;

import android.util.Log;

/**
 * 日志工具类
 */
public class LogUtil {

    private static String TAG = "[Log]:";

    private static boolean isLog = true;

    public static void setTAG(String TAG) {
        LogUtil.TAG = TAG;
    }

    public static void setIsLog(boolean isLog) {
        LogUtil.isLog = isLog;
    }

    public static void d(String msg) {
        if (isLog)
            Log.d(TAG, msg);
    }

    public static void d(String tag, String msg) {
        if (isLog)
            Log.d(tag, msg);
    }

    public static void i(String msg) {
        if (isLog)
            Log.i(TAG, msg);
    }

    public static void i(String tag, String msg) {
        if (isLog)
            Log.i(tag, msg);
    }

    public static void w(String msg) {
        if (isLog)
            Log.w(TAG, msg);
    }

    public static void w(String tag, String msg) {
        if (isLog)
            Log.w(tag, msg);
    }

    public static void e(String msg) {
        if (isLog)
            Log.e(TAG, msg);
    }

    public static void e(String tag, String msg) {
        if (isLog)
            Log.e(tag, msg);
    }
}
