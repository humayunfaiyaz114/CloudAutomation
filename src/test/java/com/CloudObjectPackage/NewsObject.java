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

public class NewsObject {
	WebDriver driver;
	public NewsObject(WebDriver Driver) {
		driver = Driver;
		PageFactory.initElements(Driver, this);
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

	public void Click_Monthly_News() {
		Mouse_Over_On_News();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[9]/ul/li[1]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[9]/ul/li[1]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[9]/ul/li[1]/a")).click();

			Reporter.log("<font color = 'green'>" + "Clicked On MONTHLY NEWS" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Click_Events() {
		Mouse_Over_On_News();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[9]/ul/li[2]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[9]/ul/li[2]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[9]/ul/li[2]/a")).click();

			Reporter.log("<font color = 'green'>" + "Clicked On EVENTS" + "</font>");
			driver.navigate().back();

		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Click_Blog() {
		Mouse_Over_On_News();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[9]/ul/li[3]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[9]/ul/li[3]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[9]/ul/li[3]/a")).click();

			Reporter.log("<font color = 'green'>" + "Clicked On BLOG" + "</font>");
			driver.navigate().back();

		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}
}