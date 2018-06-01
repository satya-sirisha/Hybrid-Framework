package pages;



import java.io.IOException;

import commonmethods.CommonMeths;

public class AddressbookPage {
	
	public static void userName(String ipName, String testData) throws IOException{
	CommonMeths.TextBoxFunction(ipName, testData);

	}

	public static void email(String ipName, String testData) throws IOException{
		CommonMeths.TextBoxFunction(ipName, testData);
	}
	
	public static void password(String ipName, String testData) throws IOException{
		CommonMeths.TextBoxFunction(ipName, testData);
	}
	
	public static void confirmpassword(String ipName, String testData) throws IOException{
		CommonMeths.TextBoxFunction(ipName, testData);
		
	}
		
	public static void FirstName(String ipName, String testData) throws IOException{
		CommonMeths.TextBoxFunction(ipName, testData);
		
	}
	
	public static void lastName(String ipName, String testData) throws IOException{
		CommonMeths.TextBoxFunction(ipName, testData);
		
	}
	
	public static void companyName(String ipName, String testData) throws IOException{
		CommonMeths.TextBoxFunction(ipName, testData);
	}
	
	public static void streetName(String ipName, String testData) throws IOException{
		CommonMeths.TextBoxFunction(ipName, testData);
	}
	
	public static void countryName(String ipName, String testData) throws IOException{
		CommonMeths.Select_Dropdowns(ipName, testData);		
	}
	
	public static void stateName(String ipName, String testData) throws IOException{
		CommonMeths.Select_Dropdowns(ipName, testData);
	}
	
	public static void cityName(String ipName, String testData) throws IOException{
		CommonMeths.TextBoxFunction(ipName, testData);
		
	}
	
	public static void zipCode(String ipName, String testData) throws IOException{
		CommonMeths.TextBoxFunction(ipName, testData);
	}
	
	public static void phone(String ipName, String testData) throws IOException{
		CommonMeths.TextBoxFunction(ipName, testData);
		
	}
	
	

}
