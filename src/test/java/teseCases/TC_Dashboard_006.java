package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_006 extends CommonMethods {

	@Test
	public void verifyQuickLaunch_MyLeave() {
		CommonMethods.ClickOnNavigationBarGetAttribute(dp.QLaunchBtn, BaseClass.getProperty("QLaunch_Menu_MyLeave"), "title");
		Assert.assertEquals(LeaP.myLeaveListPageTitle.getText(), BaseClass.getProperty("PageTitle_MyLeaveList"));
		
		
	}

}
