package ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText =  "Books")
	private WebElement bookslink;

	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getpageTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	
}