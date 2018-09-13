package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.firefox.FirefoxDriver;*/


public class TestBase {

	public static WebDriver driver;

	public WebDriver initializeBrowser() throws IOException {
	 // TODO Auto-generated method stub
	 Properties prop = new Properties();
	 FileInputStream fis = new FileInputStream("C:\\Users\\spanda\\Documents\\Automation Workspace\\OldWorld\\src\\main\\java\\resources\\Data.properties");
	 prop.load(fis);
	 prop.getProperty("browser");
	 
	 
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\spanda\\Documents\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 
	 /*System.setProperty("webdriver.gecko.driver", "C:\\Users\\spanda\\Documents\\geckodriver.exe");
	 driver = new FirefoxDriver();*/
	
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 return driver;
	 
	}

}
