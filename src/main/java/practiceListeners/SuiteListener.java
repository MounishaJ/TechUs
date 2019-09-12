package practiceListeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener{
	 public static Logger log = LogManager.getLogger(SuiteListener.class.getName());
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		log.info("Before starting test suite: " + suite.getName() + " in onStart() method");
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		log.info("After executing the test suite: " + suite.getName() + " in onFinish() method");
	}

}
