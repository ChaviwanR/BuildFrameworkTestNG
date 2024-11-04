package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class TimePage {
	public TimePage() {
		PageFactory.initElements(BaseClass.getDriver(),this);
	}
	
	@FindBy(xpath="//h6[text()='Time']")
	public WebElement timePageTitle;
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	public WebElement punchInTxt;
	
	
	

}
