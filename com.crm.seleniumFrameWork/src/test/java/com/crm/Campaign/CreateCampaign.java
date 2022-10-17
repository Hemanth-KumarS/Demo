package com.crm.Campaign;

import org.testng.annotations.Test;

import com.crm.Generic_Utilities.BaseClass;
import com.crm.Generic_Utilities.Excel_Utility;

import com.crm.Generic_Utilities.Java_Utility;
import com.crm.Generic_Utilities.WebDriver_Utility;
import com.crm.PageObjectModel.CampaignPage;
import com.crm.PageObjectModel.HomePage;


public class CreateCampaign extends BaseClass{
	
	//public static void main(String[] args) throws Throwable {
	
	@Test(groups = "smokeTest")
	
	public void CreateCampaignTest() throws Throwable {
		
		
		WebDriver_Utility wlib=new WebDriver_Utility();
		wlib.waitForPageToLoad(driver);
		wlib.maximizeTheWindow(driver);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnMore();
		hp.clickOnCampaign();
		
		CampaignPage cp=new CampaignPage(driver);
		cp.clickOnCreateCampaign();
			
		Java_Utility jlib=new Java_Utility();
		int ranNum = jlib.getRanDomNum();
		
		Excel_Utility elib=new Excel_Utility();
		String data1 = elib.getExcelKeyValue("Qspider",2, 0)+ranNum;
		
		cp.clickOnCampaignName(data1);
		cp.clickOnSaveButton();
		String Actdata = cp.headText();
		
		if(Actdata.contains(data1)) {
			System.out.println("Campaign is created");
		}
		else
		{
			System.out.println("Campaign is not Created");
		}
		}
	}


