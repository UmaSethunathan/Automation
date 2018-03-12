package com.Zipzap.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {
	public WebDriver driver;

	@BeforeMethod
public void setup()
{
	
	System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");	
	driver=new FirefoxDriver();
	}

/*@AfterMethod
public void Close()
{
	driver.quit();
}*/}