package com.pf.login;

import android.app.Application;

public class LoginApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化存储方案
//        MMKV.initialize(this);
    }
}
