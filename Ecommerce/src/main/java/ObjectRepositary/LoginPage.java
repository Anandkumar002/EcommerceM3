package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Genericlibriary.BasePage;

public class LoginPage extends BasePage{
public LoginPage(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
}

	@FindBy(id ="Email")
	private WebElement emailText;
	
	
	@FindBy(id ="Password")
	private WebElement passwordText;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
 public WebElement getLoginButton() {
		return loginButton;
	}

public WebElement getPasswordText() {
		return passwordText;
	}

public WebElement getEmailText() {
		return emailText;
	}
}
