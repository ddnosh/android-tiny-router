package com.androidwind.router.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface Extra {
    String name() default "";
}
