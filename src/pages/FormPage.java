package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
	
	public void submitForm(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("first-name")).sendKeys("Surya");
		driver.findElement(By.id("last-name")).sendKeys("Narayana");
		driver.findElement(By.id("job-title")).sendKeys("QA Manager");
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.cssSelector("option[value='4']")).click();
		//*[@id="select-menu"]/option[5]
		driver.findElement(By.id("datepicker")).sendKeys("01/01/2000");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	}

}
