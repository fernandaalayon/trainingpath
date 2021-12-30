package com.epam.seleniun.training.configuration;

public class ConfigurationConstants {

    private ConfigurationConstants(){
        throw new IllegalAccessError("Utility class");
    }

    public static String getBaseUrl() {
        return ConfigurationProperties.getInstance().getValue("baseUrl");
    }

    public static String getLoginUrl(){
        return ConfigurationProperties.getInstance().getValue("loginUrl");
    }

    public static String getHomeTabTitle(){
        return ConfigurationProperties.getInstance().getValue("homeTabTitle");
    }

    public static String getLoginTabTitle(){
        return ConfigurationProperties.getInstance().getValue("loginTabTitle");
    }

    public static String getDriverName(){
        return ConfigurationProperties.getInstance().getValue("driver");
    }
}
