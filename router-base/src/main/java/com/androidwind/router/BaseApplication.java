package com.androidwind.router;

import android.app.Application;
import com.androidwind.router.core.TinyRouter;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();
    }

    private void initARouter() {
        TinyRouter.init(this);
    }
}
