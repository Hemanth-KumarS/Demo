package Pratice;

import java.io.FileInputStream;


import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.Generic_Utilities.Excel_Utility;
import com.crm.Generic_Utilities.File_Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	
	public static void main(String[] args) throws Throwable {
		File_Utility flib1=new File_Utility();
		String BROWSER = flib1.getPropertyKeyValue("browser");
		WebDriver driver;
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();	
			driver= new FirefoxDriver();
			
			
		}
		else if(BROWSER.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 
		 File_Utility flib=new File_Utility();
		 String URL = flib.getPropertyKeyValue("url1");
		
		driver.get(URL);
		driver.findElement(By.id("fromCity")).click();
		
		FileInputStream fis1= new FileInputStream("./Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet("Qspider");
		Row row = sh.getRow(3);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		
        driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys(data);
        driver.findElement(By.xpath("//p[contains(text(),'"+data+"')]")).click();
        
        Excel_Utility elib=new Excel_Utility();
		String data1 = elib.getExcelKeyValue("Qspider",4, 0);
				
        
		
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys(data1);
		driver.findElement(By.xpath("//p[contains(text(),'"+data1+"')]")).click();
		
			
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(1000);
		
		String month = "September 2022";
		String date = "30";
		
		 WebElement data3 = driver.findElement(By.xpath("//div[text()='"+month+"']"+"/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']"));
		 data3.click();
		
		driver.findElement(By.xpath("//span[text()='RETURN']")).click();
		
		String month1 = "October";
		String date1 = "1";
		
		WebElement data4 = driver.findElement(By.xpath("//div[text()='"+month1+"']"+"/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date1+"']"));
		data4.click();
		
		driver.findElement(By.xpath("//label[@for='travellers']")).click();
		
		String adult = "adults-3";
		String children = "children-2";
		String infants = "infants-2";
		String Class = "travelClass-1";
		
		driver.findElement(By.xpath("//li[@data-cy='"+adult+"']")).click();
		driver.findElement(By.xpath("//li[@data-cy='"+children+"']")).click();
		driver.findElement(By.xpath("//li[@data-cy='"+infants+"']")).click();
		driver.findElement(By.xpath("//li[@data-cy='"+Class+"']"+"/ancestor::div[@class='travellers gbTravellers']/descendant::button[text()='APPLY']")).click();
		
		
		
		
	}

}
