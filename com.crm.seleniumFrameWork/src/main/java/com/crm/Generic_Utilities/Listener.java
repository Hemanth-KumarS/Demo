package com.crm.Generic_Utilities;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	public void onTestFailure(ITestResult result) {
		System.out.println("listener");
	/*	String testname= result.getMethod().getMethodName();
		
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sDriver);
		File srcFile = edriver.getScreenshotAs(OutputType.FILE);
		
		try {
			File destFile=new File("./com.crm.seleniumFrameWork/ScreenShot/"+testname+".png ");
			FileUtils.copyFile(srcFile, destFile);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	}	
}
