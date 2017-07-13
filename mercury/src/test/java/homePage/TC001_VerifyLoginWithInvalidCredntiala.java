package homePage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testBase.TestBase;
import uiActions.HomePage;

public class TC001_VerifyLoginWithInvalidCredntiala extends TestBase {

	public static final Logger log= Logger.getLogger(TC001_VerifyLoginWithInvalidCredntiala.class.getName());
			
	@BeforeClass
	public void setup(){
				
	init();			
	
	}
	@Test
	public void VerifyLoginWithInvalidCredntiala() throws Exception, Throwable{
				
		
		log.info("===================Starting test TC001_VerifyLoginWithInvalidCredntiala ================================");
		HomePage homepage=new HomePage(driver);
		homepage.logintoApp();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li")).getText(), "Authentication failed.");
		
	}
		@AfterClass
	public void entTest(){
		
		driver.close();
		log.info("===================finished test TC001_VerifyLoginWithInvalidCredntiala ================================");
		
		
	}
	
	
}
