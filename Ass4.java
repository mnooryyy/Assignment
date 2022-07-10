package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ass4 {
	WebDriver driver;

@Parameters({"browser","url"})
	  @Test
	  public void selection(String browser,String url)//moz,chrome ,ie
	  {
		  switch (browser)
		  {
		  case"chrome":
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noory\\Desktop\\Selenium\\chromedriver.exe");
				  driver=new ChromeDriver();
				  break;
		  case"Frierfox":
			  System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Noory\\Desktop\\Selenium\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  default:
				  System.out.println("Invalid browser is selected");
  }
		  driver.get(url);
		  driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Apple watches");
	WebElement s1= driver.findElement(By.xpath("//select[@class='gh-sb ']"));
	  Select select=new Select(s1);
	  select.selectByVisibleText("Cell Phones & Accessories");
	  driver.findElement(By.xpath("//input[@value='Search']")).click();
}
}