package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DirectoryPage {
	public DirectoryPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath="//h6[text()='Directory']")
	public WebElement directoryPageTitle;
	
	
}
