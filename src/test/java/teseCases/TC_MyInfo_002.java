package teseCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class TC_MyInfo_002 extends CommonMethods{
	@Test
	public void editName() {
		CommonMethods.ClickOnNavigationBar(dp.leftMenu, BaseClass.getProperty("leftMunu_MyInfo"));
		CommonMethods.hardWait(2);
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver();
		js.executeScript("arguments[0].value = ''", mp.firstNameTxtbox);
		js.executeScript("arguments[0].value= arguments[1]", mp.firstNameTxtbox, BaseClass.getProperty("MyInfo_nameChange_firstName"));
		js.executeScript("arguments[0].value = ''", mp.lastNameTxtBox);
		js.executeScript("arguments[0].value= arguments[1]", mp.lastNameTxtBox, BaseClass.getProperty("MyInfo_nameChange_lastName"));
		CommonMethods.hardWait(2);
		js.executeScript("arguments[0].click();", mp.saveBtn);
	
		Assert.assertEquals(mp.firstNameTxtbox.getAttribute("value"), BaseClass.getProperty("MyInfo_nameChange_firstName"));
		Assert.assertEquals(mp.lastNameTxtBox.getAttribute("value"), BaseClass.getProperty("MyInfo_nameChange_lastName"));
	
	}
}
