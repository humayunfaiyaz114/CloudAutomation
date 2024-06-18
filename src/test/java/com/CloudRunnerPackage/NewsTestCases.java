package com.CloudRunnerPackage;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CloudObjectPackage.BaseClass;
import com.CloudObjectPackage.NewsObject;

public class NewsTestCases extends BaseClass {
	@Test(priority = 1)
	public void Mouse_Over_On_News() throws InterruptedException, AWTException {
		NewsObject pg = new NewsObject(driver);
		pg.Mouse_Over_On_News();
		Reporter.log("Mouse Over on NEWS Successfully");
	}

	@Test(priority = 2)
	public void Click_Monthly_News() throws InterruptedException, AWTException {
		NewsObject pg = new NewsObject(driver);
		pg.Click_Monthly_News();
		Reporter.log("Clicked On MONTHLTY NEWS Succesfully");
	}

	@Test(priority = 3)
	public void Click_Events() throws InterruptedException, AWTException {
		NewsObject pg = new NewsObject(driver);
		pg.Click_Events();
		Reporter.log("Clicked On EVENTS Succesfully");
	}

	@Test(priority = 4)
	public void Click_Blog() throws InterruptedException, AWTException {
		NewsObject pg = new NewsObject(driver);
		pg.Click_Blog();
		Reporter.log("Clicked On BLOG Successfully");
	}

}