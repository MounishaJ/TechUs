package practiceListeners;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IExecutionListener;

public class ExecutionListener implements IExecutionListener{

	 public static Logger log = LogManager.getLogger(ExecutionListener.class.getName());
	public void onExecutionStart() {
		// TODO Auto-generated method stub
		log.info("TestNG execution started at "+ java.time.LocalDateTime.now());
	}

	public void onExecutionFinish() {
		// TODO Auto-generated method stub
		log.info("TestNG execution ended at "+java.time.LocalDateTime.now());
	}

}
