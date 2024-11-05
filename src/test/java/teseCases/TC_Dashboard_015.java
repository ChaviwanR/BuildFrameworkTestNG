package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_015 extends CommonMethods {

	@Test
	public void verifyLeftMenu_Directory() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_Directory"));
		Assert.assertEquals(dip.directoryPageTitle.getText(), BaseClass.getProperty("DirectoryPage_Title"));
		
	}

}
