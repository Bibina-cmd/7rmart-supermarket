package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact'and@class='small-box-footer']")WebElement managecontact;
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']")WebElement action;
	@FindBy (xpath = "//input[@id=\"phone\"]")WebElement phone;
	@FindBy (xpath = "//textarea[@class='form-control'and@name='address']")WebElement address;
	@FindBy (xpath = "//textarea[@name='del_time']")WebElement deliverytime;
	@FindBy (xpath = "//button[@class='btn btn-block-sm btn-info']")WebElement update;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
	
	
	
	
	public WebDriver driver;
	public ManageContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void clickManageContact() {
		managecontact.click();
		
	}
   public void clickAction() {
	   action.click();
		
	}
   public void updatePhone() {
	   phone.clear();
	   phone.sendKeys("1234567");
		
	}
   public void updateAddress() {
	   address.clear();
	   address.sendKeys("sionna galway");
		
	}
   public void updateDeliveryTime() {
	   deliverytime.clear();
	   deliverytime.sendKeys("1.47");
		
	}
   public void clickUpdateButton() {
	   //update.click();
	   PageUtility pageutilities = new PageUtility();
		//pageutilities.click(driver,update);
		pageutilities.javaScriptClick(driver, update);
	   
		
	}
   public void checkAlertPopupIsDisplayed() {
   }

	
	

}
