package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

//import org.openqa.selenium.support.FindBy;

public class AdminUsersPage {
	@FindBy(xpath = "//i[@class='fas fa-arrow-circle-right']")
	WebElement adminusers;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newusers;
	@FindBy(xpath = "//input[@id='username']")
	WebElement newuser;
	@FindBy(xpath = "//input[@id='password']")
	WebElement newpass;
	@FindBy(xpath = "//select[@name='user_type']")
	WebElement usertype;
	@FindBy(xpath = "//button[@name=\"Create\"]")
	WebElement clicksavebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertpopup;

	public WebDriver driver;

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void adminUsers() {

		adminusers.click();

	}

	public void newUsers() {
		newusers.click();
	}

	public void newUserName(String username1) {
		newuser.sendKeys(username1);

	}

	public void newPassword(String password1) {
		newpass.sendKeys(password1);

	}

	public void newUserType() {
		// PageUtilities pageUtilities = new PageUtilities();
		// pageUtilities.dropDounValue(adminusers, "Admin");
		Select obj = new Select(usertype);
		obj.selectByValue("admin");

	}

	public void clickSaveButton() {
		clicksavebutton.click();

	}

	public boolean alertPopup() {
		return alertpopup.isEnabled();
	}

}
