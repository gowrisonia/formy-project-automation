package seltests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class seltest5 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/switch-window");
		
		WebElement newtabbutton = driver.findElement(By.id("new-tab-button"));
		newtabbutton.click();
		
		String originalhandle = driver.getWindowHandle();
		
		for(String handle1: driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		Thread.sleep(20000);
		driver.switchTo().window(originalhandle);
		
		System.out.println("test completed");
		
		//driver.quit();
		
	}
}
