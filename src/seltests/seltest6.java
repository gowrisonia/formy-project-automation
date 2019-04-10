package seltests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class seltest6 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/switch-window");
		
		WebElement alertbutton = driver.findElement(By.id("alert-button"));
		alertbutton.click();
		Thread.sleep(10000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.println("test completed");
		
		//driver.quit();
		
	}
}
