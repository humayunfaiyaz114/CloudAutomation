package com.CloudRunnerPackage;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CloudObjectPackage.BaseClass;
import com.CloudObjectPackage.TrainingObject;

public class TrainingTestCases extends BaseClass {
	@Test(priority = 1)
	public void Mouse_Over_On_Training() throws InterruptedException, AWTException {
		TrainingObject pg = new TrainingObject(driver);
		pg.Mouse_Over_On_Training();
		Reporter.log("Mouse Over on TRAINING Successfully");
	}

	@Test(priority = 2)
	public void Click_Class_Room_Training() throws InterruptedException, AWTException {
		TrainingObject pg = new TrainingObject(driver);
		pg.Click_Class_Room_Training();
		Reporter.log("Clicked On CLASS ROOM TRAINING Succesfully");
	}

	@Test(priority = 3)
	public void Click_Online_Training() throws InterruptedException, AWTException {
		TrainingObject pg = new TrainingObject(driver);
		pg.Click_Online_Training();
		Reporter.log("Clicked On ONLINE TRAINING Succesfully");
	}
	@Test(priority = 4)
	public void Click_Weekend_Training() throws InterruptedException, AWTException {
		TrainingObject pg = new TrainingObject(driver);
		pg.Click_Weekend_Training();
		Reporter.log("Clicked On WEEKEND TRAINING Succesfully");
	}
	@Test(priority = 5)
	public void Click_Corporate_Training() throws InterruptedException, AWTException {
		TrainingObject pg = new TrainingObject(driver);
		pg.Click_Corporate_Training();
		Reporter.log("Clicked On CORPORATE TRAINING Successfully");
	}
	@Test(priority = 5)
	public void Click_Trainers_Profile() throws InterruptedException, AWTException {
		TrainingObject pg = new TrainingObject(driver);
		pg.Click_Trainers_Profile();
		Reporter.log("Clicked On TRAINERS PROFILE Successfully");
	}
	@Test(priority = 5)
	public void Click_Course_Shedule() throws InterruptedException, AWTException {
		TrainingObject pg = new TrainingObject(driver);
		pg.Click_Course_Shedule();
		Reporter.log("Clicked On COURSE SHEDULE Successfully");
	}
}