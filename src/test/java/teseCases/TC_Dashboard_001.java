package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class TC_Dashboard_001 extends CommonMethods{
	@Test
	public void clickOnTimeAtWork() {
		dp.timeAtWorkBtn.click();
		Assert.assertEquals(tp.punchInTxt.getText(),BaseClass.getProperty("TimePage_PunchIn"));
	}

}
