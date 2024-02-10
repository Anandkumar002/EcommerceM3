package Genericlibriary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {
	static Select selectOption;
	static JavascriptExecutor jse2;
	static Actions action;
	public static void selectOptionByIndex(WebElement dropdown, int index) {
		selectOption=new Select(dropdown);
		selectOption.selectByIndex(index);
	}
	
	public static void selectOptionByValue(WebElement dropdown, String value) {
		selectOption=new Select(dropdown);
		selectOption.selectByValue(value);
	}
	
	public static void selectOptionByVisibleText(WebElement dropdown, String text) {
		selectOption=new Select(dropdown);
		selectOption.selectByVisibleText(text);
	}
	
	
	public static void getWebPageScreenshot(WebDriver driver) {
//		Step 1
		TakesScreenshot ts=(TakesScreenshot) driver;
		
//		Step 2
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
//		Step 3
		File perm=new File(FrameWorkConstants.SCREENSHOTPAGEDATA_Path+getSystemDateAndTime()+".png");
		
//		Step 4
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getWebElementScreenshot(WebElement element) {
		File temp2=element.getScreenshotAs(OutputType.FILE);
		
		File perm2=new File(FrameWorkConstants.SCREENSHOTELEMENTDATA_Path+getSystemDateAndTime()+".png");
		
		try {
			FileHandler.copy(temp2, perm2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getSystemDateAndTime() {
		return LocalDateTime.now().toString().replace(":", "_").replace("-", "_");
	}
	
	
	
	public static void switchToWindowByTitle(WebDriver driver, String title) {
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String window : allWindows) {
			driver.switchTo().window(window);
			
			
			if (driver.getTitle().contains(title)) {
				break;
			}
		}
	}
	
public static void switchToWindowByURL(WebDriver driver, String url) {
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String window : allWindows) {
			driver.switchTo().window(window);
			
			
			if (driver.getTitle().contains(url)) {
				break;
			}
		}
	}
	public static void initObjects(WebDriver driver) {
		
		jse2=(JavascriptExecutor) driver;
		action = new Actions(driver);
	}
	public static void scrollWindowBy(WebDriver driver,int x, int y) {
		
		jse2.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public static void scrollWindowTo(WebDriver driver, int x, int y)
	{
		
		jse2.executeScript("window.scrollTo("+x+","+y+")");
	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element, boolean elementPosition)

	{
		
		jse2.executeScript("arguments[0].scrollIntoView("+elementPosition+")", element);
	}
	
	public static void handleDisableOrHiddenButton(WebElement element) {
		jse2.executeScript("arguments[0].click()", element);
	}
	
	public static void handleHiddenOrDisabledTextField(WebElement element, String value) {
		jse2.executeScript("arguments[0].value='"+value+"'", element);
	}
	
	public void accceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public static void moveMouseCursor(WebElement element) {
		action.moveToElement(element).perform();
	
	}
	public static void rightClick(WebElement element)
	{
		action.contextClick(element).perform();
	}
	public static void dragAndDrop(WebElement element , int x, int y)
	{
		action.dragAndDropBy(element, x, y).perform();
	}
	public static void clickAndHold(WebElement element) {
	action.clickAndHold(element).perform();
	}
	
	public static void scrollbyAmount(int x,int y) {
		action.scrollByAmount(x, y).perform();
	}
	public static void scrolltoelement(WebElement element) {
		
		action.scrollToElement(element).perform();
		
	}
	public static void scrollfromorigin(WebElement element,int x,int y) {
		
		
		action.scrollFromOrigin(ScrollOrigin.fromElement(element), x, y).perform();
	}
	public static void release(WebElement element) {
		action.release(element).perform();
	}
	public static void click(WebElement element) {
		action.click(element).perform();
	}
	public static void doubleclick(WebElement element) {
		action.doubleClick(element).perform();
	}
	
	
}

	
	
	
	
	

