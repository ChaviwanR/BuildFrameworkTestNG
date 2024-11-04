package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_003 extends CommonMethods {

	@Test
	public void verifyQuickLaunch_LeaveList() {
		CommonMethods.ClickOnNavigationBarGetAttribute(dp.QLaunchBtn, BaseClass.getProperty("QLaunch_Menu_LeaveList"), "title");
		Assert.assertEquals(LeaP.leaveListPageTitle.getText(), BaseClass.getProperty("PageTitle_LeaveList"));
		
		
	}

}
