package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_012 extends CommonMethods {

	@Test
	public void verifyLeftMenu_Recruitment() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_Recruitment"));
		Assert.assertEquals(rp.recruitmentPageTitle.getText(), BaseClass.getProperty("RecruitmentPage_Title"));
		
	}

}
