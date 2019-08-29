package com.androidwind.router.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.androidwind.router.annotation.Extra;
import com.androidwind.router.annotation.Route;
import com.androidwind.router.core.TinyRouter;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */

@Route(path = "/login/main")
public class LoginActivity extends Activity {

    @Extra
    String from;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        TinyRouter.getInstance().inject(this);

        Toast.makeText(this, from, Toast.LENGTH_SHORT).show();
    }
}
