package com.eshipz.qa.utils;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.eshipz.qa.base.BaseClass;

public class ListnerCustomization extends BaseClass implements ITestListener
{
	/* This listener is used to take a screenshot whenever an error occurs and test fails*/
	
	/*on xml [after suite tag before test tag]
	 * <listeners>
	<listener class-name="packagename.classname"/>
	</listeners>*/
	
	/*on every test case class add: @Listeners(ListnerCustomization.class)
	 * so that this listeners will get activated when test fails*/
	 @Override		
	    public void onTestFailure(ITestResult res) 
	 	{			
		 System.out.println("===testcase failed===");
		
			try {
				Utilities.screenShotLogic(res.getName());
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	    }		
	
}