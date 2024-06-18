package com.CloudRunnerPackage;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CloudObjectPackage.BaseClass;
import com.CloudObjectPackage.InSightsObject;

public class InSightsTestCases extends BaseClass {
	@Test(priority = 1)
	public void Mouse_Over_On_In_Sights() throws InterruptedException, AWTException {
        InSightsObject pg = new InSightsObject(driver);
		pg.Mouse_Over_On_In_Sights();
		Reporter.log("Mouse Over on In Sights Successfully");
	}
	@Test(priority = 2)
	public void Click_Success() throws InterruptedException, AWTException {
		InSightsObject pg = new InSightsObject(driver);
		pg.Click_Success();
		Reporter.log("Clicked On SUCCESS Succesfully");
	}
	@Test(priority = 3)
	public void Click_World_Class_Training() throws InterruptedException, AWTException {
		InSightsObject pg = new InSightsObject(driver);
		pg.Click_World_Class_Training();
		Reporter.log("Clicked On WORLD CLASS TRAINING Succesfully");
	}
	@Test(priority = 4)
	public void Click_Training_Choice() throws InterruptedException, AWTException {
		InSightsObject pg = new InSightsObject(driver);
		pg.Click_Training_Choice();
		Reporter.log("Clicked On Training Choice Successfully");
	}
	@Test(priority = 5)
	public void Click_Thought_Leadership() throws InterruptedException, AWTException {
		InSightsObject pg = new InSightsObject(driver);
		pg.Click_Thought_Leadership();
		Reporter.log("Clicked On THOUGHT LEARDERSHIP Successfully");
	}

}
