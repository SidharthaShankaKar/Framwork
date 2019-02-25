package com.learn.Frmawork.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Factory {
	
	
	public static WebDriver StartBrowser(WebDriver ldriver,String Browsername,String Applink)
	{
		if(Browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			ldriver= new ChromeDriver();
			ldriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		else if (Browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			ldriver= new FirefoxDriver();
			ldriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);		}
		else {
			System.out.println("Browser not Supported");
		}
		ldriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		ldriver.manage().window().maximize();
		ldriver.navigate().to(Applink);
		ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return ldriver;	
	}
	public static void quitbrowser(WebDriver driver)
	{
		driver.quit();
		  
	}
	
	
	

}
