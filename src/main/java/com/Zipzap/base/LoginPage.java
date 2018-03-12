package com.Zipzap.base;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginPage extends TestBase {

	WebDriver driver;
	Properties OR1,OR;
	 File f,f1;
	FileInputStream file,file1;
	@BeforeMethod
	public void loadproperty() throws IOException{
	 OR = new Properties();	
	 //f=new File(System.getProperty(user.dir+"\\Automation\\src\\main\\java\\Config\\config.properties"));
	 //file= new FileInputStream(f);
	//OR.load(file);
	 //OR = new Properties();	
	File f=new File(System.getProperty("user.dir" +"\\src\\main\\java\\Config\\OR.properties"));
	FileInputStream file= new FileInputStream(f);
	OR.load(file);
	}
	@Test
public	void getProperty() throws IOException
	{
		

//test
        driver.get(OR.getProperty("https://app-staging.zipzap.me/login"));
        //WebDriverWait wait = new WebDriverWait(driver, 10);
       // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='root']/div/div/div/div[2]/div/div[2]/form/div[1]/input")));


		
	WebElement w=driver.findElement(By.xpath(OR.getProperty("username_xpath")));
w.sendKeys(OR.getProperty("uma.d.nathan@gmail.com"));
		
}
}
