package seltests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class seltest11 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/datepicker");
		
		WebElement datefield = driver.findElement(By.id("datepicker"));
		datefield.sendKeys("05/03/2019");
		datefield.sendKeys(Keys.RETURN);
		
		//checkbox1.click();
		
		Thread.sleep(10000);
		datefield.clear();
		
		datefield.sendKeys("133/03/2019");
		datefield.sendKeys(Keys.RETURN);
		
		
		
		System.out.println("test completed");
		
		//driver.quit();
		
	}
}
