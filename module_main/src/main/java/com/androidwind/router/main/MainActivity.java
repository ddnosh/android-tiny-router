package com.androidwind.router.main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.androidwind.router.annotation.Route;
import com.androidwind.router.core.TinyRouter;
import com.androidwind.router.service.ILoginModuleService;


/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */

@Route(path = "/main/main")
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_main);

        TinyRouter.getInstance().inject(this);

        ILoginModuleService loginModuleServiceImpl = (ILoginModuleService) TinyRouter.getInstance().build("/login/service").navigation();
        if (loginModuleServiceImpl.isLogin()) {
            Toast.makeText(this, "You are logon!", Toast.LENGTH_SHORT).show();
        } else {
            TinyRouter.getInstance().build("/login/main")
                    .withString("from", "main")
                    .navigation();
        }
    }
}
