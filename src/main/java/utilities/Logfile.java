package utilities;

import org.apache.log4j.Logger;



public class Logfile {
	
	public static Logger LogF = Logger.getLogger(Logfile.class.getName());
	
	public static void startTestcase(String message) {
		
		LogF.info("--------------------------------------");
		LogF.info("--------------------------------------");
		LogF.info("-----------"+ message +"--------------");
		LogF.info("--------------------------------------");
		LogF.info("--------------------------------------");
	}
	
	
	public static void endTestcase() {
		LogF.info("--------------------------------------");
		LogF.info("--------------------------------------");
		LogF.info("--------------------------------------");
	}
	
	public static void info(String message) {
		LogF.info(message);
	}
	
	public static void error(String message) {
		LogF.error(message);
	}

	public static void warn(String message) {
		LogF.warn(message);
	}


	
}
