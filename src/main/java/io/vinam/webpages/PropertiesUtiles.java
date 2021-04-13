package io.vinam.webpages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtiles {

	public static Properties loadPropertiesFile() throws IOException {
	Properties config = new Properties();
	FileInputStream  fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config-SIT.properties");
    config.load(fis);
    
    return config;
    
	}
	
}
