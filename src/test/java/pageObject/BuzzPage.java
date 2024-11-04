package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class BuzzPage {
	public BuzzPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	
	}
	
	@FindBy(xpath="//h6[text()='Buzz']")
	public WebElement buzzPageTitle;
	
}
