package com.vtiger.practise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGGroupExecutionPractice extends TestNGBasicConfigAnnotaionPracticeTest {

	@Test(groups = "regression")
	public void practiceTest1() {
		Reporter.log("Test1 ", true);
	}
	
	@Test(groups = "regression")
	public void practiceTest3() {
		Reporter.log("Test3 ", true);
	}
	
	@Test(groups = "sanity")
	public void practiceTest2() {
		Reporter.log("Test2 ", true);
	}
	@Test(groups = "sanity")
	public void practiceTest4() {
		Reporter.log("Test4 ", true);
	}
	

	@Test(groups = {"regression", "sanity"})
	public void practiceTest5() {
		Reporter.log("Test5 ", true);
	}
	
	
}
