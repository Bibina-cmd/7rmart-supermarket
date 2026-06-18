package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FileUploadUtility;

public class ManageCategoryTest extends Base {
	@Test(description = "verifying manage category page")
	
	public void varifyUserNameAndPassword() throws IOException {
		String username = ExcelUtility.getStringData(1,0,"loginpage");
		String password = ExcelUtility.getStringData(1,1,"loginpage");
		

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		//loginpage.clickRemenber();
		loginpage.clickOnSignInButton();
		
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.clickManageCategory();
		managecategorypage.clickNewCategory();
		managecategorypage.clickCategory();
		managecategorypage.clickDiscount();
		managecategorypage.clickChosenFile();
		managecategorypage.clickSaveButton();
		
		
		

}
}
