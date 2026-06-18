package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	@Test(description = "verifying manage contact page")
 
	public void varifyUserNameAndPassword() throws IOException {
		String username = ExcelUtility.getStringData(1,0,"loginpage");
		String password = ExcelUtility.getStringData(1,1,"loginpage");
		

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		//loginpage.clickRemenber();
		loginpage.clickOnSignInButton();
		
		ManageContactPage managecontactpage = new ManageContactPage(driver);
		managecontactpage.clickManageContact();
		managecontactpage.clickAction();
		managecontactpage.updatePhone();
		managecontactpage.updateAddress();
		managecontactpage.updateDeliveryTime();
		managecontactpage.clickUpdateButton();

}
}
