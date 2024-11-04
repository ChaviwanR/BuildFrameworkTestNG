package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_002 extends CommonMethods {

	@Test
	public void verifyQuickLaunch_AssignLeave() {
		CommonMethods.ClickOnNavigationBarGetAttribute(dp.QLaunchBtn, BaseClass.getProperty("QLaunch_Menu_AssignLeave"), "title");
		Assert.assertEquals(LeaP.assignLeavePageTitle.getText(), BaseClass.getProperty("PageTitle_AssignLeave"));
		
		
	}

}
