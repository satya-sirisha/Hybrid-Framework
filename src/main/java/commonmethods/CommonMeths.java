package commonmethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import constantvalues.ConstantClassValues;
import utilities.LocatorSplitValues;
import utilities.Logfile;
import utilities.ScreenshtClass;


public class CommonMeths {
	
	public static WebDriver driver;
	
	
	public static WebDriver Browsertype(String bname){
	try {
		if (bname.equalsIgnoreCase("chrome")) {
			System.setProperty(ConstantClassValues.chromeKey, ConstantClassValues.chromedriverPath);
			driver = new ChromeDriver();
//			driver.manage().window().maximize();	
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
		} else if (bname.equalsIgnoreCase("firefox")) {
			System.setProperty(ConstantClassValues.firefoxKey, ConstantClassValues.firefoxdriverPath);
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} else {
			System.out.println("The browser name is wrong");	
		}	

		Logfile.info("Browser name correct");


	} catch (Exception e) {
	e.printStackTrace();
		Logfile.error("Browser name incorrect");
	}
		return driver;
	}
	
	public static void openwebSite(String testData) throws IOException{
		try {
			driver.get(testData);
			Logfile.info("website is correct");
		} catch (Exception e) {
			e.printStackTrace();
			ScreenshtClass.takeEvidence((TakesScreenshot) driver, "website");
			Logfile.error("website is incorrect");
		}
	}
	
	public static void Mousehovering_Withoutclick(String ipName) throws IOException{
		try {
			WebElement mainMenu_Membership = driver.findElement(LocatorSplitValues.locatorObject(ipName));
			Actions act = new Actions(driver);
			act.moveToElement(mainMenu_Membership).build().perform();
			Logfile.info("Mouse hovering without click is working at element" +ipName);
		} catch (Exception e) {
			
			e.printStackTrace();
			ScreenshtClass.takeEvidence((TakesScreenshot) driver, ipName);
			Logfile.error("Mouse hovering without click is not working at element" +ipName);
		}
	}
	
	public static void Mousehovering_WithClick(String ipName) throws IOException{
		try {
			WebElement subMenu_Join = driver.findElement(LocatorSplitValues.locatorObject(ipName));
			Actions act = new Actions(driver);
			act.moveToElement(subMenu_Join).click().build().perform();	
			Logfile.info("Mouse hovering with click is working at element" +ipName);
		} catch (Exception e) {
			
			e.printStackTrace();
			ScreenshtClass.takeEvidence((TakesScreenshot) driver, ipName);
			Logfile.error("Mouse hovering with click is not working at element" +ipName);
		}
	}
	
	public static void FetchValue(String ipName) throws IOException{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);	
			String memberPrice = wait.until(ExpectedConditions.visibilityOf(driver.findElement(LocatorSplitValues.locatorObject(ipName)))).getText();
			System.out.println("The member price is " + memberPrice);	
			Logfile.info("Able to fetch the value" +ipName);
		} catch (Exception e) {
			
			e.printStackTrace();
			ScreenshtClass.takeEvidence((TakesScreenshot) driver, ipName);
			Logfile.error("unAble to fetch the value" +ipName);
		}
	}
	
	public static void ClickFunction(String ipName) throws IOException{
		try {
			driver.findElement(LocatorSplitValues.locatorObject(ipName)).click();	
			Logfile.info("clickfunction is working at the elemant"+ipName);
		} catch (Exception e) {
			
			e.printStackTrace();
			ScreenshtClass.takeEvidence((TakesScreenshot) driver, ipName);
			Logfile.error("clickfunction is not working at the elemant"+ipName);
		}
	}
	
	public static void TextBoxFunction(String ipName, String testData) throws IOException{
		try {
			driver.findElement(LocatorSplitValues.locatorObject(ipName)).sendKeys(testData);	
			Logfile.info("textbox function is working at element"+ipName);
		} catch (Exception e) {
			
			e.printStackTrace();
			ScreenshtClass.takeEvidence((TakesScreenshot) driver, ipName);
			Logfile.error("textbox function is not working at element"+ipName);
			}
	}
	
	public static void Select_Dropdowns(String ipName, String testData) throws IOException{
		try {
			WebElement sel = driver.findElement(LocatorSplitValues.locatorObject(ipName));
			Select sel_Dropdown = new Select(sel);
			sel_Dropdown.selectByVisibleText(testData);
			Logfile.info("able to select the element in dropdowns"+ipName);
		} catch (Exception e) {
			
			e.printStackTrace();
			ScreenshtClass.takeEvidence((TakesScreenshot) driver, ipName);
			Logfile.error("Not able to select the element in dropdowns"+ipName);
		}
	}
}
