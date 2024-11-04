package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_009 extends CommonMethods {

	@Test
	public void verifyLeftMenu_PIM() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_PIM"));
		Assert.assertEquals(PIM.pimPageTitle.getText(), BaseClass.getProperty("PIMPage_Tiltle"));
		
	}

}
