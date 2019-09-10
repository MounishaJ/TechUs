package practice.TechUs;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Pages.Home_Page;
import resources.Base;

public class ContactPage extends Base {
	 public static Logger log = LogManager.getLogger(ArtificialInteligencePage.class.getName());
	@Test
	public void pageTitleVerify() throws Exception {
		Home_Page page=new Home_Page(driver);
		menu(page.contactMenu(),"Tell Us About Your Dream. Let's chat! - Tech.us1");
		//takeScreenshot();
		log.info("verified title");
}
@AfterMethod
public void Screenshot(ITestResult result) throws Exception
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		takeScreenshot();
	}
}
}
