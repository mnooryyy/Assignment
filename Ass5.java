package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Ass5 {
	WebDriver driver;
	@BeforeMethod
	  public void Launch()
	  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noory\\Desktop\\Selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.vitshr.com/");
	  }
	
  @Test
  public void login()
  
  {  
	  
		
	  
	  driver.findElement(By.linkText("Register")).click();
	  
	  driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("test");
	  driver.findElement(By.xpath("//input[@name='phoneNo']")).sendKeys("111111111");
  }
  

  @AfterMethod
  public void afterMethod()
  {
	 // driver.close();
  }

}
