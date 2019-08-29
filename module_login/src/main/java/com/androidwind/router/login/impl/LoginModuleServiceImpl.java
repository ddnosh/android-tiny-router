package com.androidwind.router.login.impl;

import com.androidwind.router.annotation.Route;
import com.androidwind.router.service.ILoginModuleService;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */

@Route(path = "/login/service")
public class LoginModuleServiceImpl implements ILoginModuleService {

    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public void setLogin(boolean login) {

    }
}
