package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class MyInfoPage {
	public MyInfoPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//h6[text()='PIM']")
	public WebElement myInfoPageTitle;
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	public WebElement userDropDown;
	
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 --strong']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement firstNameTxtbox;
	
	@FindBy(xpath="//input[@name='lastName']")
	public WebElement lastNameTxtBox;
	
	@FindBy(xpath="//div[@class=\"orangehrm-edit-employee-content\"]/div[1]//button")
	public WebElement saveBtn;

}
