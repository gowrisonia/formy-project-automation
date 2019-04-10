package seltests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class seltest15 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/autocomplete");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("Kovurnagar, Anantapur");
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element"));
		//Thread.sleep(1000);

		WebElement autocompleteresult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
		
		//WebElement  = driver.findElement());
		autocompleteresult.click();
		
		System.out.println("test completed");
		
		//driver.quit();
		
	}
}
