package ObjectRepositry;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.google.common.annotations.VisibleForTesting;

public class Assertion {
		
		public void Books_001() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WelcomPage welcome = new WelcomPage(driver);
			BooksPage Book = new BooksPage(driver);

			// click on book link
			welcome.getBooklink().click();
			String actualResult=BooksPage.getPageTitle().getText();
			//don't use this if else use Assertion
//			// verfiy
//			if (Book.booktitle.getText().equals("Books")) {
//				System.out.println("test case pass");
//			} else {
//				System.out.println("test case fail");
//			}
	      String actualResult1=Book.getpageTitle().getText();
//			//verfiy book page is diplayed
//			//hardAssert
//			org.testng.Assert.assertEquals(actualResult, "Books");
		
			//SoftAssert
			SoftAssert soft=new SoftAssert();
			//soft.assertEquals(BooksPage.getpageTitle().isDisplayed());
			
			Soft.fail();
			
			soft.assertTrue(BooksPage.getpageTitle().isDisplayed());
			//soft.assertFalse(bookspage.getpageTitle().isDisplayed());
			
			
	driver.quit();
	
	System.out.println("Test case completed");
	
	soft.assertAll();
	
	
		}
	}


