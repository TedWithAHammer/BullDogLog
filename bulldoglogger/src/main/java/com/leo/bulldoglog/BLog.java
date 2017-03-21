package com.leo.bulldoglog;


import android.text.TextUtils;
import android.util.Log;

/**
 * Created by Leo on 2016/11/20.
 */

public class BLog {
    private static String defaultTag = "BullDog";
    private static LogSettings settings;

    /*log type*/
    private static final int DEBUG = 3;
    private static final int INFO = 6;
    private static final int ASSERT = 7;
    private static final int ERROR = 4;
    private static final int VERBOSE = 2;
    private static final int WARN = 5;
    /*format part*/

    private static final String horizontalLine = "****************************************************************************************************";//count 100
    private static final String portraitLine = "*";

    public static void init() {
        settings = new LogSettings();
    }

    public static void init(String tag) {
        settings = new LogSettings();
        defaultTag = tag;
    }

    private static void logThreadInfo(int logType, String tag) {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        if (settings.getMethodOffset() < elements.length - 1) {
            for (int i = 0; i < settings.getMethodOffset(); i++) {
                String className = elements[i].getClassName();
                int lineNum = elements[i].getLineNumber();
                String methodName = elements[i].getMethodName();
                log(logType, tag, formatMsg("Class:" + className + " Method:" + methodName + " Line:" + lineNum));
                log(logType, tag, horizontalLine);
            }
        }
    }

    private static void log(int logType, String tag, String msg) {
        switch (logType) {
            case DEBUG:
                Log.d(tag, msg);
                break;
            case ERROR:
                Log.e(tag, msg);
                break;
            case ASSERT:
//                Log.a(tag,msg);
                break;
            case INFO:
                Log.i(tag, msg);
                break;
            case VERBOSE:
                Log.v(tag, msg);
                break;
            case WARN:
                Log.w(tag, msg);
                break;
        }
    }

    public static void d(String _tag, String msg) {
        if (!settings.isLogEnable())
            return;
        String tag = TextUtils.isEmpty(_tag) ? defaultTag : _tag;
        /*
        *************************
        *       ThreadInfo         *
        *************************
         */
        log(DEBUG, tag, horizontalLine);
        if (settings.isShowThreadInfo()) {
            logThreadInfo(DEBUG, tag);
        }
        //
        log(DEBUG, tag, formatMsg(msg));
        //
        log(DEBUG, tag, horizontalLine);
    }

    public static void d(String msg) {
        d(null, msg);
    }

    private static String formatMsg(String msg) {
        StringBuilder sb = new StringBuilder();
        sb.append(portraitLine);
        sb.append(msg);
        int length = sb.length();
        for (int i = 0; i < 99 - length; i++) {
            sb.append(" ");
        }
        sb.append(portraitLine);
        return sb.toString();
    }

    public static void i(String _tag, String msg) {
        if (!settings.isLogEnable())
            return;
        String tag = TextUtils.isEmpty(_tag) ? defaultTag : _tag;
        /*
        *************************
        *       ThreadInfo         *
        *************************
         */
        log(INFO, tag, horizontalLine.length() + "");
        log(INFO, tag, horizontalLine);
        if (settings.isShowThreadInfo()) {
            logThreadInfo(INFO, tag);
        }

        log(INFO, tag, formatMsg(msg));
        //
        log(INFO, tag, horizontalLine);
    }

    public static void i(String msg) {
        i(null, msg);
    }

    public static void e(String _tag, String msg) {
        if (!settings.isLogEnable())
            return;
        String tag = TextUtils.isEmpty(_tag) ? defaultTag : _tag;
        /*
        *************************
        *       ThreadInfo         *
        *************************
         */
        log(ERROR, tag, horizontalLine.length() + "");
        log(ERROR, tag, horizontalLine);
        if (settings.isShowThreadInfo()) {
            logThreadInfo(ERROR, tag);
        }

        log(ERROR, tag, formatMsg(msg));
        //
        log(ERROR, tag, horizontalLine);
    }

    public static void e(String msg) {
        e(null, msg);
    }

    public static void v(String _tag, String msg) {
        if (!settings.isLogEnable())
            return;
        String tag = TextUtils.isEmpty(_tag) ? defaultTag : _tag;
        /*
        *************************
        *       ThreadInfo         *
        *************************
         */
        log(VERBOSE, tag, horizontalLine.length() + "");
        log(VERBOSE, tag, horizontalLine);
        if (settings.isShowThreadInfo()) {
            logThreadInfo(VERBOSE, tag);
        }
        //
        log(VERBOSE, tag, formatMsg(msg));
        //
        log(VERBOSE, tag, horizontalLine);
    }

    public static void v(String msg) {
        v(null, msg);
    }

    public static void w(String _tag, String msg) {
        if (!settings.isLogEnable())
            return;
        String tag = TextUtils.isEmpty(_tag) ? defaultTag : _tag;
        /*
        *************************
        *       ThreadInfo         *
        *************************
         */
        log(WARN, tag, horizontalLine.length() + "");
        log(WARN, tag, horizontalLine);
        if (settings.isShowThreadInfo()) {
            logThreadInfo(WARN, tag);
        }
        //
        log(WARN, tag, formatMsg(msg));
        //
        log(WARN, tag, horizontalLine);
    }

    public static void w(String msg) {
        w(null, msg);
    }


}
