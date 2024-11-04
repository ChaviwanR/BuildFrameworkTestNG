package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_004 extends CommonMethods {

	@Test
	public void verifyQuickLaunch_TimeSheets() {
		CommonMethods.ClickOnNavigationBarGetAttribute(dp.QLaunchBtn, BaseClass.getProperty("QLaunch_Menu_Timesheets"), "title");
		Assert.assertEquals(LeaP.timesheetsPageTitle.getText(), BaseClass.getProperty("PageTitle_Timesheets"));
		
		
	}

}
