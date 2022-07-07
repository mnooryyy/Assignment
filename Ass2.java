package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Ass2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noory\\Desktop\\Selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();  
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");
		String u = driver.getCurrentUrl();
		Assert.assertEquals(u, "https://www.facebook.com/","Not passed");
		System.out.println(u);
	WebElement c=driver.findElement(By.xpath("//a[text()='Create new account']"));
	c.click();
	//	driver.findElement(By.xpath("//a[text()='Create new account"])).click();
	String p=c.getText();
	System.out.println(c.getText()+"is the the text wanted");
	}
	
	

}
