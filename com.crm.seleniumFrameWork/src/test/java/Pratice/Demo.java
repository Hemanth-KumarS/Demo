package Pratice;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 FileInputStream fis=new FileInputStream("./Common_Data.properties");
 Properties p=new Properties();
 p.load(fis);
String URL = p.getProperty("url");
String UN = p.getProperty("un");
String PW = p.getProperty("pw");

driver.get(URL);
driver.findElement(By.name("user_name")).sendKeys(UN);
driver.findElement(By.name("user_password")).sendKeys(PW);
driver.findElement(By.id("submitButton")).click();


	}

}
