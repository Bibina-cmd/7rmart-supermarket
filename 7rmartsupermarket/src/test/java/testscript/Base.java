package testscript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.ScreenShotUtilities;
import utilities.WaitUtility;

public class Base {

	public WebDriver driver;

	@BeforeMethod 
	@Parameters("browser")
	public void browserInitialization(String browser) throws Exception {
		if(browser.equalsIgnoreCase("Edge")) {
			driver= new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}
		else {
			throw new Exception("invalid Exception");
		}
	
		
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));
		driver.manage().window().maximize();
	
	}

	 @AfterMethod 
	 public void browserQuitAndClose() {
	driver.quit();
	driver.close();
	
	
	/*public void browserQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			ScreenShotUtilities scrShot = new ScreenShotUtilities(); 
			scrShot.getScreenShot(driver, iTestResult.getName());
		}

	}*/
	 }
}
