package teseCases;

import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;
import utilities.PageInitializer;

public class TC001 extends CommonMethods{
	
	@Test
	public void test1() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_Admin"));
		CommonMethods.clickOnSubMenu(ap.TopMenuBar, BaseClass.getProperty("TopNavigationBar_Job")
				, ap.subMenuBar, BaseClass.getProperty("SubNavigationBar_Job_JobCategories"));
	}

}
