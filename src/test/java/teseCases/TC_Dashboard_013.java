package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_013 extends CommonMethods {

	@Test
	public void verifyLeftMenu_MyInfo() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_MyInfo"));
		Assert.assertEquals(mp.myInfoPageTitle.getText(), BaseClass.getProperty("MyInfoPage_Title"));
		
	}

}
