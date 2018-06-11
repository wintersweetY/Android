package com.yuwuxin.templet.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * 版本号工具类
 */
public class VersionUtil {

    /**
     * 获取版本号
     * @param context 上下文
     * @return 版本号
     */
    public static String getVersionName(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();

        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName,0);
            return packageInfo.packageName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        return "1.0.0";
    }

    /**
     * 获取版本码
     * @param context 上下文
     * @return 版本号
     */
    public static int getVersionCode(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();

        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName,0);
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        return 1;
    }
}
