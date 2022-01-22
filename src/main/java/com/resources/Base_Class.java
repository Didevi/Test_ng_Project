package com.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
    public WebDriver driver;          //declared WebDriver's Object - driver
	public WebDriver driver_initialization() throws IOException {
		Properties prop = new Properties();
		//FileInputStream is used to read the file
		FileInputStream fis = new FileInputStream("C:\\Users\\Dipen\\eclipse-workspace\\Testng_Framework\\src\\main\\java\\com\\resources\\Data.properties"); 
	    prop.load(fis);
      String BrowserName=  prop.getProperty("Browser");
        if (BrowserName.equals("Chrome")) {
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipen\\OneDrive\\Desktop\\SeleniumSetup\\chromedriver.exe");
    		 driver = new ChromeDriver();
    	
        }
        else if(BrowserName.equals("Firefox")) {
        	// firefox code
        }
        else if(BrowserName.equals("IE")) {
        	// IE code
        }
        return driver;
}
}