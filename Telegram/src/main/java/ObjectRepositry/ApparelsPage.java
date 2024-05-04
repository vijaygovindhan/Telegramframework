package ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelsPage {

	public ApparelsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
		@FindBy(xpath = "//div[@class='page-title']")
		   WebElement TitleofthePage;

		public WebElement getTitleofthePage() {
			return TitleofthePage;
		}
	

}
