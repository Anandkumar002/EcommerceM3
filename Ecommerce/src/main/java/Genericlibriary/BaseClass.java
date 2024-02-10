package Genericlibriary;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass  extends UtilityMethods{
	
	
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
	@BeforeSuite 
	public void beforesuite() {
		 report = new ExtentReports(FrameWorkConstants.REPORTDATA_Path);
		System.out.println("Before suite");
		
	}
	@AfterSuite
	public void aftersuit() {
		report.flush();
		System.out.println("After suite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test");
		
	}
	@AfterTest
	public void aftertest() {
		
		System.out.println("After test");
	}
	@BeforeClass
	public void beforeclass() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initObjects(driver);
		System.out.println("Before class");
	}
	@AfterClass
	public void afterclass() {
		driver.quit();
		System.out.println("After class");
	}
	@BeforeMethod
	public void beforemethod(Method method) {
		String methodname = method.getName();
		test = report.startTest(methodname);
				
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("anandkumar@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("anan@123");
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		System.out.println("Before Method");
		
	}
	@AfterMethod
	public void AfterMethod() {
		report.endTest(test);
		driver.findElement(By.partialLinkText("Log out")).click();
		System.out.println("After Method");
	}
	
	
	
	

}
