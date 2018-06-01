package constantvalues;

import utilities.ExcelReadWrite;

public class ConstantClassValues {
	

	public static String chromeKey = "webdriver.chrome.driver";
	public static String firefoxKey = "webdriver.gecko.driver";
	public static String chromedriverPath = "C:\\Users\\choud\\Desktop\\SELENIUM\\chromedriver.exe";
	public static String firefoxdriverPath = "C:\\Users\\choud\\Desktop\\SELENIUM\\geckodriver\\geckodriver.exe";
	public static final String excelPath = "D:\\SIRISHA\\30-10-17\\Hybridframework\\Hybrid.xlsx";
	public static String Screenshtpath = "D:\\SIRISHA\\30-10-17\\Hybridframework\\Evidences\\";
	public static String proppath = "D:\\SIRISHA\\30-10-17\\Hybridframework\\locatorvalues.properties";
//	public static final String browsertype = ExcelReadWrite.readValues_Excel("TestData", 1, DriverClass.i);
//	public static final String website = ExcelReadWrite.readValues_Excel("TestData", 2, DriverClass.i);
//	public static final String userName = ExcelReadWrite.readValues_Excel("TestData", 9, DriverClass.i);
//	public static final String email = ExcelReadWrite.readValues_Excel("TestData", 10, DriverClass.i);
//	public static final String password = ExcelReadWrite.readValues_Excel("TestData", 11, DriverClass.i);
//	public static final String confirmPassword = ExcelReadWrite.readValues_Excel("TestData", 12, DriverClass.i);
//	public static final String firstName = ExcelReadWrite.readValues_Excel("TestData", 13, DriverClass.i);
//	public static final String lastName = ExcelReadWrite.readValues_Excel("TestData", 14, DriverClass.i);
//	public static final String company = ExcelReadWrite.readValues_Excel("TestData", 15, DriverClass.i);
//	public static final String street = ExcelReadWrite.readValues_Excel("TestData", 16, DriverClass.i);
//	public static final String country = ExcelReadWrite.readValues_Excel("TestData", 17, DriverClass.i);
//	public static final String state = ExcelReadWrite.readValues_Excel("TestData", 18, DriverClass.i);
//	public static final String city = ExcelReadWrite.readValues_Excel("TestData", 19, DriverClass.i);
//	public static final String zipCode = ExcelReadWrite.readValues_Excel("TestData", 20, DriverClass.i);
//	public static final String phone = ExcelReadWrite.readValues_Excel("TestData", 21, DriverClass.i);

	public static int runMode = 2;
	public static int result = 3;
	public static String testCasesSheetName = "TestCases";
	public static String testdataSheetName = "TestData";
	
	public static final String browsertype(){
		return ExcelReadWrite.readValues_Excel("TestData", 1, driverscript.DriverClass.i);
	}
	
	public static final String website(){
		return ExcelReadWrite.readValues_Excel("TestData", 2, driverscript.DriverClass.i);
	}
	
	public static final String userName(){
		return ExcelReadWrite.readValues_Excel("TestData", 9, driverscript.DriverClass.i);
	}
	
	public static final String email() {
		return ExcelReadWrite.readValues_Excel("TestData", 10, driverscript.DriverClass.i);
	}
	
	public static final String password(){
		return ExcelReadWrite.readValues_Excel("TestData", 11, driverscript.DriverClass.i);
	}
	
	public static final String confirmPassword(){
		return ExcelReadWrite.readValues_Excel("TestData", 12, driverscript.DriverClass.i);
	}
	
	public static final String firstName() {
		return ExcelReadWrite.readValues_Excel("TestData", 13, driverscript.DriverClass.i);
	}
	
	public static final String lastName(){
		return ExcelReadWrite.readValues_Excel("TestData", 14,driverscript.DriverClass.i);
	}
	
	public static final String company(){
		return ExcelReadWrite.readValues_Excel("TestData", 15, driverscript.DriverClass.i);
	}
	
	public static final String street(){
		return ExcelReadWrite.readValues_Excel("TestData", 16,driverscript.DriverClass.i);
	}
	
	public static final String country(){
		return ExcelReadWrite.readValues_Excel("TestData", 17, driverscript.DriverClass.i);
	}
	
	public static final String state(){
		return ExcelReadWrite.readValues_Excel("TestData", 18,driverscript.DriverClass.i);
	}
	
	public static final String city(){
		return ExcelReadWrite.readValues_Excel("TestData", 19, driverscript.DriverClass.i);
	}
	
	public static final String zipCode(){
		return ExcelReadWrite.readValues_Excel("TestData", 20, driverscript.DriverClass.i);
	}
	
	public static final String phone(){
		return ExcelReadWrite.readValues_Excel("TestData", 21, driverscript.DriverClass.i);
	}
}
