package seltests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class seltest14 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("Kovurnagar, Anantapur");
		
		//driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement autocompleteresult = driver.findElement(By.className("pac-item"));
		autocompleteresult.click();
		
		System.out.println("test completed");
		
		//driver.quit();
		
	}
}
