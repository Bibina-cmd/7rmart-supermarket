package testscript;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	@Test(description = "validating login functionality")
	public void verifyUserIsAbletoLogInUsingvalidUserNameAndPassword() throws IOException {
		//String username = "admin";
		//String password = "admin";
		String username = ExcelUtility.getStringData(1,0,"loginpage");
		String password = ExcelUtility.getStringData(1,1,"loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		loginpage.clickRemenber();
		loginpage.clickOnSignInButton();
		boolean homePage = loginpage.isDashboardDisplayed();
		//Assert.assertEqual(homePage);
		Assert.assertTrue(homePage);
		
		}
	
	@Test
	public void verifyUserIsAbletoLogInUsingInvalidUserNameAndPassword() throws IOException {
		//String username = "admin1333";
		//String password = "admin";
		String username = ExcelUtility.getStringData(1,0,"loginpage");
		String password = ExcelUtility.getStringData(1,1,"loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		loginpage.clickRemenber();
		loginpage.clickOnSignInButton();
		boolean alertmessage = loginpage.isAlertDisplayed();
		Assert.assertTrue(alertmessage);
		
		
	}
	@Test
	public void verifyUserIsAbletoLogInUsingvalidUserNameAndInPassword() throws IOException {
		//String username = "admin";
		//String password = "admin123456";
		String username = ExcelUtility.getStringData(1,0,"loginpage");
		String password = ExcelUtility.getStringData(1,1,"loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		loginpage.clickRemenber();
		loginpage.clickOnSignInButton();
		
		
	}
	@Test
	public void verifyUserIsAbletoLogInUsingInvalidUserNameAndInPassword() throws IOException {
		//String username = "admin1333";
		//String password = "admin12344";
		String username = ExcelUtility.getStringData(1,0,"loginpage");
		String password = ExcelUtility.getStringData(1,1,"loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterpassword(password);
		loginpage.clickRemenber();
		loginpage.clickOnSignInButton();
		
		}
	
	
	
	
	
	

}
