package com.epam.seleniun.training.configuration;

public class ConfigurationProperties extends ReadPropertyFile {

    private static ConfigurationProperties configurationPropertiesFile;

    private ConfigurationProperties() { super("resourcers/configuration.properties");}

    public static ConfigurationProperties getInstance(){
        if(configurationPropertiesFile == null){
            configurationPropertiesFile = new ConfigurationProperties();
        }
        return configurationPropertiesFile;
    }

    public String getGlobalProperty(String key, String systemProperty){
        String property = System.getProperty(systemProperty);
        return property == null ? this.getValue(key): property;
    }

    public String getMockKey(String key){
        boolean mocks = this.getValue("activeModeMocks").equals("true");
        return mocks ? key + ".mocks" : key;
    }
}
