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

public class ServicesObject {
	WebDriver driver;
	public ServicesObject(WebDriver Driver) {
		driver = Driver;
		PageFactory.initElements(Driver, this);
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

	public void Click_Internship_Program() {
		 Mouse_Over_On_Services();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[4]/ul/li[1]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[4]/ul/li[1]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[4]/ul/li[1]/a")).click();
			Reporter.log("<font color = 'green'>" + "Clicked on INTERNSHIP PROGRAM" + "</font>");
			driver.navigate().back();

		} else {
			Reporter.log("<font color = 'red'>" + "Click button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");
		}
	}

	public void Click_Placement_Assistance() {
		 Mouse_Over_On_Services();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[4]/ul/li[2]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[4]/ul/li[2]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[4]/ul/li[2]/a")).click();
			Reporter.log("<font color = 'green'>" + "Clicked on PLACEMENT ASSISTANCE" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "Click button is not Enabled" + "</font>");
		
			Assert.fail("Testcase Failed  ");
		}
	}

	public void Click_Placements() {
		 Mouse_Over_On_Services();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[4]/ul/li[3]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[4]/ul/li[3]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[4]/ul/li[3]/a")).click();
			Reporter.log("<font color = 'green'>" + "Clicked on PLACEMENTS" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "Click button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");
		}
	}

	public void Click_Cloud_Care() {
		 Mouse_Over_On_Services();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[4]/ul/li[4]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[4]/ul/li[4]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[4]/ul/li[4]/a")).click();
			Reporter.log("<font color = 'green'>" + "Clicked on CLOUD CARE" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "Click button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");
		}
	}
}