package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Genericlibriary.BasePage;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
	super(driver);
		// TODO Auto-generated constructor stub
	}
   @FindBy(partialLinkText = "Log In")
   private WebElement loginLink;
   
   @FindBy(partialLinkText = "Log Out")
   private WebElement logoutLink;
   
   @FindBy(partialLinkText = "Register")
   private WebElement Registerlink;
   
   @FindBy(id = "gender-male")
   private WebElement malebutton;
   
   @FindBy(xpath = "//img[@alt='Picture of 14.1-inch Laptop'")
   private WebElement laptopImage14Inch;
   
   @FindBy(className = "search-box-button")
private WebElement searchButton;
   
   @FindBy(id ="small-searchterms")
   private WebElement searchTextField;
   public WebElement getSearchTextField() {
	return searchTextField;
}

public WebElement getLaptopImage14Inch() {
	return laptopImage14Inch;
}

public WebElement getSearchButton() {
	return searchButton;
}

public WebElement getLaptopImage14Inch1() {
	return laptopImage14Inch;
}
@FindBy(id = "gender-female")
   private WebElement femalebutton;
   
   @FindBy(id = "FirstName")
   private WebElement firstnametextfield;
   
   @FindBy(id = "LastName")
   private WebElement lastnameTextfield;
   
   @FindBy(id = "Email")
   private WebElement emailtextfield;
   
   @FindBy(id = "Password")
   private WebElement passwordtextfield;
   
   @FindBy(id = "ConfirmPassword")
   private WebElement confirmpasswordtextfield;
   
   @FindBy(id = "register-button")
   private WebElement registerbutton1;

public WebElement getMalebutton() {
	return malebutton;
}

public WebElement getFemalebutton() {
	return femalebutton;
}

public WebElement getFirstnametextfield() {
	return firstnametextfield;
}

public WebElement getLastnameTextfield() {
	return lastnameTextfield;
}

public WebElement getEmailtextfield() {
	return emailtextfield;
}

public WebElement getPasswordtextfield() {
	return passwordtextfield;
}

public WebElement getConfirmpasswordtextfield() {
	return confirmpasswordtextfield;
}

public WebElement getRegisterbutton1() {
	return registerbutton1;
}

public WebElement getRegisterlink() {
	return Registerlink;
}

public WebElement getLogoutLink() {
	return logoutLink;
}

public WebElement getLoginLink() {
	return loginLink;
}


}
