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

public class NewBatchesObject {
	WebDriver driver;
	public NewBatchesObject(WebDriver Driver) {
		driver = Driver;
		PageFactory.initElements(Driver, this);
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

	public void Click_Class_Room_Anantapuram() {
		Mouse_Over_On_New_Batches();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[text()='Class Room - Anantapuram']")));
		if (driver.findElement(By.xpath("//a[text()='Class Room - Anantapuram']")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//a[text()='Class Room - Anantapuram']")).click();
			Reporter.log("<font color = 'green'>" + "Clicked On CLASS ROOM ANANTHAPURAM" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Click_Online_Classes() {
		Mouse_Over_On_New_Batches();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[6]/ul/li[2]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[6]/ul/li[2]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[6]/ul/li[2]/a")).click();

			Reporter.log("<font color = 'green'>" + "Clicked On ONLINE CLASSES" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Click_On_Line_Schedule() {
		Mouse_Over_On_New_Batches();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[6]/ul/li[3]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[6]/ul/li[3]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[6]/ul/li[3]/a")).click();

			Reporter.log("<font color = 'green'>" + "Clicked On LIVE SHEDULE" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Click_Free_Online_Workshops() {
		Mouse_Over_On_New_Batches();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[6]/ul/li[4]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[6]/ul/li[4]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[6]/ul/li[4]/a")).click();

			Reporter.log("<font color = 'green'>" + "Clicked on FREE ONLINE WORKSHOPS" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}
}