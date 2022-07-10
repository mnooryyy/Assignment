package practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class As1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noory\\Desktop\\Selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();  
		   driver.manage().window().maximize();
		   driver.get("https://vtshr.com/");
		  String t =driver.getTitle();
		 Assert.assertTrue(true, t);
		  Assert.assertEquals(t, "VTS Human Resources Consulting | HR Recruiting, Growth, Development and Training.");
		System.out.println(t);
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://vtshr.com/");
	System.out.println(	driver.getCurrentUrl());
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
	}

}
