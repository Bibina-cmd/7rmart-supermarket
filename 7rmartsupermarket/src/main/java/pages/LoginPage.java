package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

//assertions--> using for validation, varify the application behave as expected
//2 tyes->hard assertion-> if the test fail immediately stop the exicution-> use Assert class-> method calling->classname.method name
//soft assertion --> not stop, exicution continue -> use SoftAssert class->method call-> need to creat new method to invoke th mrthods 

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath = "//Input[@name='username']")
	WebElement usernamefield;
	@FindBy(xpath = "//Input[@name='password']")
	WebElement passwordfield;
	@FindBy(xpath = "//label[@for='remember']")
	WebElement remember;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signinbutton;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//div[contains(@class,'dismissible')]")
	WebElement alert;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void enterUsername(String username) {

		usernamefield.sendKeys(username);

	}

	public void enterpassword(String password) {
		passwordfield.sendKeys(password);

	}

	public void clickRemenber() {
		remember.click();
	}

	public void clickOnSignInButton() {
		signinbutton.click();

	}

	public boolean isDashboardDisplayed() {// for validation ie, assertion
		return dashboard.isDisplayed();// is displayed->boolean value will display
	}

	public boolean isAlertDisplayed() {
		alert.isDisplayed();
		return alert.isDisplayed();

	}

	public void signIn() {
		WaitUtility waitutilities = new WaitUtility();
		// waitutilities.waitForElementToBeClickable(driver, signinbutton);
		signinbutton.click();
	}

}
