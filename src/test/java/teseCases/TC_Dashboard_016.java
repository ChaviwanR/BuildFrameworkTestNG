package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_016 extends CommonMethods {

	@Test
	public void verifyLeftMenu_Maintenance() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_Maintenance"));
		Assert.assertEquals(mainP.adminAcessTitle.getText(), BaseClass.getProperty("GrantAccess_Title"));
		
	}

}
