package seltests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class seltest10 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/checkbox");
		
		WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
		checkbox1.click();
		
		Thread.sleep(10000);
		
		
		WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2'"));
		checkbox2.click();
		checkbox1.click();
		Thread.sleep(10000);
		
		
		//WebElement checkbox3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		WebElement checkbox3 = driver.findElement(By.cssSelector("input[value='checkbox-3'"));
		checkbox3.click();		
		checkbox2.click();
		System.out.println("test completed");
		
		//driver.quit();
		
	}
}
