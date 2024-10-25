import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	
		driver.get("https://upsee.in/");
		
		
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		// the above does not worked for me need to resolve
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//*[@id=\"elementor-popup-modal-53\"]/div/a")).click();
		driver.findElement(By.id("form-field-name")).sendKeys("arvind");
		driver.findElement(By.id("form-field-email")).sendKeys("arvind@gmail.com");
		
		
}
	
}
