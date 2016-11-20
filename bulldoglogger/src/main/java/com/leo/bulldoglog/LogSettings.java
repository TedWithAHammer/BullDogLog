package com.leo.bulldoglog;

/**
 * Created by Leo on 2016/11/20.
 */

public class LogSettings {
    private boolean logEnable;
    private boolean showThreadInfo;
    private int methodOffset;

    public boolean isShowThreadInfo() {
        return showThreadInfo;
    }

    public void setShowThreadInfo(boolean showThreadInfo) {
        this.showThreadInfo = showThreadInfo;
    }

    public int getMethodOffset() {
        return methodOffset;
    }

    public void setMethodOffset(int methodOffset) {
        this.methodOffset = methodOffset;
    }

    private static final int DEFAULT_METHOD_OFFSET = 2;

    public boolean isLogEnable() {
        return logEnable;
    }

    public void setLogEnable(boolean logEnable) {
        this.logEnable = logEnable;
    }


    public void init() {
        logEnable = true;
        showThreadInfo = true;
        methodOffset = DEFAULT_METHOD_OFFSET;
    }
}
