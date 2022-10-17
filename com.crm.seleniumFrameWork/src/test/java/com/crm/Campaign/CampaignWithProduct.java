package com.crm.Campaign;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.crm.Generic_Utilities.BaseClass;
import com.crm.Generic_Utilities.Excel_Utility;

import com.crm.Generic_Utilities.Java_Utility;
import com.crm.Generic_Utilities.WebDriver_Utility;
import com.crm.PageObjectModel.CampaignPage;
import com.crm.PageObjectModel.HomePage;

import com.crm.PageObjectModel.ProductPage;


public class CampaignWithProduct extends BaseClass{

	//public  static void main(String[] ary) throws Throwable{
	
	@Test(groups = "regressionTest")
	//@Test
	
	public void createCampaignWithProduct() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.clickOnProduct();

		ProductPage pp = new ProductPage(driver);
		pp.createProduct();

		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRanDomNum();

		Excel_Utility elib1 = new Excel_Utility();
		String productdata = elib1.getExcelKeyValue("Qspider", 1, 0) + ranNum;

		pp.productName(productdata);

		HomePage hp1 = new HomePage(driver);
		hp1.clickOnMore();
		hp1.clickOnCampaign();

		CampaignPage cp = new CampaignPage(driver);
		cp.clickOnCreateCampaign();

		Excel_Utility elib = new Excel_Utility();
		String data1 = elib.getExcelKeyValue("Qspider", 2, 0) + ranNum;

		cp.clickOnCampaignName(data1);
		cp.clickOnSelectProduct();

		WebDriver_Utility wlib1 = new WebDriver_Utility();
		wlib1.switchToWindow(driver, " Products&action");

		cp.clickOnSearchText(productdata);
		cp.clickOnSearchButton();

//Dynamic Xpath
		driver.findElement(By.xpath("//a[text()='" + productdata + "']")).click();

//Switch back Window
		wlib1.switchToWindow(driver, " Campaigns&action");

		cp.clickOnSaveButton();
		Thread.sleep(1000);

		String actData = cp.headText();
		if (actData.contains(data1)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}
}
