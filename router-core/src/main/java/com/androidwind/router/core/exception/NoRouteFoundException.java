package com.androidwind.router.core.exception;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class NoRouteFoundException extends RuntimeException {

    public NoRouteFoundException(String detailMessage) {
        super(detailMessage);
    }
}
