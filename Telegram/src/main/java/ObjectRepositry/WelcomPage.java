package ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomPage {
	
	public WelcomPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingcartlink;
	@FindBy(linkText = "Wishlist")
	private WebElement wishlistlink;
	@FindBy(css = "[value='Add to cart']")
	private WebElement AddtoCartlink;
	@FindBy(xpath = "(//a[@class='account'])[1]")
	private WebElement vickytry22gmaillink;
	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookslink;
	@FindBy(partialLinkText = "Computers")
	private WebElement computerslink;
	@FindBy(partialLinkText = "Electronics")
	private WebElement electronicslink;
	@FindBy(linkText = "Apparel & Shoes")
	private WebElement apparelnshoeslink;
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitaldownloadslink;
	@FindBy(linkText = "Jewelry")
	private WebElement jewelrylink;
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftcardslink;
	@FindBy(linkText = "Log out")
	private WebElement Logoutbutton;
	public WebElement getRegisterlink() {
		return registerlink;
	}
	public WebElement getLoginlink() {
		return loginlink;
	}
	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}
	public WebElement getWishlistlink() {
		return wishlistlink;
	}
	public WebElement getAddtoCartlink() {
		return AddtoCartlink;
	}
	public WebElement getVickytry22gmaillink() {
		return vickytry22gmaillink;
	}
	public WebElement getBookslink() {
		return bookslink;
	}
	public WebElement getComputerslink() {
		return computerslink;
	}
	public WebElement getElectronicslink() {
		return electronicslink;
	}
	public WebElement getApparelnshoeslink() {
		return apparelnshoeslink;
	}
	public WebElement getDigitaldownloadslink() {
		return digitaldownloadslink;
	}
	public WebElement getJewelrylink() {
		return jewelrylink;
	}
	public WebElement getGiftcardslink() {
		return giftcardslink;
	}
	public WebElement getLogoutbutton() {
		return Logoutbutton;
	}
	
	
	
	
	}


