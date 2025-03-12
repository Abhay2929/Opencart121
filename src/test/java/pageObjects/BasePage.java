package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage
{
	WebDriver driver;
	
	public BasePage(WebDriver driver)  //insted of creating multiple constructor we are creating separately in base class
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}