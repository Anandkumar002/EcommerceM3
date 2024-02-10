package Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class RepostExample {
	ExtentReports report=new ExtentReports("./ExtentReport/report.html");
	@Test
	public void test() {
		ExtentTest test=report.startTest("LoginTestScripts");
		
		WebDriver driver=new ChromeDriver();
		test.log(LogStatus.INFO,"Browser is launched");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Maximized ");
		driver.get("https://google.com");
		test.log(LogStatus.INFO, "Navigate to google webpage");
		test.log(LogStatus.FATAL, "TestScript pass");
		report.endTest(test);
		report.flush();//to generate all report to the report folder
		
	}

}
