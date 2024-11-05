package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_21 extends CommonMethods {

	@Test
	public void verifyLeftMenu_Buzz() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_Buzz"));
		Assert.assertEquals(bp.buzzPageTitle.getText(), BaseClass.getProperty("BuzzPage_Title"));
		
	}

}
