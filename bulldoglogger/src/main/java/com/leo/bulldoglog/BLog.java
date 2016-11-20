package com.leo.bulldoglog;

import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by Leo on 2016/11/20.
 */

public class BLog {
    private static String defaultTag = "BullDog";
    private static LogSettings settings;

    /*log type*/
    private static final int DEBUG = 3;
    private static final int ERROR = 6;
    private static final int ASSERT = 7;
    private static final int INFO = 4;
    private static final int VERBOSE = 2;
    private static final int WARN = 5;
    /*formate part*/

    private static final String horizontalLine = "**************************************";
    private static final String potraitLine = "*";

    public static void init() {
        settings = new LogSettings();
    }

    public static void init(String tag) {
        settings = new LogSettings();
        defaultTag = tag;
    }

    private static void logThreadInfo() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (int i = 0; i < settings.getMethodOffset(); i++) {
            String methodName = elements[i].getMethodName();
            String className = elements[i].getClassName();
            int lineNum = elements[i].getLineNumber();
        }
    }

    private static void log(int logType, String msg) {
        switch (logType) {
            case DEBUG:
                break;
            case ERROR:
                break;
            case ASSERT:
                break;
            case INFO:
                break;
            case VERBOSE:
                break;
            case WARN:
                break;
        }
    }

    private static void logSpliter(int logType) {
        switch (logType) {
            case DEBUG:
                break;
            case ERROR:
                break;
            case ASSERT:
                break;
            case INFO:
                break;
            case VERBOSE:
                break;
            case WARN:
                break;
        }
    }

}
