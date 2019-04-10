package seltests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class seltest7 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/modal");
		
		WebElement modalbutton = driver.findElement(By.id("modal-button"));
		modalbutton.click();
		Thread.sleep(1000);
		
		
		
		WebElement closebutton = driver.findElement(By.id("close-button"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", closebutton);
		//js.executeAsyncScript("arguments[0].click();", closebutton);
		
		//closebutton.click();
		
		
		System.out.println("test completed");
		
		//driver.quit();
		
	}
}
