package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeScreen {

	public WebDriver driver;
	 
	 By passcode=By.id("userName");
	 By firstname=By.id("logOnFirstName");
	 By login_btn=By.id("bttnLogIn"); 
	 
	 public HomeScreen(WebDriver driver) {
	  // TODO Auto-generated constructor stub
	  this.driver=driver;
	 }

	 public WebElement inputPasscode() {
	  return driver.findElement(passcode);
	 }
	 
	 public WebElement inputFirstName() {
		 return driver.findElement(firstname);
	 }
	 
	 public WebElement clickLogin() {
		 return driver.findElement(login_btn);
	 }

}
