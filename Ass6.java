package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ass6 {
	WebDriver driver;
  @Test
  public void Dragdrop() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noory\\Desktop\\Selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
	WebElement from	 =driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));
	   Actions act =new Actions(driver);
	   act.dragAndDrop(from, to).build().perform();
	  
	   if(driver.findElement(By.xpath("//p[text()='Dropped']")).isDisplayed())
	   {
		   System.out.println("Dropped displayed ");
	   }
	   else
	   {
		   System.out.println("Dropped is not displayed");
	   }
	 String colr=  driver.findElement(By.xpath("//div[@id='droppable']")).getCssValue("color");
	 String bckclr=driver.findElement(By.xpath("//div[@id='droppable']")).getCssValue("background-color");
	 System.out.println(colr);
	 System.out.println(bckclr);
	 driver.close();
	 
	 //this could not run i am  still trying to figure it out...
  }
}
