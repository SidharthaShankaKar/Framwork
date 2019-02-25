package com.learn.Frmawork.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configdataprovider 
{
	public Properties pro;
	public FileInputStream fis;
public void Configdataprovider() 
{
	File src= new File("./Configuration/config.properties");
	try {
		FileInputStream fis= new FileInputStream(src);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	pro= new Properties();
	try {
		pro.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
	System.out.println(e.getMessage());
	}}
	public String getdata()
	{
		return pro.getProperty("hello");
	}
	public String browser()
	{
		return pro.getProperty("Browser");
		}
	public String stagingurl()
	{
	return pro.getProperty("Testurl");	
	}
}
