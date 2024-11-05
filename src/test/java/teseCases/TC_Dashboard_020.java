package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_020 extends CommonMethods {

	@Test
	public void verifyLeftMenu_Claim() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_Claim"));
		Assert.assertEquals(cp.claimPageTitle.getText(), BaseClass.getProperty("ClaimPage_Title"));
		
	}

}
