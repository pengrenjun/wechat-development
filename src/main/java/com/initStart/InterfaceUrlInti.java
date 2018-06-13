package com.initStart;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Description:项目启动文件加载工具
 * 在这里我初始化化了两个文件，一个是用来配置在微信开发中经常用的到 appid、AppSecret 的参数（wechat.properties），
 * 另外一个用来初始化我们经常用到的 http 请求的 url 地址 interface_url.properties
 */
public class InterfaceUrlInti {

    public synchronized static void init(){
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        Properties props = new Properties();
        if(GlobalConstants.interfaceUrlProperties==null){
            GlobalConstants.interfaceUrlProperties = new Properties();
        }
        InputStream in = null;
        try {
            in = cl.getResourceAsStream("interface_url.properties");
            props.load(in);
            for(Object key : props.keySet()){
                GlobalConstants.interfaceUrlProperties.put(key, props.get(key));
            }

            props = new Properties();
            in = cl.getResourceAsStream("wechat.properties");
            props.load(in);
            for(Object key : props.keySet()){
                GlobalConstants.interfaceUrlProperties.put(key, props.get(key));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return;
    }

}

