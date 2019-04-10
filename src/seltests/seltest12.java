package seltests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class seltest12 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/dropdown");
		
		WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
		dropdownMenuButton.click();
		//dropdownMenuButton.sendKeys(Keys.RETURN);

		Thread.sleep(10000);
		
		//WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		//autocomplete.click();
		
		WebElement fileupload = driver.findElement(By.xpath("/html/body/div/div/div/a[8]"));
		fileupload.click();
				
		System.out.println("test completed");
		
		//driver.quit();
		
	}
}
