package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StartSelfGen {

	public WebDriver driver;
	 
	 By provider=By.id("ddlProvider");
	 By bda_drpdwn=By.id("ddlBDAOveride");
	 By company_name=By.id("txtCompanyName");
	 By app_type=By.id("ddlSaleType");
	 By newto_cards=By.id("ddlNewToCards");
	 By country=By.id("countrySelection");
	 By newApp_btn=By.id("bttnNewApp");
	 
	 public StartSelfGen(WebDriver driver) {
		  // TODO Auto-generated constructor stub
		  this.driver=driver;
		 }

		 public Select getProvider() {
		  return new Select(driver.findElement(provider));
		 }
		 
		 public Select getBdafield() {
			  return new Select(driver.findElement(bda_drpdwn));
			 }
		 
		 public WebElement getCompanyname() {
			 return driver.findElement(company_name);
		 }
		 
		 public Select getApptype() {
			 return new Select(driver.findElement(app_type));
		 }
		 
		 public Select getNewtocards() {
			 return new Select(driver.findElement(newto_cards));
		 }
		 
		 public Select getCountry() {
			 return new Select(driver.findElement(country));
		 }
		 
		 public WebElement clickButton() {
			 WebElement btntoClick = driver.findElement(newApp_btn);
			 return btntoClick;
		 }
}
