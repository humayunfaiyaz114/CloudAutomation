package com.CloudRunnerPackage;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CloudObjectPackage.BaseClass;
import com.CloudObjectPackage.NewBatchesObject;

public class NewBatchesTestCases extends BaseClass {
	@Test(priority = 1)
	public void Mouse_Over_On_New_Batches() throws InterruptedException, AWTException {
        NewBatchesObject pg = new NewBatchesObject(driver);
		pg.Mouse_Over_On_New_Batches();
		Thread.sleep(2000);
		Reporter.log("Mouse Over on New Batches Successfully");
	}
	@Test(priority = 2)
	public void Click_Class_Room_Anantapuram() throws InterruptedException, AWTException {
		NewBatchesObject pg = new NewBatchesObject(driver);
		pg.Click_Class_Room_Anantapuram();
		Thread.sleep(2000);
		Reporter.log("Clicked On CLASS ROOM ANANTHAPURAM Succesfully");
	}
	@Test(priority = 3)
	public void Click_Online_Classes() throws InterruptedException, AWTException {
		NewBatchesObject pg = new NewBatchesObject(driver);
		pg.Click_Online_Classes();
		Thread.sleep(2000);
		Reporter.log("Clicked On ONLINE CLASSES Succesfully");
	}
	@Test(priority = 4)
	public void Click_On_Line_Schedule() throws InterruptedException, AWTException {
		NewBatchesObject pg = new NewBatchesObject(driver);
		pg.Click_On_Line_Schedule();
		Thread.sleep(2000);
		Reporter.log("Clicked On LIVE SHEDULE Successfully");
	}
	@Test(priority = 5)
	public void Click_Free_Online_Workshops() throws InterruptedException, AWTException {
		NewBatchesObject pg = new NewBatchesObject(driver);
		pg.Click_Free_Online_Workshops();
		Thread.sleep(2000);
		Reporter.log("Clicked on FREE ONLINE WORKSHOPS Successfully");
	}
}
