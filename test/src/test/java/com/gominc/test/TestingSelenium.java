package com.gominc.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingSelenium {

	private static ChromeDriver ChromeDriver; 
	private final static String BASE_URL = "http://dpgs.gompay.net:8080/test"; 
	
	@BeforeClass 
	public static void openBrowser() {//웹드라이버를 세팅 
	System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver"); // ChromeDriver set
	ChromeDriver = new ChromeDriver(); // Driver 생성	
	} 

	@Test 
	public void test() { 
		ChromeDriver.get(BASE_URL); // URL로 접속하기
//        Assert.assertThat(ChromeDriver.getTitle(),is("URL의 Title")); // Title 확인 작업
	} 
	
	@AfterClass 
	public static void closeBrowser() { 
		ChromeDriver.quit(); 
	}		
}
