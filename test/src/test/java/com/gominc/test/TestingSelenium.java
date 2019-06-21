package com.gominc.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestingSelenium {

	private static ChromeDriver ChromeDriver; 
//	private final static String BASE_URL = "http://dpgs.gompay.net:8080/test";
	private final static String BASE_URL = "http://naver.com";
	
	@BeforeClass 
	public static void openBrowser() {		
//		System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver");
//		ChromeDriver = new ChromeDriver();	
//		chromeOptions.setBinary("/usr/bin/google-chrome-stable");		
		System.setProperty("webdriver.chrome.driver","src/test/driver/chromedriver");
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("headless");		
		ChromeDriver = new ChromeDriver(chromeOptions);				
	}

	@Test 
	public void test() { 
		ChromeDriver.get(BASE_URL);        
	} 
	
	@AfterClass 
	public static void closeBrowser() { 
		ChromeDriver.quit(); 
	}		
}
