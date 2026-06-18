package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {

	public void fileUploadUsingSendKeys(WebElement element, String filepath) {
		element.sendKeys(filepath);
	}

	public void fileUploadUsingRobotClass(WebElement element, String filepath) throws AWTException {
		StringSelection str = new StringSelection(
				"C:\\Users\\bibin\\eclipse-workspace\\7rmartsupermarket\\src\\test\\resources\\Magnolia.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);// copies the filepath in to
																				// systemclipboard, same as control
																				// Clipboard
		// getDefaultToolkit().getSystemClipboard().setContents--> this three methods
		// are with in the Toolkit class, this 3 methods called to coping the filepath
		// to clipboard
		Robot ro = new Robot();// robot class use to perfome keyboard actions ie, file uplode in robot class
								// using keyboard events
		ro.delay(2500);// give upload time
		ro.keyPress(KeyEvent.VK_CONTROL); // to press control,vk->vertual key //to press key ie, to paste-->controal+v
		ro.keyPress(KeyEvent.VK_V);// to press V to paste , //vkv,vk_control->are constents in keyevents
		// key event class is used to perfome keyboard actions
		ro.keyRelease(KeyEvent.VK_CONTROL);// key release use to release
		ro.keyRelease(KeyEvent.VK_V);// release
		ro.keyPress(KeyEvent.VK_ENTER);// to upload file press enter
		ro.keyRelease(KeyEvent.VK_ENTER);
	}

}
