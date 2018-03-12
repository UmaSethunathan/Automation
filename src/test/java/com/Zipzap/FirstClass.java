package com.Zipzap;
import com.Zipzap.base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FirstClass extends TestBase {

//@Test
//public void FirstTest() throws InterruptedException
{
	/*Thread.sleep(2000);
	//Opening an application
	driver.get("https://app-staging.zipzap.me/login");
	driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div[2]/div/div[2]/form/div[1]/input")).sendKeys("uma.d.nathan@gmail.com");
	driver.findElement(By.name("password")).sendKeys("uma12uma");
	driver.findElement(By.xpath(".//button[@class='submit']")).click();
	Thread.sleep(2000);
	WebElement Mousehover=driver.findElement(By.xpath("//*[@id='navbarDropdown']"));
	Actions builder = new Actions(driver);    
	  builder.moveToElement(Mousehover ).click(); 
	 WebElement ClickAccount= driver.findElement(By.xpath("/html/body/div/div/div/div[1]/nav/div/ul[2]/li[2]/div/a[1]"));
	 builder.moveToElement(ClickAccount);
	 builder.click().build().perform();
			 
	  builder.perform();   
	  
	  driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div/div[2]/div[3]/div/div/div[2]/div/input")).sendKeys("02/10/1983");
	 WebElement dropdown =driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div/div[2]/div[4]/div[2]/div/div[2]/div"));
	 Select sel=new Select(dropdown);
	  
	  driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div/div[2]/div[5]/div[1]/div/div[2]/input")).sendKeys("55 King Street");
	  
	 driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div/div[2]/div[6]/div[1]/div/div[2]/input")).sendKeys("Toronto");
	 
	 driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div/div[2]/div[6]/div[2]/div/div[2]/input")).sendKeys("L6R4N6");
	 
	 driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div/div[2]/div[7]/div/button")).click();
	}
}
