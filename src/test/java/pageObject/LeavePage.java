package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LeavePage {
	public LeavePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//h6[text()='Leave']")
	public WebElement leavePageTitle;
	
	@FindBy(xpath="//h6[text()='Assign Leave']")
	public WebElement assignLeavePageTitle;
	
	@FindBy(xpath="//h5[text()='Leave List']")
	public WebElement leaveListPageTitle;
	
	@FindBy(xpath="//h6[text()='Timesheets']")
	public WebElement timesheetsPageTitle;
	
	@FindBy(xpath="//h6[text()='Apply Leave']")
	public WebElement applyLeavePageTitle;
	
	@FindBy(xpath="//h5[text()='My Leave List']")
	public WebElement myLeaveListPageTitle;
	
	@FindBy(xpath="//h6[text()='My Timesheet']")
	public WebElement myTimeSheetPageTitle;




}
