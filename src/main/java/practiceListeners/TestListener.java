package practiceListeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;



public class TestListener implements ITestListener{

	 public static Logger log = LogManager.getLogger(TestListener.class.getName());
	 Base b=new Base();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("on test method " + result.getName() + " Teststart");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("on test method " + result.getName() + " TestSuccess");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("Testscript failures in "+getClass()+"."+result+"Method");
		try {
			b.takeScreenshot(result.getName());
		log.info("Succesfully taken screenshot");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("on test method " + result.getName() + " Test SKips");	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("on test method " + result.getName() + " failed within the percentage");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		log.info("on test method " + context.getName() + " onStart");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
