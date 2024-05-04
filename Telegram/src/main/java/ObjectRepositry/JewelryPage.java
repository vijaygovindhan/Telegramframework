package ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {
	public JewelryPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//input[@type='button'])[3]")
	private WebElement DiamondHeartAddToCartBtn;

	public WebElement getDiamondHeartAddToCartBtn() {
		return DiamondHeartAddToCartBtn;
	}
	

}
