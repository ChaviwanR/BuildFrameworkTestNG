package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_008 extends CommonMethods {

	@Test
	public void verifyLeftMenu_Admin() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_Admin"));
		Assert.assertEquals(ap.adminPageTitle.getText(), BaseClass.getProperty("adminPage_Title"));
		
	}

}
