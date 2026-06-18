package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base {
	@Test(description = "verifying manage footertext page")
	
	public void varifyUserNameAndPassword() throws IOException {
		String username = ExcelUtility.getStringData(1,0,"loginpage");
		String password = ExcelUtility.getStringData(1,1,"loginpage");
		

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		//loginpage.clickRemenber();
		loginpage.clickOnSignInButton();
		
		ManageFooterTextPage managefootertextpage = new ManageFooterTextPage(driver);
		managefootertextpage.clickManageFooterText();
		managefootertextpage.clickAction();
		managefootertextpage.updateAddress();
		managefootertextpage.updateEmail();
		managefootertextpage.updatePhone();

}
}