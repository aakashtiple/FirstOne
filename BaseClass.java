package org.adactin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver; 
	protected Select s;
	
	public static void launchBrower() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aakas\\eclipse-workspace\\Adactin\\Driver\\chromedriver1.exe");
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	public static  void closeBrowser() {
		driver.close();
		
	}

}
