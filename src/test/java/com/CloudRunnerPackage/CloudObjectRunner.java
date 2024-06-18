package com.CloudRunnerPackage;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CloudObjectPackage.BaseClass;
import com.CloudObjectPackage.CloudObject;
public class CloudObjectRunner extends BaseClass {
	@Test(priority = 1)
	public void Mouse_Over_On_Home_Tab() throws InterruptedException, AWTException {
        CloudObject pg = new CloudObject(driver);
		pg.Mouse_Over_On_Home();
		Reporter.log("Mouse Over on home Successfully");
	}
	@Test(priority = 2)
	public void Mouse_Over_On_About_Us() throws InterruptedException, AWTException {
        CloudObject pg = new CloudObject(driver);
		pg.Mouse_Over_On_About_Us();
		Reporter.log("Mouse Over About Us Successfully");
	}
	
	@Test(priority = 3)
	public void Mouse_Over_On_Courses() throws InterruptedException, AWTException {
        CloudObject pg = new CloudObject(driver);
		pg.Mouse_Over_On_Courses();
		Reporter.log("Mouse Over Courses Successfully");
	}
	@Test(priority = 4)
	public void Mouse_Over_On_Services() throws InterruptedException, AWTException {
        CloudObject pg = new CloudObject(driver);
		pg.Mouse_Over_On_Services();
		Reporter.log("Mouse Over Services Successfully");
	}
	@Test(priority = 5)
	public void Mouse_Over_On_Projects() throws InterruptedException, AWTException {
        CloudObject pg = new CloudObject(driver);
		pg.Mouse_Over_On_Projects();
		Reporter.log("Mouse Over Projects Successfully");
	}
	@Test(priority = 6)
	public void Mouse_Over_On_New_Batches() throws InterruptedException, AWTException {
        CloudObject pg = new CloudObject(driver);
		pg.Mouse_Over_On_New_Batches();
		Reporter.log("Mouse Over New Batches Successfully");
	}
	@Test(priority = 7)
	public void Mouse_Over_On_In_Sights() throws InterruptedException, AWTException {
        CloudObject pg = new CloudObject(driver);
		pg.Mouse_Over_On_In_Sights();
		Reporter.log("Mouse Over In Sights Successfully");
	}
	@Test(priority = 8)
	public void Mouse_Over_On_Contact() throws InterruptedException, AWTException {
        CloudObject pg = new CloudObject(driver);
		pg.Mouse_Over_On_Contact();
		Reporter.log("Mouse Over Contact Successfully");
	}
}