package com.zp.patchdemo;

import android.widget.Toast;

/**
 * Created by Pipi on 2017/8/14.
 */

public class ToastUtils {

    public static void show(String text) {
        Toast.makeText(AppController.getInstance(), text, Toast.LENGTH_SHORT).show();
    }

    public static void showLong(String text) {
        Toast.makeText(AppController.getInstance(), text, Toast.LENGTH_LONG).show();
    }
}
