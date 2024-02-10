package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import Genericlibriary.BasePage;

public class BookPage extends BasePage{
	public BookPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookLink;

	public WebElement getBookLink() {
		return bookLink;
	} 
	
	
}
