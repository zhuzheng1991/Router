package com.chenenyu.router.compiler;

/**
 * <p>
 * Created by Cheney on 2017/1/12.
 */
public class Consts {
    public static final String CLASS_JAVA_DOC = "Generated by Router. Do not edit it!\n";
    public static final String PACKAGE_NAME = "com.chenenyu.router";
    public static final String DOT = ".";
    public static final String ROUTE_TABLE = "RouteTable";
    public static final String ROUTE_TABLE_FULL_NAME = PACKAGE_NAME + DOT + ROUTE_TABLE;
    public static final String ACTIVITY_FULL_NAME = "android.app.Activity";
    public static final String FRAGMENT_FULL_NAME = "android.app.Fragment";
    public static final String FRAGMENT_V4_FULL_NAME = "android.support.v4.app.Fragment";
    public static final String OPTION_MODULE_NAME = "moduleName";

    public static final String ROUTE_ANNOTATION_TYPE = "com.chenenyu.router.annotation.Route";
    public static final String INTERCEPTOR_ANNOTATION_TYPE = "com.chenenyu.router.annotation.Interceptor";

    public static final String ROUTE_TABLE_METHOD_NAME = "handle";
    public static final String INTERCEPTOR_INTERFACE = PACKAGE_NAME + DOT + "RouteInterceptor";

    public static final String INTERCEPTORS = "Interceptors";
    public static final String INTERCEPTORS_METHOD_NAME = "handle";

    public static final String INTERCEPTOR_TABLE = "InterceptorTable";
    public static final String INTERCEPTOR_TABLE_METHOD_NAME = "handle";

}
