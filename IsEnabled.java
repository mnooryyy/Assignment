package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) 
	{
		String tex="Pari";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noory\\Desktop\\Selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		     driver.findElement(By.xpath("//input[@id='name']")).sendKeys(tex);
		     driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		    System.out.println(driver.switchTo().alert().getText()); 
		    driver.switchTo().alert().accept();
		    driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		    System.out.println(driver.switchTo().alert().getText());
		    driver.switchTo().alert().dismiss();
		     
		    
	}

}