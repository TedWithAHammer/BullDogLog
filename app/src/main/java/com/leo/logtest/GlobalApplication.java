package com.leo.logtest;

import android.app.Application;

import com.leo.bulldoglog.BLog;

/**
 * Created by leo on 2016/11/21.
 */

public class GlobalApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initLog();
    }

    private void initLog() {
        BLog.init("LogTest");
    }
}
