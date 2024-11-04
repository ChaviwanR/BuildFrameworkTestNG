package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_007 extends CommonMethods {

	@Test
	public void verifyQuickLaunch_MyTimesheet() {
		CommonMethods.ClickOnNavigationBarGetAttribute(dp.QLaunchBtn, BaseClass.getProperty("QLaunch_Menu_MyTimesheet"), "title");
		Assert.assertEquals(LeaP.assignLeavePageTitle.getText(), BaseClass.getProperty("PageTitle_MyTimesheet"));
		
		
	}

}
