package com.zp.patchdemo;

import android.app.Application;

public class AppController extends Application {

    private static volatile AppController mInstance;

    public static synchronized AppController getInstance() {
        if(mInstance == null) {
            mInstance = new AppController();
        }
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
}
