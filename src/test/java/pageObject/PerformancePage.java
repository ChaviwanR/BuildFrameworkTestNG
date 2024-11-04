package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class PerformancePage {
	public PerformancePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath="//h6[text()='Performance']")
	public WebElement performancePageTitle;
}
