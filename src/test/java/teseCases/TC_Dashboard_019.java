package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_019 extends CommonMethods {

	@Test
	public void verifyLeftMenu_Maintenance() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_Maintenance"));
		mainP.cancelBtn.click();
		Assert.assertEquals(dp.dashboardPageText.getText(), BaseClass.getProperty("DashboardPage_Title"));
		
	}

}
