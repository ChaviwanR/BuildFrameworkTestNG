package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_017 extends CommonMethods {

	@Test
	public void verifyLeftMenu_Maintenance() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_Maintenance"));
		mainP.pwdTxtBox.sendKeys(BaseClass.getProperty("password"));
		mainP.confirmBtn.click();
		Assert.assertEquals(mainP.maintenancePageTitle.getText(), BaseClass.getProperty("Maintenance_Title"));
		
	}

}
