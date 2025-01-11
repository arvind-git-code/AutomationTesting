package automationConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;

//#no-such-element-exception
public class DeleteEmail {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","src/resource/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		
		Cookie sid=new Cookie("SID","g.a000rggni1Z9qGPh10hfu7fXUhrW75jHh9Eg8XYcsjVhRqFRZFxq08EyE9RKIQAACgYKAUoSARASFQHGX2MiT7uR2LiEcYosUrsU5HaSCxoVAUF8yKogkHHmTDs36OqhVuREBL7G0076",".google.com","/",null);
		Cookie hsid=new Cookie("HSID","A3FR-cfyb",".google.com","/",null);
		Cookie ssid=new Cookie("SSID","",".google.com","/",null);
		Cookie asipid=new Cookie("ASPISID","U4-A",".google.com","/",null);
		Cookie osid=new Cookie("OSID","g.a00XnU8pnQ4Rpo-NY3Lr",".google.com","/",null);
		Cookie otz=new Cookie("OTZ","7880460_34_34__34_",".google.com","/",null);
		
		
		
		driver.manage().addCookie(sid);
		driver.manage().addCookie(hsid);
		driver.manage().addCookie(ssid);
		driver.manage().addCookie(asipid);
		driver.manage().addCookie(osid);
		driver.manage().addCookie(otz);
		
		
		
		driver.navigate().refresh();
		
		
		
		 
//		driver.manage().window().fullscreen();
//		driver.findElement(By.name("identifier")).sendKeys("arvindkumarlbsmca@gmail.com");
//		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
