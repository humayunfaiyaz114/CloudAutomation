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

public class InSightsObject {

	WebDriver driver;
	public InSightsObject(WebDriver Driver) {
		driver = Driver;
		PageFactory.initElements(Driver, this);
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

	public void Click_Success() {
		Mouse_Over_On_In_Sights();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/ul/li[1]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/ul/li[1]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/ul/li[1]/a")).click();

			Reporter.log("<font color = 'green'>" + "Clicked On SUCCESS" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Click_World_Class_Training() {
		Mouse_Over_On_In_Sights();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/ul/li[2]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/ul/li[2]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/ul/li[2]/a")).click();
			Reporter.log("<font color = 'green'>" + "Clicked On WORLD CLASS TRAINING" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Click_Training_Choice() {
		Mouse_Over_On_In_Sights();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/ul/li[3]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/ul/li[3]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/ul/li[3]/a")).click();
			Reporter.log("<font color = 'green'>" + "Clicked On TRAINING CHOICE" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Click_Thought_Leadership() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/ul/li[4]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/ul/li[4]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/ul/li[4]/a")).click();
			Reporter.log("<font color = 'green'>" + "Clicked On THOUGHT LEARDERSHIP" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}
}