package com.crm.Lead;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadUsingDataProvider {
	static {
		System.setProperty("webdriver.driver.chrome","./chromedriver.exe");
	}
	
	@Test(dataProvider="dataProvider_test")
	public void LeadDetails(String name, String lastname, String company) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverManager.chromedriver().setup();
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		driver.findElement(By.name("firstname")).sendKeys(name);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("company")).sendKeys(company);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		driver.quit();
	  Thread.sleep(1000);	
	}
	@DataProvider
	public Object[][] dataProvider_test(){
		Object[][] objArr=new Object[3][3];
		
		objArr[0][0]="Hemanth";
		objArr[0][1]="S";
		objArr[0][2]="Asus Laptops";
		
		
		objArr[1][0]="Varun";
		objArr[1][1]="SN";
		objArr[1][2]="HP Laptops";
		
		objArr[2][0]="Niranjan";
		objArr[2][1]="CS";
		objArr[2][2]="MSI Laptops";
		
		return objArr;
	
	
}
}
