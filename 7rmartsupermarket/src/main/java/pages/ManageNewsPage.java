package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ManageNewsPage {
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement managenews;
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']") WebElement newnews;
	
	@FindBy(xpath = "//textarea[@id='news']") WebElement enterthenewsfield ;
	
	@FindBy(xpath = "//button[text()='Save']" ) WebElement savebutton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
	
	

	
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}



	//public manageNews(WebDriver driver) {
	public void manageNews() {
		
		
		managenews.click();
	}

	public void clickManageNews() {
		
			
	}
	
	public void clickNewNews(){
		
		newnews.click();
		
		
	}
	public void enterTheNewsField() {
		
		
		enterthenewsfield.sendKeys("new product launched");	
		
		
		}
	
	public void clickSaveButton() {
		
		
		savebutton.click();
		
		
	}
	
	public void alertMessage() {
		
	}
	public   boolean isAlertPopupIsDisplayed() {
		return alertmessage.isDisplayed();
	
	}
	
}

