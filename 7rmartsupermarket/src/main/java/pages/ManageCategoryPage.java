package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageCategoryPage {
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category'and@class='small-box-footer']")
	WebElement managecategory;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add']")
	WebElement newcategory;
	@FindBy(xpath = "//input[@name='category']")
	WebElement category;
	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement discount;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement chosenfile;
	@FindBy(xpath = "//button[@name='create']")
	WebElement savebutton;

	public WebDriver driver;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickManageCategory() {
		managecategory.click();

	}

	public void clickNewCategory() {
		newcategory.click();

	}

	public void clickCategory() {
		category.sendKeys("flowers");
	}

	public void clickDiscount() {
		discount.click();

	}

	public void clickChosenFile() {
		chosenfile
				.sendKeys("C:\\Users\\bibin\\eclipse-workspace\\7rmartsupermarket\\src\\test\\resources\\Magnolia.jpg");

	}

	public void clickSaveButton() {
		// savebutton.click();
		PageUtility pageutilities = new PageUtility();
		// pageutilities.click(driver,savebutton);
		pageutilities.javaScriptClick(driver, savebutton);

	}
}
