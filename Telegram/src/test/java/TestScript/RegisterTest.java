package TestScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {
	@Test(groups = "function")
	public void registerPage_001() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
		driver.switchTo().activeElement().sendKeys("i phone15",Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}
	

}
