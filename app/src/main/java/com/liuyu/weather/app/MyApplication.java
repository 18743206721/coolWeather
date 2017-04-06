package com.liuyu.weather.app;

import android.app.Application;
import android.content.Context;

import org.xutils.x;

/**
 * Created by Administrator on 2017/1/5.
 */
public class MyApplication extends Application{

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);//初始化XUtils
        x.Ext.setDebug(true); //是否输出debug日志，开启debug会影响性能。
        context=getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }


}
