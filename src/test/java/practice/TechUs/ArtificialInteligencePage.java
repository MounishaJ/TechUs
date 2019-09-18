package practice.TechUs;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Home_Page;

import resources.Base;

@Listeners({practiceListeners.MethodInterceptor.class})
public class ArtificialInteligencePage extends Base {

	 public static Logger log = LogManager.getLogger(ArtificialInteligencePage.class.getName());

	@Test(groups="sanity")
	public void pageTitleVerify() throws IOException, InterruptedException {
		Home_Page page=new Home_Page(driver);
		menus(page.serviceMenu(),page.menuItem1(),"Hire Tech.us For Your Artificial Intelligence & ML - Tech.us");	
		
		
}
	
}
