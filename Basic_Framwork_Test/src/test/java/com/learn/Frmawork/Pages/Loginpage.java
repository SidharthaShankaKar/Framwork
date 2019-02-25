package com.learn.Frmawork.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage 
{
	WebDriver driver;
	
	public Loginpage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//span[@class='icon icon-xs mdi-chart-bar']")WebElement LoginBTn;
	
		public void clickbutton(String Sheet) {
		LoginBTn.click();
		
	}
}
