package com.androidwind.router.sample;

import android.app.Application;

import com.androidwind.router.core.TinyRouter;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TinyRouter.init(this);
    }
}
