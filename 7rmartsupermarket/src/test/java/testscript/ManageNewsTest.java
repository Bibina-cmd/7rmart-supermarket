package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	// private static final ManageNewsPage managenewspage = null;

	@Test(description = "verifying manage news page")

	public void manageNewsField() throws IOException {

		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		// loginpage.clickRemenber();
		loginpage.clickOnSignInButton();

		ManageNewsPage managenewpage = new ManageNewsPage(driver);
		managenewpage.manageNews();
		managenewpage.clickNewNews();
		managenewpage.enterTheNewsField();
		managenewpage.clickSaveButton();
		boolean alert = managenewpage.isAlertPopupIsDisplayed();
		Assert.assertTrue(alert);

	}

}
