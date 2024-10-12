import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;

public class CreatingXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\arvin\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
		//when we copy x path sometime gives below type of xpath which is not recommended because after some time the hieracy changes then the xpath will not work
		
		//*[@id="post-6"]/div/div/section[3]/div/div[3]/div/div[1]/div/div/div/div/a
		
		//*[@id="vl-flyout-nav"]/ul/li[12]/a
		//*[@id="userid"]   
		driver.findElement(By.xpath("//*[@id='userid']")).click();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("arvind");
		driver.findElement(By.xpath("//input[contains(@id,userid)]")).sendKeys(Keys.CONTROL + "a",Keys.DELETE);
		// start with //element[@attribute='value']
		
		//here contains function does not use = to to write value it use ,  userid can be put in quote also
		//contains function used even the id changed on every page refresh like user_123 -> refresh -> user_476
		// to handel this used partial id name like below
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,user)]")).sendKeys(Keys.CONTROL + "z");
		Thread.sleep(3000);
		driver.findElement(By.ByCssSelector.xpath("//input[starts-with(@id,'user')]")).sendKeys("arvind@gmail.com");
		
		//for link only text function can be used
		driver.findElement(By.xpath("//a[contains(text(),'AdChoice')]")).click();
		
		
		//similarly ends-with
		//Q. how will you handle dynamics id
	}	//advantage and disadvantage of using absolute xpath

}
