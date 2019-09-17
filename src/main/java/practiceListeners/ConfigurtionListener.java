package practiceListeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IConfigurationListener;
import org.testng.ITestResult;

public class ConfigurtionListener implements IConfigurationListener {

	 public static Logger log = LogManager.getLogger(SuiteListener.class.getName());
	
	public void onConfigurationSuccess(ITestResult itr) {
		// TODO Auto-generated method stub
	
		log.info("we are in Configuration success: " + itr.getName() + " method");
	}

	public void onConfigurationFailure(ITestResult itr) {
		// TODO Auto-generated method stub
		log.info("we are in Configuration failure: " + itr.getName() + " method");
	}

	public void onConfigurationSkip(ITestResult itr) {
		// TODO Auto-generated method stub
		log.info("we are in Configuration skip: " + itr.getName() + " method");
	}

}
