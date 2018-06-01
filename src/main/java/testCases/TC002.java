package testCases;

import java.io.IOException;

import constantvalues.ConstantClassValues;
import constantvalues.LocatorValues;
import pages.AddressbookPage;
import pages.ShoppingCartPage;
import utilities.Logfile;

public class TC002 {
	
	public static void tc002() throws IOException{
		Logfile.startTestcase("TC002");
		ShoppingCartPage.createAccount(LocatorValues.createAccount_LocatorValue);
		AddressbookPage.userName(LocatorValues.userName_LocatorValue, ConstantClassValues.userName());
		AddressbookPage.email(LocatorValues.email_LocatorValue, ConstantClassValues.email());
		AddressbookPage.password(LocatorValues.password_LocatorValue, ConstantClassValues.password());
		AddressbookPage.confirmpassword(LocatorValues.confirmPassword_LocatorValue, ConstantClassValues.confirmPassword());
		AddressbookPage.FirstName(LocatorValues.firstName_LocatorValue, ConstantClassValues.firstName());
		AddressbookPage.lastName(LocatorValues.lastName_LocatorValue, ConstantClassValues.lastName());
		AddressbookPage.companyName(LocatorValues.companyName_LocatorValue, ConstantClassValues.company());
		AddressbookPage.streetName(LocatorValues.streetName_LocatorValue, ConstantClassValues.street());
		AddressbookPage.cityName(LocatorValues.cityName_LocatorValue, ConstantClassValues.city());
		AddressbookPage.countryName(LocatorValues.countryName_LocatorValue, ConstantClassValues.country());
		AddressbookPage.stateName(LocatorValues.stateName_LocatorValue, ConstantClassValues.state());
		AddressbookPage.phone(LocatorValues.phone_LocatorValue, ConstantClassValues.phone());
		AddressbookPage.zipCode(LocatorValues.zipCode_LocatorValue, ConstantClassValues.zipCode());
		Logfile.endTestcase();
	}

}
