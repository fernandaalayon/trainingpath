package com.epam.selenium.training.configuration;

public class ConfigurationConstants {

    private ConfigurationConstants(){
        throw new IllegalAccessError("Utility class");
    }

    public static String getBaseUrl() {
        return ApplicationPropertiesFile.getInstance().getValue("baseUrl");
    }

    public static String getLoginUrl(){
        return ApplicationPropertiesFile.getInstance().getValue("loginUrl");
    }

    public static String getHomeTabTitle(){
        return ApplicationPropertiesFile.getInstance().getValue("homeTabTitle");
    }

    public static String getLoginTabTitle(){
        return ApplicationPropertiesFile.getInstance().getValue("loginTabTitle");
    }

    public static String getBrowser(){
        return ApplicationPropertiesFile.getInstance().getValue("browser");
    }
}
