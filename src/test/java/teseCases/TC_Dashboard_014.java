package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_014 extends CommonMethods {

	@Test
	public void verifyLeftMenu_Performance() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_Performance"));
		Assert.assertEquals(pp.performancePageTitle.getText(), BaseClass.getProperty("PerformancePage_Title"));
		
	}

}
