package com.Zipzap;

import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.AssertJUnit.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestmainClass {
	public String workingDir;
	public LoginTest1 datafile;
	public WebDriver driver;
	@BeforeTest
	public void setUp() throws Exception {

		// Get current working directory and load data file
		/*workingDir = System.getProperty("user.dir");
			//	datafile.LoginTest12(workingDir+"\\src\\main\\java\\Config\\datafile.properties");
      //datafile.LoginTest1(workingDir+ "src\\main\\java\\Config\\datafile.properties");
		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");	
		driver = new FirefoxDriver();
		driver.get("https://app-staging.zipzap.me/login");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
*/	}
}
