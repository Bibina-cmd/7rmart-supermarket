package testscript;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;


public class LogoutTest extends Base {
	@Test(description= "validating logout functionality", groups = {"regression"})
	public void verifyLogout() throws IOException {
		
		String username = ExcelUtility.getStringData(1,0,"loginpage");
		String password = ExcelUtility.getStringData(1,1,"loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		//loginpage.clickRemenber();
		loginpage.clickOnSignInButton();
		//
		//loginpage.
	
		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.clickMenuBar();
		logoutpage.clickLogoutButton();
		boolean sigin=logoutpage.isSignInButtonEnabled();
		Assert.assertTrue(sigin);
		
		
		}
	
	
	
	

}
