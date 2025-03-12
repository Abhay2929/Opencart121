package testCase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager; //forlogger
import org.apache.logging.log4j.core.Logger; //logger log4j
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass
{
	public WebDriver driver;
	public Logger logger;  //import org.apache.logging.log4j.core.Logger; //log4j steps
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os, String br)
	{
		logger=(Logger) LogManager.getLogger(this.getClass()); //this mwthod will get the class name 
	/*	switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver();
				
		}
		*/
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
	//	driver.get("http://localhost/opencart/upload/index.php");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	//Add this dependicies for random generation
	/*
	 * <dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.12.0</version> <!-- Use latest version -->
</dependency>
	 */
	
	public String randomString() //this method will call random String
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(3);
				//randomAlphabetic(5);
		return generatedstring;
	}
	public String randomNumber() //this method will call random String
	{
		String generatednumber=RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
	public String randomAlphanumeric() //this method will call random String
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		String generatednumber=RandomStringUtils.randomNumeric(2);

		return (generatedstring+"@"+generatednumber); //we can add special character also like this
	}




}
