package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class TC_Dashboard_018 extends CommonMethods {

	@Test
	public void verifyLeftMenu_Maintenance() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_Maintenance"));
		mainP.pwdTxtBox.sendKeys(BaseClass.getProperty("wrong_pwd"));
		mainP.confirmBtn.click();
		Assert.assertEquals(mainP.warnningMsg.getText(), BaseClass.getProperty("WarningMessage"));
		
	}

}
