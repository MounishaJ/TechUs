
package practice.TechUs;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Pages.Home_Page;
import resources.Base;

//@Ignore  //ignore this  class
public class ContactPage extends Base {
	 public static Logger log = LogManager.getLogger(ArtificialInteligencePage.class.getName());

	 @Test									//(enabled=false) //skip this particular test method
	public void pageTitleVerify() throws Exception {
		Home_Page page=new Home_Page(driver);
		menu(page.contactMenu(),"Tell Us About Your Dream. Let's chat! - Tech.us1");
	System.out.println("djhfd");
	 }
}
