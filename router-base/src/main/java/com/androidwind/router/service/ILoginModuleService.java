package com.androidwind.router.service;

import com.androidwind.router.core.template.IService;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface ILoginModuleService extends IService {

    boolean isLogin();

    void setLogin(boolean login);
}
