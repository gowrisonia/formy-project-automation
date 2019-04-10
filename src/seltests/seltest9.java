package seltests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class seltest9 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/radiobutton");
		
		WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
		radiobutton1.click();
		Thread.sleep(10000);
		
		WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value='option2'"));
		radiobutton2.click();
		Thread.sleep(10000);

		//WebElement radiobutton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		WebElement radiobutton3 = driver.findElement(By.cssSelector("input[value='option3'"));
		radiobutton3.click();		
		
		System.out.println("test completed");
		
		//driver.quit();
		
	}
}
