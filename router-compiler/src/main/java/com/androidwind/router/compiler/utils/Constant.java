package com.androidwind.router.compiler.utils;

import com.squareup.javapoet.ClassName;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class Constant {
    public static final ClassName ROUTER = ClassName.get("com.androidwind.router.core", "TinyRouter");

    public static final String ACTIVITY = "android.app.Activity";
    public static final String ISERVICE = "com.androidwind.router.core.template.IService";

    public static final String ARGUMENTS_NAME = "moduleName";
    public static final String ANNOTATION_TYPE_ROUTE = "com.androidwind.router.annotation.Route";
    public static final String ANN_TYPE_EXTRA = "com.androidwind.router.annotation.Extra";

    public static final String IROUTE_GROUP = "com.androidwind.router.core.template.IRouteGroup";
    public static final String IROUTE_ROOT = "com.androidwind.router.core.template.IRouteRoot";
    public static final String IEXTRA = "com.androidwind.router.core.template.IExtra";


    public static final String SEPARATOR = "_";
    public static final String PROJECT = "TinyRouter";
    public static final String NAME_OF_GROUP = PROJECT + SEPARATOR + "Group" + SEPARATOR;
    public static final String NAME_OF_ROOT = PROJECT + SEPARATOR + "Root" + SEPARATOR;
    public static final String PACKAGE_OF_GENERATE_FILE = "com.androidwind.router";

    public static final String METHOD_LOAD_INTO = "loadInto";
    public static final String METHOD_LOAD_EXTRA = "loadExtra";

    public static final String PARCELABLE = "android.os.Parcelable";

    private static final String LANG = "java.lang";
    public static final String BYTE = LANG + ".Byte";
    public static final String SHORT = LANG + ".Short";
    public static final String INTEGER = LANG + ".Integer";
    public static final String LONG = LANG + ".Long";
    public static final String FLOAT = LANG + ".Float";
    public static final String DOUBEL = LANG + ".Double";
    public static final String BOOLEAN = LANG + ".Boolean";
    public static final String STRING = LANG + ".String";
    public static final String ARRAY = "ARRAY";

    public static final String ARRAYLIST = "java.util.ArrayList";
    public static final String LIST = "java.util.List";

    public static final String BYTEARRAY = "byte[]";
    public static final String SHORTARRAY = "short[]";
    public static final String BOOLEANARRAY = "boolean[]";
    public static final String CHARARRAY = "char[]";
    public static final String DOUBLEARRAY = "double[]";
    public static final String FLOATARRAY = "float[]";
    public static final String INTARRAY = "int[]";
    public static final String LONGARRAY = "long[]";
    public static final String STRINGARRAY = "java.lang.String[]";


    public static final String NAME_OF_EXTRA = SEPARATOR + "Extra";


}
