package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SdropDown {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noory\\Desktop\\Selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		     // select dropdown with select tag
		     WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		     Select dropdown=new Select(staticdropdown);
		     dropdown.selectByIndex(2);
		    System.out.println(dropdown.getFirstSelectedOption().getText());
		    dropdown.selectByVisibleText("USD");
		    System.out.println(dropdown.getFirstSelectedOption().getText());
		    dropdown.selectByValue("INR");
		    System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
