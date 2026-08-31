package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

@Test
public class TC_003TitleContainSwag extends BaseClass {
	LoginPage lp;
	public void verifyTitleContainSwag() {
		lp = new LoginPage(driver);
		boolean status = lp.verifyTitleContainSwag();
		Assert.assertEquals(status, true);
	}

}
