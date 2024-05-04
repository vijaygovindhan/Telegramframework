package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElectronicsTest {

	@Test (groups =  "regresion")// (priority = 0)
	public void register() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Regester");
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
	}

	@Test(dependsOnMethods = "register")
	public void Login() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Login");
		driver.quit();
	}

	@Test(dependsOnMethods = "Login") // (priority = 0)
	public void addToCart() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Regester");
		driver.quit();
	}

	@Test(dependsOnMethods = "addToCart") // (priority = 0)
	public void Checkout() {
		WebDriver driver = new ChromeDriver();
		System.out.println("CheckOut");
		driver.quit();
	}

	@Test(dependsOnMethods = "addToCart") // (priority = 0)
	public void Payment() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Payment");
		driver.quit();
	}

}
