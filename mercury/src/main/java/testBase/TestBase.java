package testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static final Logger log= Logger.getLogger(TestBase.class.getName());
	public WebDriver driver;
	String BrowserName="firefox";
	String url="file:///C:/Users/006/Downloads/PageObjectWithPageFactoryFramework-master/PageObjectWithPageFactoryFramework-master/project/demoSite.htm";
			//"http://automationpractice.com/index.php";
	//file:///C:/Users/006/Downloads/PageObjectWithPageFactoryFramework-master/PageObjectWithPageFactoryFramework-master/project/demoSite.htm
	
	
	
	public void init() {
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		selectBrowser(BrowserName);
		log.info("Luanched Browser");
		getUrl(url);
		log.info("navigation to url:-   "+ url);
		
		log.info("=======This line is to check changes at the time of commit==============");
		
		log.info("I am a Init function coming from Tetsbase class and consist of selectBrowser AND getUrl Method");
		
	}
	
	
	public void selectBrowser(String BrowserName){
				
		if (BrowserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			log.info("creating a object of "+BrowserName);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			log.info("firefox is up and maximaze for use");
			}
		else if (BrowserName.equalsIgnoreCase("IE")) {
			System.setProperty("WebDriver.IE.driver",System.getProperty("User.dir")+"drivers\\iexploredriver.exe");
			
			driver=new InternetExplorerDriver();
			log.info("creating a object of "+BrowserName);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		else if (BrowserName.equalsIgnoreCase("Chrome")) {
			System.out.println(System.getProperty("User.dir"));
			//System.setProperty("webdriver.chrome.driver",System.getProperty("User.dir")+"drivers\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\006\\git\\MySeleniumProject\\mercury\\drivers\\chromedriver.exe");
			
			
			driver=new ChromeDriver();
			log.info("creating a object of "+BrowserName);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
	}
	
	public void getUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	
}
