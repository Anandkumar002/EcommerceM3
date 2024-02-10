package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Genericlibriary.BaseClass;
import Genericlibriary.Excelutility;
import ObjectRepositary.HomePage;
import ObjectRepositary.RegisterPage;

public class RegisterTest extends BaseClass {
	@DataProvider(name = "registerdata")
	public String[] [] data() throws EncryptedDocumentException, IOException {
		return Excelutility.getRowData("RegisterData");
		
	}
	@Test(dataProvider = "registerdata")
	public void register_001(String firstName,String lastName, String email,String password,String confirmpassword) 
	{
		HomePage homePage=new HomePage(driver);
		RegisterPage registerPage=new RegisterPage(driver);
		//click on logout link 
		homePage.getLogoutLink().click();
		//click on registerlink
		 homePage.getRegisterlink().click();
		 //click maleRadiobutto
		 homePage.getMalebutton().click();
		 //click on female button 
		 homePage.getFemalebutton().click();
		 //enter on firstname text field
		 homePage.getFirstnametextfield().click();
		 //enter on lastname textfield
		 homePage.getLastnameTextfield().click();
		 //enter email 
		 homePage.getEmailtextfield().click();
		 //enter password
		 homePage.getPasswordtextfield().click();
		 //enter confirmpasswoord
		 homePage.getConfirmpasswordtextfield().click();
		 //click registerbutton
		homePage.getRegisterbutton1().click();
		
	}
	

	}
