package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log = LogManager.getLogger(Base.class.getName());
		
			public Properties Prop() throws IOException
			{
			prop=new Properties();     // responsible to pull values from data.properties file
			FileInputStream fis=new FileInputStream("F:\\Automation-Selenium\\TechUs\\src\\main\\java\\resources\\Data.properties");
			prop.load(fis);  //load (data.properties) file into properties object
			return prop;		
			}
		
			public  WebDriver initializeDriver() throws IOException
			{
				
				prop=Prop();  //load (data.properties) file into properties object
				String browserName=prop.getProperty("Browser");
				if(browserName.equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
					driver=new ChromeDriver();
					driver.manage().window().maximize();
				}
				else if(browserName.equals("firefox"))
				{
					System.setProperty("webdriver.gecko.driver", "F://Web Drivers/geckodriver.exe");
					 driver=new FirefoxDriver();
					 driver.manage().window().maximize();
				}
				else if(browserName.equals("IE"))
				{
					System.setProperty("webdriver.ie.driver", "F://Web Drivers/MicrosoftWebDriver.exe");
				    driver=new InternetExplorerDriver();
				    driver.manage().window().maximize();
				}
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				return driver;
			}
			
			public void menus(WebElement link,WebElement item,String text) throws IOException, InterruptedException
			{
				Actions action=new Actions(driver);
				action.moveToElement(link).build().perform();
				item.click();
				Thread.sleep(2000);
				String page_Title=driver.getTitle();
				Assert.assertEquals(page_Title, text);
				System.out.println("verified "+page_Title);
				log.info("Successfully verified Home Page title");
			}

			public void menu(WebElement link,String text) throws InterruptedException
			{
				link.click();
				Thread.sleep(2000);
				String page_Title=driver.getTitle();
				Assert.assertEquals(page_Title, text);
				System.out.println("verified "+page_Title);
				log.info("Successfully verified Home Page title");
			}
			
			
			public void initializedriver() throws IOException
			{
				driver = initializeDriver();
				log.info("Initialized browser");
				driver.get(prop.getProperty("Url"));
				log.info("Launched Website");
			}
			
		
			public void teardown()
			{
				driver.close();
			}


}


