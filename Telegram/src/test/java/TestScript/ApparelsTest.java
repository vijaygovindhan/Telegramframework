package TestScript;



import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import GendricLibrary.BascisClass;
import ObjectRepositry.ApparelsPage;
import ObjectRepositry.WelcomPage;

public class ApparelsTest extends BascisClass {
	
	@Test
	public void apparel_001(Object test) {
		
			WelcomPage welcome=new WelcomPage(driver);
			
			ApparelsPage apparel=new ApparelsPage(driver);
			
			//Click on Apparels link
			welcome.getApparelnshoeslink().click();
			test.log(LogStatus.INFO, "Clicked on Apparels link");
			//Verify Apparel page is displayed
			Assert.assertEquals(apparel.getTitleofthePage().getText(), "Apparel & Shoes");
			test.log(LogStatus.PASS, "Apparels page is displayed");
			
//			Reporter.log("print",true);
		}
	}


