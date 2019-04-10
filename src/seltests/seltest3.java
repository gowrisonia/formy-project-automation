package seltests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class seltest3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("Gachibowli, Hyderabad");
		Thread.sleep(1000);
		WebElement autocompleteresult = driver.findElement(By.className("pac-item"));
		autocompleteresult.click();
		
		System.out.println("test completed");
		
		//driver.quit();
		
	}
}
