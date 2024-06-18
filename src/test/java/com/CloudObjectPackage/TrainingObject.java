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

public class TrainingObject {
	WebDriver driver;
	public TrainingObject(WebDriver Driver) {
		driver = Driver;
		PageFactory.initElements(Driver, this);
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

	public void Click_Class_Room_Training() {
		Mouse_Over_On_Training();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[1]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[1]/a")).isEnabled()) {
			Assert.assertTrue(true);
			
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[1]/a")).click();
			Reporter.log("<font color = 'green'>" + "Clicked On CLASS ROOM TRAINING" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Click_Online_Training() {
		Mouse_Over_On_Training();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[2]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[2]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[2]/a")).click();

			Reporter.log("<font color = 'green'>" + "Clicked ON ONLINE TRAINING" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Click_Weekend_Training() {
		Mouse_Over_On_Training();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[3]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[3]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[3]/a")).click();
			Reporter.log("<font color = 'green'>" + "Clicked On WEEKEND TRAINING" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Click_Corporate_Training() {
		Mouse_Over_On_Training();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[4]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[4]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[4]/a")).click();
			Reporter.log("<font color = 'green'>" + "Clicked On COPRPORATE TRAINING" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Click_Trainers_Profile() {
		Mouse_Over_On_Training();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[5]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[5]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[5]/a")).click();
			Reporter.log("<font color = 'green'>" + "Clicked On TRAINERS PROFILE" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}

	public void Click_Course_Shedule() {
		Mouse_Over_On_Training();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[6]/a")));
		if (driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[6]/a")).isEnabled()) {
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[7]/ul/li[6]/a")).click();
			Reporter.log("<font color = 'green'>" + "Clicked On COURSE SHEDULE" + "</font>");
			driver.navigate().back();
		} else {
			Reporter.log("<font color = 'red'>" + "home button is not Enabled" + "</font>");
			Assert.fail("Testcase Failed  ");

		}
	}
}