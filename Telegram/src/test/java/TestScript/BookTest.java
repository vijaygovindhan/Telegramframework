package TestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ObjectRepositry.BooksPage;
import ObjectRepositry.WelcomPage;

public class BookTest {

	@Test (groups = "smoke")
	public void book_001 () {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomPage welcompage=new WelcomPage(driver);
		welcompage.getBookslink().click();
		
		BooksPage bookspage=new BooksPage(driver) ;
	
		
		/*if (bookspage.getBookslink().getText().equals("Books")) 
			System.out.println("Test ase pass");
		else {
				System.out.println("Test Case Faill");
			}*/
		
		String actualResult=bookspage.getpageTitle().getText();
		//verify Books page is displayed
		//hardAssert
	Assert.assertEquals(actualResult, "Books");
		
		//softAssert
		//SoftAssert soft=new SoftAssert();
	//	soft.assertEquals(actualResult,"Books");
		driver.quit();
	//	soft.assertAll();
		
	}
}
