package com.deskera.basePage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasePage {
	public static Properties globalProperties;
	
	
	@BeforeSuite(alwaysRun = true)
    public void intializeDataProperties() {
		globalProperties = loadProperties(System.getProperty("user.dir") +"\\src\\test\\resources\\Config.properties");
		System.out.println("Value is ::"+globalProperties.getProperty("QA3"));
	}
	public Properties loadProperties(String path) {
        Properties prop = null;
        InputStream input;
        try {
            prop = new Properties();
            input = new FileInputStream(path);
            prop.load(input);
            
        } catch (Exception e) {
            //LOGGER.error("Unable read & load properties file  due to ::-" + e.getMessage());
            Assert.assertTrue(false, "Loading property file failed for path::" + path + ".Error Message::-" + e.getMessage());
        }
        return prop;
    }
}
