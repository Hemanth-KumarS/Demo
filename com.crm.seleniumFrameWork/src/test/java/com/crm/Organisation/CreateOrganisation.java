package com.crm.Organisation;


import org.testng.annotations.Test;


import com.crm.Generic_Utilities.BaseClass;
import com.crm.Generic_Utilities.Excel_Utility;

import com.crm.Generic_Utilities.Java_Utility;
import com.crm.Generic_Utilities.WebDriver_Utility;
import com.crm.PageObjectModel.HomePage;

import com.crm.PageObjectModel.OrganisationPage;
import com.crm.PageObjectModel.VerificationAndValidation;



public class CreateOrganisation extends BaseClass {
	

	//public static void main(String[] args) throws Throwable {
	
	@Test(groups = "smokeTest")
	//@Test(retryAnalyzer=com.crm.Generic_Utilities.RetryAnalyser1.class)
	//@Test
	public void CreateOrganisationTest() throws Throwable {
		
		WebDriver_Utility wlib=new WebDriver_Utility();
		wlib.waitForPageToLoad(driver);
		wlib.maximizeTheWindow(driver);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnOrg();
		
	//	Assert.assertEquals("A", "B");
		
		OrganisationPage op=new OrganisationPage(driver);
		op.ClickOnCrecateOrg();
		
		Java_Utility jlib=new Java_Utility();
		int ranNum = jlib.getRanDomNum();
		
		Excel_Utility elib=new Excel_Utility();
		String data1 = elib.getExcelKeyValue("Qspider",0, 0)+ranNum;
		
		OrganisationPage op1=new OrganisationPage(driver);
		op1.OrgName(data1);
		
	/*	SoftAssert soft=new SoftAssert();
		soft.assertEquals("A", "B");*/
			
		op1.clickOnSave();
		
		VerificationAndValidation verify=new VerificationAndValidation(driver);
		verify.verifyAndValidation(driver, data1);
		
		//soft.assertAll();

			}
}
/*	@Test
	public void modifyOrg() {
		System.out.println("organisation is passed");
	}


	}*/


