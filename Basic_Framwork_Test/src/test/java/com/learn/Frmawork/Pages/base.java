package com.learn.Frmawork.Pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learn.Frmawork.Utility.Browser_Factory;
import com.learn.Frmawork.Utility.Configdataprovider;
import com.learn.Frmawork.Utility.Excelldataprovider;
import com.learn.Frmawork.Utility.helper;

public class base {
	public WebDriver driver;
	public Excelldataprovider excel;
	public Configdataprovider cong;
	public ExtentReports report;
	public ExtentTest logger;
	@BeforeSuite
	public void configexcell()
	{
		excel = new Excelldataprovider();
		cong= new Configdataprovider(); 
		
		ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/Report/Frecrm.html"));
		report= new ExtentReports();
		report.attachReporter(extent);
				}
	@BeforeClass
	public void browsersetup()
	{
		Browser_Factory.StartBrowser(driver, cong.browser(), cong.stagingurl());
	}
	@AfterClass
	public void Closingbrowser()
	{
		Browser_Factory.quitbrowser(driver);

	}
	@AfterMethod
	public void takescreenshoot(ITestResult it)
	{
		if(it.getStatus()==it.FAILURE) {
			helper.capturescreenshoot(driver);
		}
		report.flush();
			
	}
}
