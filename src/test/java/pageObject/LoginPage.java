package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(BaseClass.getDriver()	, this);
	}
	
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//button")
	public WebElement button;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[1]//span")
	public WebElement userRequired;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[2]//span")
	public WebElement pwdRequired;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	public WebElement warningTxt;
	
	
}
