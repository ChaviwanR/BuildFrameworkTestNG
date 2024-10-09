package teseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.PageInitializer;
import utilities.RetryAnalyzer;

public class tryingOutFewTestCases extends PageInitializer{
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(false, null);
	}
	
	public void test2() {
		
	}
	

}
