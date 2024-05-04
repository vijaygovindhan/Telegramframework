package TestScript;

import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import ObjectRepositry.JewelryPage;
import ObjectRepositry.WelcomPage;

public class JewelryTest  extends BaseClassFinder {
	
	
	@Test
	public void jewelery_001() {
		WelcomPage welcom=new WelcomPage(driver);
		JewelryPage jewelry=new JewelryPage(driver);
		
		getWebElementScreenshot(jewelry.getDiamondHeartAddToCartBtn());
		 
	}

}
