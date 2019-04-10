package seltests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;
import pages.FormPage;
import pages.ConfirmationPage;

public class seltest17 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/form");
		
		FormPage formPage = new FormPage();
		formPage.submitForm(driver);
		
		ConfirmationPage confirmationPage = new ConfirmationPage();
		
		confirmationPage.waitForAlertBanner(driver);
		
		assertEquals(confirmationPage.getAlertText(driver), "The form was successfully submitted!");
		
		System.out.println("test completed");
		
		//driver.quit();
		
	}
	
	
	
	
}
