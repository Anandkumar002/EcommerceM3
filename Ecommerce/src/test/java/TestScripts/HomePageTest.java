package TestScripts;

import org.testng.annotations.Test;

import Genericlibriary.BaseClass;
import ObjectRepositary.HomePage;

public class HomePageTest extends BaseClass{
	
	@Test
	public void homePage_001() throws InterruptedException {
		Thread.sleep(2000);
		//scroll down the window by 200 pixel
		scrollWindowBy(driver, 0, 1000);
		Thread.sleep(2000);
		scrollWindowBy(driver, 0, -500);
		Thread.sleep(2000);
		scrollWindowTo(driver, 0, 700);
		Thread.sleep(3000);
		scrollWindowTo(driver, 0, 300);
		Thread.sleep(2000);
	}
	@Test
	public void homePage_002() throws InterruptedException
	{
		HomePage home = new HomePage(driver);
		
		scrollIntoView(driver, home.getLaptopImage14Inch1(),true);
		Thread.sleep(3000);
		scrollIntoView(driver, home.getLaptopImage14Inch1(),false);
		Thread.sleep(3000);
		
	}
   @Test
   public void homePage_003() {
	   HomePage home = new HomePage(driver);
	   
	   //clcik on disabled button
	   handleDisableOrHiddenButton(home.getSearchButton());
	   
	   //accept alert
	   accceptAlert(driver);
	   
	  // ..enter the text in the disabled text field
		handleHiddenOrDisabledTextField(home.getSearchTextField(), "Books");	
		
		
	   
   }
	
	
}
