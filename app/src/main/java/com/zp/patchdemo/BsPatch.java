package com.zp.patchdemo;

public class BsPatch {
    public static native int bspatch(String oldApk, String newApk, String patch);
}
