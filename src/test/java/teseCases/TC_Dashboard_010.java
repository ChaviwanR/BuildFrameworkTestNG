package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_010 extends CommonMethods {

	@Test
	public void verifyLeftMenu_Leave() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_Leave"));
		Assert.assertEquals(LeaP.leavePageTitle.getText(), BaseClass.getProperty("LeavePage_Title"));
		
	}

}
