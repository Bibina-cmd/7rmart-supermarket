package utilities;

import java.awt.Desktop.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
//page utility is a helper class ie,all repeated methods in the pageclass can be created in the utility class, created method and call where we need eg:dropdown
//dropdown,javascript execute,	

	public void dropDounVisibleText(WebElement element, String Text) {// parameter->web element,string text
		Select select = new Select(element);// pass parameter(element)
		select.selectByVisibleText(Text);// pass parameter (text)

	}

	public void dropDounValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

	public void dropDownIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public void rightClick(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	public void dragAndDrop(WebDriver driver, WebElement element, WebElement source, WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target);

	}

	public void javaScriptExecuterScrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");

	}

	public void javaScriptClick(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].click();", element);

	}

	public void click(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.click(element).perform();

	}

	public void javajavaScriptExecuterSentKeys(WebDriver driver, WebElement element, String value) {// pending

	}

}
