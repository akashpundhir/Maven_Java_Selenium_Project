package homePage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testBase.TestBase;
import uiActions.HomePage;

public class TC002__VerifyRegistration extends TestBase{

	public static final Logger log= Logger.getLogger(TC001_VerifyLoginWithInvalidCredntiala.class.getName());
			
	@BeforeClass
	public void setup(){
				
	init();			
	
	}
	@Test
	public void registerUser() throws Exception, Throwable{
				
		
		try {
			log.info("===================Starting test TC002__VerifyRegistration ================================");
//	driver.switchTo().frame(driver.findElement(By.id("PreviewFrame")));
			log.info("Focus Shifted to Iframe with id PreviewFrame");
			HomePage homepage=new HomePage(driver);
			homepage.rergisterUser();
			log.info("Scripte completed RegisterUser part and moved to next page for Roobt page for confirmation");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		@AfterClass
	public void endTest(){
		
						
			try {
				Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='MainContent']/div/p")).getText(), "To continue, let us know you're not a robot.");
				log.info(driver.findElement(By.xpath(".//*[@id='MainContent']/div/p")).getText());
				log.info("===================finished test TC002__VerifyRegistration================================");
				driver.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	
}

	
	

