package com.CloudRunnerPackage;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CloudObjectPackage.BaseClass;
import com.CloudObjectPackage.ServicesObject;

public class ServicesTestCases extends BaseClass {
	@Test(priority = 1)
	public void Mouse_Over_On_Services() throws InterruptedException, AWTException {
		ServicesObject pg = new ServicesObject(driver);
		pg.Mouse_Over_On_Services();
		Reporter.log("Mouse Over on SERVICES Successfully");
	}

	@Test(priority = 2)
	public void Click_Internship_Program() throws InterruptedException, AWTException {
		ServicesObject pg = new ServicesObject(driver);
		pg.Click_Internship_Program();
		Reporter.log("Clicked On INTERNSHIP PROGRAM Succesfully");
	}

	@Test(priority = 3)
	public void Click_Placement_Assistance() throws InterruptedException, AWTException {
		ServicesObject pg = new ServicesObject(driver);
		pg.Click_Placement_Assistance();
		Reporter.log("Clicked On PLACEMENT ASSISTANCE Succesfully");
	}
	@Test(priority = 4)
	public void Click_Placements() throws InterruptedException, AWTException {
		ServicesObject pg = new ServicesObject(driver);
		pg.Click_Placements();
		Reporter.log("Clicked On PLACEMENTS Succesfully");
	}
	@Test(priority = 5)
	public void Click_Cloud_Care() throws InterruptedException, AWTException {
		ServicesObject pg = new ServicesObject(driver);
		pg.Click_Cloud_Care();
		Reporter.log("Clicked On CLOUD CARE Successfully");
	}
	

}