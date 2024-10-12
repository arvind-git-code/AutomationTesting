import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitilyWait {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "\\Users\\arvin\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://upsee.in/");
			//explicity wait is for a specific element and implicitylywait is for whole web page 
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("form-field-name")));
			element.sendKeys("arvind");
	        		
	}
		
}