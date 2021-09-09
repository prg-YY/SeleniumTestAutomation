package com.seleniummaster.configutility;

public class configDemo {
    public static void main(String[] args) {
        String configFile="config.properties";
        ApplicationConfig.readConfigProperties(configFile,"produrl");
        ApplicationConfig.readConfigProperties(configFile,"qaurl");
        ApplicationConfig.readConfigProperties(configFile,"username");
        ApplicationConfig.readConfigProperties(configFile,"password");
        ApplicationConfig.readConfigProperties(configFile,"timeout");

    }
}
