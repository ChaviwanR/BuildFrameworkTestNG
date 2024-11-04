package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class TC_MyInfo_001 extends CommonMethods {
	@Test
	public void verifyViewPesonalDetails() throws InterruptedException {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_MyInfo"));
		CommonMethods.hardWait(2);
		Assert.assertEquals(mp.userDropDown.getText(), mp.userName.getText());
		
	}

}
