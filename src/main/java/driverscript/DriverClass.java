

package driverscript;


import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonmethods.CommonMeths;
import constantvalues.ConstantClassValues;
import testCases.TC001;
import testCases.TC002;
import utilities.ExcelReadWrite;
import utilities.ScreenshtClass;



public class DriverClass {

	public static int i=3;
	public static String runMOde;
	public static boolean bvalue;
	
	@BeforeMethod
	public static void preRequisite() throws IOException {
		
		ExcelReadWrite.excelPath(ConstantClassValues.excelPath);
		DOMConfigurator.configure("log4j.xml");
	
		
	}
	
	
	@Test(priority=1)
	
	public static void TC1() throws Exception {
	
//		CommonMeths.Browsertype("chrome");
//		CommonMeths.openwebSite("https://www.facebook.com/");
//		Thread.sleep(2000);
//		ScreenshtClass.takeEvidence((TakesScreenshot) CommonMeths.driver, "pic1");
		
	runMOde = ExcelReadWrite.readValues_Excel(ConstantClassValues.testCasesSheetName, 1, ConstantClassValues.runMode);
			bvalue=true;
		if (runMOde.equalsIgnoreCase("Y")) {
				TC001.tc001();
				if (bvalue=true) {
					ExcelReadWrite.writeValues_Excel(ConstantClassValues.testCasesSheetName, 1, ConstantClassValues.result,"PASS");
				}
				else {
					ExcelReadWrite.writeValues_Excel(ConstantClassValues.testCasesSheetName, 1, ConstantClassValues.result,"FAIL");
				}
			} else {
				System.out.println("Test Case TC001 Skipped");
			}
	}
		
	@Test(priority=2)
		public static void TC2()  throws Exception{
		runMOde = ExcelReadWrite.readValues_Excel(ConstantClassValues.testCasesSheetName, 2, ConstantClassValues.runMode);
			if (runMOde.equalsIgnoreCase("Y")) {
				TC002.tc002();
				if(bvalue=true) {
					ExcelReadWrite.writeValues_Excel(ConstantClassValues.testCasesSheetName, 2, ConstantClassValues.result, "PASS");
				}
				else {
					ExcelReadWrite.writeValues_Excel(ConstantClassValues.testCasesSheetName, 2, ConstantClassValues.result, "FAIL");
				}
			} else {
				System.out.println("Test Case TC002 Skipped");
			}
	   }
}

