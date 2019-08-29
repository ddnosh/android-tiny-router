package com.androidwind.router.core.callback;

import com.androidwind.router.core.Postcard;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface NavigationCallback {

    /**
     * 找到跳转页面
     * @param postcard
     */
    void onFound(Postcard postcard);

    /**
     * 未找到
     * @param postcard
     */
    void onLost(Postcard postcard);

    /**
     * 成功跳转
     * @param postcard
     */
    void onArrival(Postcard postcard);


}
