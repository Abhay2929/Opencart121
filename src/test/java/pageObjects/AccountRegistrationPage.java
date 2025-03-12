package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastName;

	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTelephone;

	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConfirmPassword;

	@FindBy(xpath="//input[@name='agree']")
	WebElement txtAgree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys("fname");
	}
	
	public void setLastName(String Lname)
	{
		txtLastName.sendKeys("Lname");
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys("email");
	}
	public void setTelephone(String tel)
	{
		txtTelephone.sendKeys("tel");
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys("pwd");
	}
	public void setConfirmPAssword(String pwd)
	{
		txtConfirmPassword.sendKeys("pwd");
	}
	public void setPrivacyPolicy()
	{
		txtAgree.click();
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	public String getConfirmationMsg()  //this method should be the part of test case not for the POM class we are validating success message
	{
		try {
			return(msgConfirmation.getText());
		}catch (Exception e)
		{
			return(e.getMessage());
		}
	}
	


}
