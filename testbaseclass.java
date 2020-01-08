package Com.ipivot.CarsProject.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



import Com.ipivot.CarsProject.utilities.propertyOperations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testbaseclass {
	
			
		propertyOperations propOps = new propertyOperations();
		
		//reading properties file to check which browser i need to launch
		//launching respecting browser
		//navigation
		//other setting

		WebDriver driver;
		
		public WebDriver launchAndNagivateBrowser() throws Exception {
			String browser = propOps.getPropertyValueByKey("browser");
			String url = propOps.getPropertyValueByKey("url");	
			
			if(browser == null || browser == "") {
				throw new Exception("Browser value is not set in properties file");
			}
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			} else {
				throw new Exception("Browser should be set to chrome / firefox / ie in properties file");
			}
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		}

	}



