package pages;


import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import commonmethods.CommonMeths;


public class BecomMember {
	
	public static void fetchMemberprice(String ipName) throws Exception{
		CommonMeths.FetchValue(ipName);
	}
	
	public static void scrolling(){
	JavascriptExecutor jse = (JavascriptExecutor) CommonMeths.driver;
	jse.executeScript("scroll(0,400)");
	}
	
	public static void individualMember(String ipName) throws IOException{
		CommonMeths.ClickFunction(ipName);
	}

}
