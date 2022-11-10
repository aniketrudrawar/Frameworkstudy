package com.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.utillity.PropertiesRead;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public  WebDriver driver;
	
	PropertiesRead prop = new PropertiesRead();
	
	String BrowserVal = prop.browser();
	
	public String URL = prop.URL();
	
	 @BeforeTest
	public void BrowserSetup() {
		
		if(BrowserVal.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			}else if(BrowserVal.equalsIgnoreCase("edge")) {
				
				WebDriverManager.edgedriver().setup();
				 driver = new EdgeDriver();
				}else {
					
					System.out.println("browser value is wrong");
				}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	 @AfterTest
	 public void Tearup() {
		 driver.close();
	 }

}
