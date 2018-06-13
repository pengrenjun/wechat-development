package com.initStart;

import java.util.Properties;

public class GlobalConstants {

    public static Properties interfaceUrlProperties;


    public static String getInterfaceUrl(String key) {
        return (String) interfaceUrlProperties.get(key);
    }

}
