package com.androidwind.router.core.template;

import com.androidwind.router.annotation.modle.RouteMeta;

import java.util.Map;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface IRouteGroup {
    void loadInto(Map<String, RouteMeta> atlas);
}
