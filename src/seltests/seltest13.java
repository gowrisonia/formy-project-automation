package seltests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class seltest13 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/fileupload");
		
		WebElement fileuploadfield = driver.findElement(By.id("file-upload-field"));
		fileuploadfield.sendKeys("fileupload.png");

		Thread.sleep(10000);
		
		//WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		//autocomplete.click();
		
		
				
		System.out.println("test completed");
		
		//driver.quit();
		
	}
}
