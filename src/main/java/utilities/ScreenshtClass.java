package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import commonmethods.CommonMeths;
import constantvalues.ConstantClassValues;
import constantvalues.LocatorValues;

public class ScreenshtClass {
	
	public static void takeEvidence(TakesScreenshot ts ,String picname) {
		try { 
		SimpleDateFormat sf = new SimpleDateFormat("dd#MM#yy  hh#mm#ss");
		Date d = new Date();
	File filedestination =new File(ConstantClassValues.Screenshtpath+picname+sf.format(d)+".jpeg" );
	
	File filesrc = ts.getScreenshotAs(OutputType.FILE);
	
	FileUtils.moveFile(filesrc, filedestination);
	}
	catch (IOException e) {
		e.printStackTrace();
		System.out.println("Screenshot is not working");
	}
		
	}
}
//public static void main(String[] args) throws IOException {
//		takeEvidence((TakesScreenshot)CommonMeths.driver, LocatorValues.individual_LocatorValue);
//		
//	
	
