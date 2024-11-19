package org.bescent.automation.Oct2024SeleniumBatch;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImpl implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("My test Execution is started!!!");
	}

	public void onStart(ITestResult result) {
		System.out.println("start reporting!!!");
	}
	
	public void onTestFailure(ITestResult result) {
		
		new Class2Selenium().takeSS(Class2Selenium.driver);
	}

}
