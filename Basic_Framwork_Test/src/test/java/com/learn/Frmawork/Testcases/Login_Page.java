package com.learn.Frmawork.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learn.Frmawork.Pages.Loginpage;
import com.learn.Frmawork.Pages.base;
import com.learn.Frmawork.Utility.Excelldataprovider;

public class Login_Page extends base  
{
	public WebDriver driver;
	@Test
	public void Loginapp()
	{
		logger=report.createTest("Login to app");
		Excelldataprovider e= new Excelldataprovider();
	Loginpage loginpage1=PageFactory.initElements(driver, Loginpage.class);
	logger.info("");
	loginpage1.clickbutton(e.getStringdata("Login", 12, 45));
	logger.pass("TEST PASS");

	}
}
