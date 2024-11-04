package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_005 extends CommonMethods {

	@Test
	public void verifyQuickLaunch_applyLeave() {
		CommonMethods.ClickOnNavigationBarGetAttribute(dp.QLaunchBtn, BaseClass.getProperty("QLaunch_Menu_ApplyLeave"), "title");
		Assert.assertEquals(LeaP.applyLeavePageTitle.getText(), BaseClass.getProperty("PageTitle_ApplyLeave"));
		
		
	}

}
