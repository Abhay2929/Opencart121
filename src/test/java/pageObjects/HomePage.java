package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	
	public HomePage(WebDriver driver)
	{
		super(driver); //here we are following the concept of inheritance
		//here we are invoking parent class constructor,, we are passing the driver to the parent class constructor
	}
	@FindBy(xpath="//a[@title='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
/*	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement lnkMyaccount;*/

	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}

	public void clickRegister()
	{
		lnkRegister.click();
	}


	
	
	

}
