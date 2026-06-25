package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtilities;
import utilities.ExcelUtility;
import utilities.FakerUtility;
import utilities.PageUtility;

public class AdminUsersTest extends Base {
	@Test//(retryAnalyzer = retry.Retry.class)
	(description= "verifying admin users page")
	
	
public void varifyUserNameAndPassword() throws IOException {
	String username = ExcelUtility.getStringData(1,0,"loginpage");
	String password = ExcelUtility.getStringData(1,1,"loginpage");
	
    LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsername(username);
	loginpage.enterpassword(password);
	//loginpage.clickRemenber();
	loginpage.clickOnSignInButton();
	
	AdminUsersPage adminuserpage = new AdminUsersPage(driver);
	//String username1 = ExcelUtilities.getStringData(1,0,"newuserlogin");
	String password1 = ExcelUtilities.getStringData(1,1,"newuserlogin");
	
	FakerUtility fakerutility = new FakerUtility();
	String username1 =fakerutility.creatARandomFirstName();//fake username
	
	adminuserpage.adminUsers();
	adminuserpage.newUsers();
	adminuserpage.newUserName(username1);
	adminuserpage.newPassword(password1);
	adminuserpage.newUserType();
	adminuserpage.clickSaveButton();
	boolean alert = adminuserpage.alertPopup();
	Assert.assertTrue(alert);
	
	
	
	
	
	
}

}
