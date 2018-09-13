package tests;

import resources.TestBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pageobjects.*;

public class EAPPTest extends TestBase{

	@BeforeTest
	public void launchEApp() throws IOException, InterruptedException {
		driver= initializeBrowser();
		driver.get("https://eapp.rms-secure.com:3939/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
	}
	
	@Test
	public void navigateEApp() throws InterruptedException {
		HomeScreen hs = new HomeScreen(driver);
		hs.inputPasscode().sendKeys("9980");
		hs.inputFirstName().sendKeys("Shirsha");
		Thread.sleep(1000);
		hs.clickLogin().click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		LandingPage ma = new LandingPage(driver);
		ma.getSelfGen().click();
		Thread.sleep(1000);
		
		StartSelfGen ssg = new StartSelfGen(driver);
		ssg.getProvider().selectByIndex(0);
		ssg.getBdafield().selectByIndex(0);
		ssg.getCompanyname().sendKeys("Test_ELUK-Shirsha");
		ssg.getApptype().selectByIndex(0);
		ssg.getNewtocards().selectByIndex(1);
		ssg.getCountry().selectByIndex(0);
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		//ssg.clickButton().click();
		
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+ssg.clickButton().getLocation().y+")");
		ssg.clickButton().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 300 /*timeout in seconds*/);
		if(wait.until(ExpectedConditions.alertIsPresent())==null) {
		    System.out.println("alert was not present");
		    ssg.clickButton().click();
		}
		else {
		    System.out.println("alert was present");
		    //driver.switchTo().alert().accept();
		    Actions actions = new Actions(driver);
		    actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		    ssg.clickButton().click();
		}
		
		
		
		/*if(ExpectedConditions.alertIsPresent() != null)
		{
			driver.switchTo().alert().accept();
			ssg.clickButton().click();
		}
		else 
			{
		    	driver.switchTo().alert().accept();
		    	ssg.clickButton().click();
		 	}*/
		    
		
	
	/*@AfterTest
	public void tearDown() {
		driver.close();
		driver=null;
	}*/
	
	}
}
