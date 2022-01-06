package com.epam.selenium.training.configuration;

public class ApplicationPropertiesFile extends ReadPropertyFile {

    private static ApplicationPropertiesFile applicationPropertiesFileFile;

    private ApplicationPropertiesFile() { super("resources/application.properties");}

    public static ApplicationPropertiesFile getInstance(){
        if(applicationPropertiesFileFile == null){
            applicationPropertiesFileFile = new ApplicationPropertiesFile();
        }
        return applicationPropertiesFileFile;
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
