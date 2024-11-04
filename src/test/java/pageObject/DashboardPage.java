package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DashboardPage {
	
	public DashboardPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']/li")
	public List<WebElement> leftMenu;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public WebElement dashboardPageText;
	
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-action']")
	public WebElement timeAtWorkBtn;
	
	@FindBy(xpath="//div[@class='oxd-grid-3 orangehrm-quick-launch']//button")
	public List<WebElement> QLaunchBtn;
	
	@FindBy(xpath="//div[@class='orangehrm-todo-list']//button")
	public List<WebElement> MyActionMenu;
	
	
	

}
