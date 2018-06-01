package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import constantvalues.ConstantClassValues;


public class LocatorSplitValues {
	
	public static By locatorObject(String locatorName) throws IOException{ //Name:ctl00$body$Email
		Properties prop = new Properties();
		File f =new File(ConstantClassValues.proppath);
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
		fis.close();
		String st =prop.getProperty(locatorName);//Name:ctl00$body$Email
		String locatorType = st.split(":")[0]; //Name
		String locatorValue = st.split(":")[1]; //ctl00$body$Email
		
		if (locatorType.equalsIgnoreCase("Name")) {
			return By.name(locatorValue);
		} else if (locatorType.equalsIgnoreCase("id")) {
			return By.id(locatorValue);
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			return By.xpath(locatorValue);
		} else if (locatorType.equalsIgnoreCase("cssselector")) {
			return By.cssSelector(locatorValue);
		} else if (locatorType.equalsIgnoreCase("linktext")) {
			return By.linkText(locatorValue);
		} else if (locatorType.equalsIgnoreCase("partiallinktext")) {
			return By.partialLinkText(locatorValue);
	}
		return null;
	}		
}
