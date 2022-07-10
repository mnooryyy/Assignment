package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Ass2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noory\\Desktop\\Selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();  
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		   driver.get("https://www.facebook.com/");
		String u = driver.getCurrentUrl();
		Assert.assertEquals(u, "https://www.facebook.com/","Not passed");
		System.out.println(u);
	WebElement c=driver.findElement(By.xpath("//a[text()='Create new account']"));
	c.click();
	//	driver.findElement(By.xpath("//a[text()='Create new account"])).click();
	String p=c.getText();
	System.out.println(p+ ":is the expected text");
	// the second part of Assignment 2
	// this code is not working,I could not figure it out: driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("Munir");
	}
	
	

}
