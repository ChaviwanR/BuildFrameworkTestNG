package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_011 extends CommonMethods {

	@Test
	public void verifyLeftMenu_Time() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_Time"));
		Assert.assertEquals(tp.timePageTitle.getText(), BaseClass.getProperty("TimePage_Title"));
		
	}

}
