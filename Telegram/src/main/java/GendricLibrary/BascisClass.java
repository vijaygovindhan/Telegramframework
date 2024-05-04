package GendricLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import ObjectRepositry.LoginPage;
import ObjectRepositry.WelcomPage;

public class BascisClass {
	public WebDriver driver;
	@BeforeSuite
	public void bs() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void bt() {
		System.out.println("Before Test");
	}
	
		@BeforeClass
		public Void lanchBrowser() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			System.out.println("Before Class");
			return null;
			
		}
		@BeforeMethod
		public void login () {
			WelcomPage welcome=new WelcomPage(driver);
			
			LoginPage login=new LoginPage(driver);
			welcome.getLoginlink().click(); 
			
			login.getEmailTextField().sendKeys("vijayfuture29@gmail.com");
			login.getPasswordTextField().sendKeys("vijay29");
			
			login.getLogInbutton().click();
			
			System.out.println("Before method");			
		}
		@AfterSuite
		public void as() {
			System.out.println("After suite");
		}
		@AfterTest
		public void at() {
			System.out.println("After test");
			
		}
		@AfterClass
		public void closeBrowser() {
			driver.quit();
			System.out.println("After Class");
			
		}
		@AfterSuite
		public void logout() {
			WelcomPage welcome=new WelcomPage(driver);
			welcome.getLogoutbutton().click();
			System.out.println("After Method");
		}

	
}


