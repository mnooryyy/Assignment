package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Envirmentt {
	WebDriver driver;
@Parameters({"browser","url"})
  @Test
  public void enviromet(String browser,String url)//moz,chrome ,ie
  {
	  switch (browser)
	  {
	  case"chrome":
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noory\\Desktop\\Selenium\\chromedriver.exe");
			  driver=new ChromeDriver();
			  break;
	  case"frirfox":
		  System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Noory\\Desktop\\Selenium\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  default:
			  System.out.println("Invalid browser is selected");
	  }
	  driver.get(url);
	  List<WebElement>links=driver.findElements(By.tagName("a"));
	  System.out.println("the number of links are "+links.size());
	  
  }


}
