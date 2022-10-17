package com.crm.Product;

import org.testng.annotations.Test;

import com.crm.Generic_Utilities.BaseClass;
import com.crm.Generic_Utilities.Excel_Utility;

import com.crm.Generic_Utilities.Java_Utility;
import com.crm.Generic_Utilities.WebDriver_Utility;
import com.crm.PageObjectModel.HomePage;

import com.crm.PageObjectModel.ProductPage;

public class CreateProduct extends BaseClass{
	
	//public static void main(String[] args) throws Throwable {
	
	@Test(groups = "smokeTest")
	public void CreateProductTest() throws Throwable {
		WebDriver_Utility wlib=new WebDriver_Utility();
		wlib.waitForPageToLoad(driver);
		wlib.maximizeTheWindow(driver);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnProduct();
		
		ProductPage pp=new ProductPage(driver);
		pp.createProduct();
		
		Java_Utility jlib=new Java_Utility();
		int ranNum = jlib.getRanDomNum();
		
		//fetching data from excel	
		Excel_Utility elib=new Excel_Utility();
		String data1 = elib.getExcelKeyValue("Qspider",1, 0)+ranNum;
		
		pp.productName(data1);
		String Actdata = pp.headText();
		
		if(Actdata.contains(data1)) {
			System.out.println("Product is created ");
		}
		else {
			System.out.println("Product is not created");
		}
		
	}

}
