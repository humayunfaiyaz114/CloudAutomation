package com.CloudObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;

	public static void initializeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cc\\Desktop\\Cloudgen Automation\\Cloudgen4\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cloudgensoft.com");
	}

	@BeforeClass
	public void setUp() {
		BaseClass.initializeDriver();
	}

	@AfterClass
	public void tearDown() {
		if (BaseClass.driver != null) {
			BaseClass.driver.close();
		}
	}
}