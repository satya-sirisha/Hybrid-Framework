package testCases;

import commonmethods.CommonMeths;
import constantvalues.ConstantClassValues;
import constantvalues.LocatorValues;
import pages.BecomMember;
import pages.LandingPage;
import utilities.Logfile;

public class TC001 {

	public static void tc001() throws Exception{
		Logfile.startTestcase("TC001");
		CommonMeths.Browsertype(ConstantClassValues.browsertype());
		CommonMeths.openwebSite(ConstantClassValues.website());
		
		LandingPage.mnMenu_Membership(LocatorValues.mainMenu_LocatorValue);
		LandingPage.subMenu_Join(LocatorValues.subMenu_LocatorValue);

		BecomMember.fetchMemberprice(LocatorValues.fetchMember_LocatorValue);
		BecomMember.scrolling();
		BecomMember.individualMember(LocatorValues.individual_LocatorValue);
		Logfile.endTestcase();
	}
}
