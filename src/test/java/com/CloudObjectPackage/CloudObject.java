package com.CloudObjectPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class CloudObject {
	WebDriver driver;

	public CloudObject(WebDriver Driver) {
		driver = Driver;
		PageFactory.initElements(Driver, this);
	}

	public void Mouse_Over_On_Home() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[1]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[1]/a")).isEnabled()) {
			Assert.assertTrue(true);
			WebElement home = driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[1]/a"));
			Actions a = new Actions(driver);
			a.moveToElement(home).build().perform();

			Reporter.log("<font color = 'green'>" + "Mouse over on HOME" + "</font>");
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");
		}
		
	}

	public void Mouse_Over_On_About_Us() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[2]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[2]/a")).isEnabled()) {
			Assert.assertTrue(true);
			WebElement home = driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[2]/a"));
			Actions a = new Actions(driver);
			a.moveToElement(home).build().perform();

			Reporter.log("<font color = 'green'>" + "Mouse over on ABOUT US" + "</font>");
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Mouse_Over_On_Courses() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[3]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[3]/a")).isEnabled()) {
			Assert.assertTrue(true);
			WebElement home = driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[3]/a"));
			Actions a = new Actions(driver);
			a.moveToElement(home).build().perform();

			Reporter.log("<font color = 'green'>" + "Mouse over on COURSES" + "</font>");
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Mouse_Over_On_Services() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Services']")));
		if (driver.findElement(By.xpath("//*[text()='Services']")).isEnabled()) {
			Assert.assertTrue(true);
			WebElement home = driver.findElement(By.xpath("//*[text()='Services']"));
			Actions a = new Actions(driver);
			a.moveToElement(home).build().perform();

			Reporter.log("<font color = 'green'>" + "Mouse over on SERVICES" + "</font>");
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");
		}
	}
	public void Mouse_Over_On_Projects() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[5]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[5]/a")).isEnabled()) {
			Assert.assertTrue(true);
			WebElement home = driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[5]/a"));
			Actions a = new Actions(driver);
			a.moveToElement(home).build().perform();

			Reporter.log("<font color = 'green'>" + "Mouse over on PROJECTS" + "</font>");
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}
	public void Mouse_Over_On_New_Batches() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[6]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[6]/a")).isEnabled()) {
			Assert.assertTrue(true);
			WebElement home = driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[6]/a"));
			Actions a = new Actions(driver);
			a.moveToElement(home).build().perform();

			Reporter.log("<font color = 'green'>" + "Mouse over on NEW BATCHES" + "</font>");
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}
	
	public void Mouse_Over_On_Training() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/a")).isEnabled()) {
			Assert.assertTrue(true);
			WebElement home = driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/a"));
			Actions a = new Actions(driver);
			a.moveToElement(home).build().perform();

			Reporter.log("<font color = 'green'>" + "Mouse over on TRAINING" + "</font>");
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}
	public void Mouse_Over_On_In_Sights() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/a")).isEnabled()) {
			Assert.assertTrue(true);
			WebElement home = driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/a"));
			Actions a = new Actions(driver);
			a.moveToElement(home).build().perform();

			Reporter.log("<font color = 'green'>" + "Mouse over on IN SIGHTS" + "</font>");
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}
	public void Mouse_Over_On_News() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[9]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[9]/a")).isEnabled()) {
			Assert.assertTrue(true);
			WebElement home = driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[9]/a"));
			Actions a = new Actions(driver);
			a.moveToElement(home).build().perform();

			Reporter.log("<font color = 'green'>" + "Mouse over on NEWS" + "</font>");
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}
	public void Mouse_Over_On_Contact() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[10]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[10]/a")).isEnabled()) {
			Assert.assertTrue(true);
			WebElement home = driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[10]/a"));
			Actions a = new Actions(driver);
			a.moveToElement(home).build().perform();

			Reporter.log("<font color = 'green'>" + "Mouse over on Projects" + "</font>");
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}
	
	
	
	
	
	
	
	
	
	
	

}