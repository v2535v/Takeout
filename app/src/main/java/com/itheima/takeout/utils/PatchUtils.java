package com.itheima.takeout.utils;

/**
 * ============================================================
 * Copyright：JackChan和他的朋友们有限公司版权所有 (c) 2017
 * Author：   JackChan
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChan1999
 * GitBook：  https://www.gitbook.com/@alleniverson
 * CSDN博客： http://blog.csdn.net/axi295309066
 * 个人博客： https://jackchan1999.github.io/
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：Takeout
 * Package_Name：com.itheima.takeout
 * Version：1.0
 * time：2017/5/30 13:52
 * des ：增量更新工具
 * gitVersion：2.12.0.windows.1
 * updateAuthor：AllenIverson
 * updateDate：2017/5/30 13:52
 * updateDes：${TODO}
 * ============================================================
 */

public class PatchUtils {
    static{
        System.loadLibrary("Patch");// 加载生成的.so文件
    }


    /**
     * native 方法 合并老版本APK和升级包的方法
     * @param oldApkPath   老版本的apk文件路径     *
     * @param newApkPath   新版本apk文件存放的路径
     * @param patchPath    升级包路径
     * @return
     */
    public static native int patch(String oldApkPath,String newApkPath,String patchPath);
}
