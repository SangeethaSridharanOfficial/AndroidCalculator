package com.example.assessment;

import android.app.Application;

public class CalcActivity extends Application {
    private static int count;

    public static int increment() {
        return ++count;
    }
}
