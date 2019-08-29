package com.androidwind.router.sample;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidwind.router.core.TinyRouter;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                TinyRouter.getInstance().build("/main/main")
                        .withString("from", "splash")
                        .navigation();
            }
        }, 2000);
    }
}
