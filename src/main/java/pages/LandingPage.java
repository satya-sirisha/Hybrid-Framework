package pages;



import java.io.IOException;

import commonmethods.CommonMeths;



public class LandingPage {

	
	public static void mnMenu_Membership(String ipName) throws IOException{
		CommonMeths.Mousehovering_Withoutclick(ipName);
	}
	
	public static void subMenu_Join(String ipName) throws IOException{
		CommonMeths.Mousehovering_WithClick(ipName);
	}
}
