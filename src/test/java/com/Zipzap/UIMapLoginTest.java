package com.Zipzap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UIMapLoginTest {
	public WebDriver driver;
	public LoginTest1 uimap;
	public LoginTest1 datafile;
	public String workingDir;

	@Test(priority = 1)
	public void login() throws Exception {

		uimap = new LoginTest1(workingDir + "\\src\\main\\java\\Config\\OR.properties");
		// Get object map file

		// uimap = new LoginTest1(workingDir +
		// "\\src\\main\\java\\Config\\OR.properties");
		// uimap.LoginTest12(workingDir +
		// "\\src\\main\\java\\Config\\OR.properties");

		// Get the username element
		WebElement username = driver.findElement(uimap.getLocator("Username_field"));
		username.sendKeys(datafile.getData("username"));
		Thread.sleep(1000);
		// Get the password element
		WebElement password = driver.findElement(uimap.getLocator("Password_field"));
		password.sendKeys(datafile.getData("password"));

		// Click on the Login button
		WebElement login = driver.findElement(uimap.getLocator("Login_button"));
		login.click();
		Thread.sleep(2000);
		WebElement Mousehover = driver.findElement(uimap.getLocator("Dropdown"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Mousehover).click();
		WebElement ClickAccount = driver.findElement(uimap.getLocator("ClickOnAccount"));
		builder.moveToElement(ClickAccount);
		builder.click().build().perform();

		builder.perform();
		driver.findElement(uimap.getLocator("BirthDate")).clear();
		driver.findElement(uimap.getLocator("BirthDate")).sendKeys("02/10/1983");
		// WebElement dropdown
		// =driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div/div[2]/div[4]/div[2]/div/div[2]/div"));
		// Select sel=new Select(dropdown);
		driver.findElement(uimap.getLocator("Address")).clear();
		driver.findElement(uimap.getLocator("Address")).sendKeys("55 King Street");

		driver.findElement(uimap.getLocator("City")).clear();
		driver.findElement(uimap.getLocator("City")).sendKeys("Toronto");
		driver.findElement(uimap.getLocator("PIN")).clear();

		driver.findElement(uimap.getLocator("PIN")).sendKeys("L6R4N6");

		driver.findElement(uimap.getLocator("SAVE")).click();
		// driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div/div[2]/div[7]/div/button")).click();
	}

	@BeforeClass
	public void setUp() throws Exception {

		// Get current working directory and load data file
		workingDir = System.getProperty("user.dir");
		datafile = new LoginTest1(workingDir + "\\src\\main\\java\\Config\\datafile.properties");

		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://app-staging.zipzap.me/login");
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	/*
	 * @Test(priority=3) public void UpdateAccount1() throws Exception{ login();
	 * login1(); WebElement
	 * Mousehover=driver.findElement(uimap.getLocator("Dropdown")); Actions
	 * builder = new Actions(driver); builder.moveToElement(Mousehover
	 * ).click(); WebElement ClickAccount= driver.findElement(By.xpath(
	 * "/html/body/div/div/div/div[1]/nav/div/ul[2]/li[2]/div/a[1]"));
	 * builder.moveToElement(ClickAccount); builder.click().build().perform();
	 * 
	 * builder.perform();
	 * 
	 * }
	 */

	@AfterClass
	public void afterMethod() throws Exception {
		driver.quit();
	}

}
