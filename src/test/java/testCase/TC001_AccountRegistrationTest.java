package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.AccountRegistrationPage;

public class TC001_AccountRegistrationTest  extends BaseClass
{

	@Test
	public void verify_account_Registration()
	{
		logger.info("Starting TC001");
		
		//for accessing home page attribute we need to create a object of home page
		try {
		HomePage hp=new HomePage(driver); //import the home page in thic class, and pass the driver here
		hp.clickMyAccount();
		logger.info("clicked on my account");
		hp.clickRegister(); //homepage work is done now we will open Account registration page
		logger.info("click on register");
		/*
		 * import pageObjects.HomePage;
           import pageObjects.AccountRegistrationPage;

		 */
		//Again we need to create a object for accountregistration page
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);// this also needa driver
		logger.info("providing customer details");
		
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString() + "@gmail.com"); //we need to generate emailid randomly
		regpage.setTelephone(randomNumber());
		
		String password=randomAlphanumeric();
		
		regpage.setPassword(password);
		regpage.setConfirmPAssword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		String confmsg=regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e) {
			logger.error("Test Failed");
			logger.debug("debug logs");
			Assert.fail();
		}
		logger.info("finished test case");
		
	}
	
	

}
