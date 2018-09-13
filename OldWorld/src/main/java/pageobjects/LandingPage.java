package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By self_gen = By.partialLinkText("Self");
	
	 public LandingPage(WebDriver driver) {
		  // TODO Auto-generated constructor stub
		  this.driver=driver;
		 }

		 public WebElement getSelfGen() {
		  return driver.findElement(self_gen);
		 }
	 
}
