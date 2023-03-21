package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private  static Properties properties = new Properties();

    static {
        try {
            FileInputStream in = new FileInputStream("src/main/java/com/crm/qa/config/config.properties");
            properties.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String read(String key){
        return properties.getProperty(key); // returns value of key in config.properties
    }
}
