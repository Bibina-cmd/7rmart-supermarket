package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtilities {
	public void getScreenShot(WebDriver driver, String failedTestCase) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver; // TakesScreenshot capture the current situation of the
															// browser
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);// this take the screenshot
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());// add date and time to
																							// screenshot name
		File f1 = new File(System.getProperty("user.dir") + "//OutputScreenShot"); // folder creation/output
		if (!f1.exists()) {//
			f1.mkdirs(); // creat a if it doesnot exist
		}
		String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp
				+ ".png";// decide final screenshot path
		File finalDestination = new File(destination);
		FileHandler.copy(screenShot, finalDestination); // FileHandler-class to move one location to another location
	}

}
