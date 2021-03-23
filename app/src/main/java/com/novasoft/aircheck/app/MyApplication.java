package com.novasoft.aircheck.app;

import android.app.Application;

import me.yokeyword.fragmentation.Fragmentation;

public class MyApplication extends Application {
    private static MyApplication mInstance;
    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;


        Fragmentation.builder()
                // 显示悬浮球 ; 其他Mode:SHAKE: 摇一摇唤出   NONE：隐藏
                .stackViewMode(Fragmentation.BUBBLE)
                .debug(true)
                .install();

    }

    public static MyApplication getApplication() {
        return mInstance;
    }
}
