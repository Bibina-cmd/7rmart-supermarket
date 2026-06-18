package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;


	
public class ManageFooterTextPage {
	
	
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext'and@class='small-box-footer']")WebElement managefootertext;
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement action ;
	@FindBy (xpath = "//textarea[@id='content']")WebElement address;
	@FindBy (xpath = "//input[@name='email']")WebElement email;
	@FindBy (xpath = "//input[@name='phone']")WebElement phone ;
	@FindBy (xpath = "//button[@name='Update']")WebElement update ;
	
	
		public WebDriver driver;
		public ManageFooterTextPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
	
	public void clickManageFooterText() {
		managefootertext.click();
		
	}
	public void clickAction() {
		action.click();
		
	}
	
   public void updateAddress() {
	   address.clear();
	   address.sendKeys("bru na sionna");
	   
   }
   public void updateEmail() {
	   email.clear();
	   email.sendKeys("sionna234@gmail.com");
   }
   public void updatePhone() {
	   phone.clear();
	   phone.sendKeys("1234567");
	   
   }
   public void clickUpdate() {
	  // update.click();
		PageUtility pageutilities = new PageUtility();
		// pageutilities.click(driver,update);
		pageutilities.javaScriptClick(driver, update);
   }
}
