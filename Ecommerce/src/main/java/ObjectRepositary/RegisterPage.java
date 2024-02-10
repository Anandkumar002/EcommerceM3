package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.implementation.bind.annotation.Super;
import net.bytebuddy.implementation.bind.annotation.SuperCall;

public class RegisterPage extends BasePage {
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		}
	@FindBy(id = "gender-male")
	private WebElement MaleGenderRadiobutton;
	
	@FindBy(id = "gender-female")
	private WebElement FemaleGenderRadiobutton;
	
	@FindBy(id = "FirstName")
	private WebElement Firstnametextfield;
	
	@FindBy(id = "LastName")
	private WebElement Lastnametextfield;
	
	@FindBy(id = "Email")
	
	private WebElement Emailtextfield;
	
	@FindBy (id = "Password")
	private WebElement Passwordtextfield;
	
	@FindBy (id = "ConfirmPassword")
	private WebElement Confirmpasswordtextfield;

	public WebElement getMaleGenderRadiobutton() {
		return MaleGenderRadiobutton;
	}

	public WebElement getFemaleGenderRadiobutton() {
		return FemaleGenderRadiobutton;
	}

	public WebElement getFirstnametextfield() {
		return Firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return Lastnametextfield;
	}

	public WebElement getEmailtextfield() {
		return Emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return Passwordtextfield;
	}

	public WebElement getConfirmpasswordtextfield() {
		return Confirmpasswordtextfield;
	}
	
	

}
