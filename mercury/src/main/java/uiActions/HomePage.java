package uiActions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends  TestBase {
		
	
	public static final Logger log=Logger.getLogger(HomePage.class.getName());
	WebDriver driver;
	
	
	//==================================================WebElement of Pages/ Page Objects===============================================//
	
	//=======================Login Page Web Elements==================================//
	@FindBy(className="login")
	WebElement SignIn;
		
	@FindBy(id="email")
	WebElement loginEmailID;
	
	@FindBy(id="passwd")
	WebElement loginpassword;
	
	@FindBy(id="SubmitLogin")
	WebElement submitButton;
	
	@FindBy(xpath="//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationfailed;
	
	//==========================SignUp Page Web elements===============================//
	@FindBy(id="PreviewFrame")
	WebElement homePageIframe;
	
	@FindBy(id="customer_register_link")
	WebElement SignUpLink;
	
	@FindBy(id="FirstName")
	WebElement firstName;
	
	@FindBy(id="LastName")
	WebElement lastName; 
		
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="CreatePassword")
	WebElement password;
		
	@FindBy(className="btn")
	WebElement submitButtonSignUp;
		
	@FindBy(className="recaptcha-checkbox-checkmark")
	WebElement checkCaptcha;
	
	@FindBy(className="shopify-challenge__button btn")
	WebElement captchaSubmit;
//==================================================WebElement of Pages/ Page Objects===============================================//
	
	
	//Always create constructor of class
	public HomePage(WebDriver driver){
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	//Method to login to app using pageobject and properties file
	public void logintoApp() throws FileNotFoundException, Throwable{
		Properties lib=new Properties();
		lib.load(new FileInputStream("ObjectRepo\\ObjectsConfig.properties"));
		
		
		
		SignIn.click();
		log.info("User clicked on Sign In Button in homepage  "+SignIn.toString());
		loginEmailID.sendKeys(lib.getProperty("loginEmailID"));
		log.info("Logon id is "+loginEmailID.toString()+lib.getProperty("loginEmailID"));
		loginpassword.sendKeys(lib.getProperty("loginpassword"));
		submitButton.click();
						
	 }
	
	//Method to rergisterUser
	public void rergisterUser()  {
		
		Properties lib=new Properties();
		try {
			lib.load(new FileInputStream("ObjectRepo\\ObjectsConfig.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().frame(homePageIframe);
		
		SignUpLink.click();
		log.info("User Clicked SignUpLink    "+SignUpLink.toString());
		
		firstName.clear();
		firstName.sendKeys(lib.getProperty("FirstName"));
		log.info("Script entered firstName    "+firstName.toString());
		
		lastName.clear();
		lastName.sendKeys(lib.getProperty("LastName"));
		log.info("Script entered  lastName  "+lastName.toString());
		
		email.clear();
		email.sendKeys(lib.getProperty("EmailID"));
		log.info("Script entered email    "+email.toString());
		
		password.clear();
		password.sendKeys(lib.getProperty("CreatePassword"));
		log.info("Script entered password    "+password.toString());
		
		submitButtonSignUp.click();
		log.info("Script clicked submitButtonSignUp    "+submitButtonSignUp.toString());
		
		
	}
	
	
	
	
	public void captcha(){
		
		
		
	}
}

 
