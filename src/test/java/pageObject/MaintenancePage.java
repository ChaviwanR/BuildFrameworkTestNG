package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class MaintenancePage {
	public MaintenancePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//h6[text()='Maintenance']")
	public WebElement maintenancePageTitle;
	
	@FindBy(xpath="//h6[text()='Administrator Access']")
	public WebElement adminAcessTitle;
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement userNameTxtBox;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement pwdTxtBox;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement confirmBtn;
	
	@FindBy(xpath="//button[@type='button']")
	public WebElement cancelBtn;
	
	@FindBy(xpath="//p[text()='Invalid credentials']")
	public WebElement warnningMsg;
	
	
}
