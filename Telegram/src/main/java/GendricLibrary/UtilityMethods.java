package GendricLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {
	
	public static void getWebpageScreenshot(WebDriver driver) {
		
		//step 1
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//step2
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		//step3
		File permanent = new File("./Screenshort/" + getTime() +".png");
		
		//Step 4
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			// TODO: Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void getWebElementScreenshot(WebElement element) {
		//step1
		File temp = element.getScreenshotAs(OutputType.FILE);
		
		//step2
	File permanent = new File("./Screenshot/" + getTime() + ".png");
	
	//Step3
	try {
		FileHandler.copy(temp, permanent);
		
	} catch (IOException e) {
		// TODO: Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	public static void switchToWindowByTitle1(WebDriver driver,String title) {
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window:allWindows) {
			driver.switchTo().window(window);
			String actualTitle=driver.getTitle();
			
			if (actualTitle.contains(title)) {
				break;
			}
		}
	}
	
	public static void switchToWindowByTitle(WebDriver driver,String url) {
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window:allWindows) {
			driver.switchTo().window(window);
			String actualTitle=driver.getCurrentUrl();
			
			if (actualTitle.contains(url)) {
				break;
			}
		}	
	}
	
	public static void selectOptionByIndex(WebElement dropdown,int index) {
		Select select=new Select(dropdown);
		select.selectByIndex(index);
	}
	public static void selectOptionByValue(WebElement dropdown, String value) {
		Select select=new Select(dropdown);
		select.selectByValue(value);
	}
	public static void selectOptionByIndex(WebElement dropdown, String visibleText) {
		Select select=new Select(dropdown);
		select.selectByVisibleText(visibleText);
	}
	
	public static String getTime() {
		return LocalDateTime.now().toString().replace(":", "_").replace("-", "_"); 
		
	}
	
}
