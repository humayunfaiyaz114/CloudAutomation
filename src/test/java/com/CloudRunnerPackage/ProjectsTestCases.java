package com.CloudRunnerPackage;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CloudObjectPackage.BaseClass;
import com.CloudObjectPackage.ProjectsObject;

public class ProjectsTestCases extends BaseClass {
	@Test(priority = 1)
	public void Mouse_Over_On_Projects() throws InterruptedException, AWTException {
		ProjectsObject pg = new ProjectsObject(driver);
		pg.Mouse_Over_On_Projects();
		Reporter.log("Mouse Over on PROJECTS Successfully");
	}

	@Test(priority = 2)
	public void Click_Live_Projects() throws InterruptedException, AWTException {
		ProjectsObject pg = new ProjectsObject(driver);
		pg.Click_Live_Projects();
		Reporter.log("Clicked On LIVE PROJECTS Succesfully");
	}

	@Test(priority = 3)
	public void Click_IEEE_Projects() throws InterruptedException, AWTException {
		ProjectsObject pg = new ProjectsObject(driver);
		pg.Click_IEEE_Projects();
		Reporter.log("Clicked On IEEE PROJECTS Succesfully");
	}
	@Test(priority = 4)
	public void Click_Internship_Projects() throws InterruptedException, AWTException {
		ProjectsObject pg = new ProjectsObject(driver);
		pg.Click_Intership_Projects();
		Reporter.log("Clicked On INTERNSHIP PROJECTS  Succesfully");
	}
	@Test(priority = 5)
	public void Click_Real_Time_Projects() throws InterruptedException, AWTException {
		ProjectsObject pg = new ProjectsObject(driver);
		pg.Click_Real_Time_Projects();
		Reporter.log("Clicked On REAL TIME PROJECTS Successfully");
	}
	
}
