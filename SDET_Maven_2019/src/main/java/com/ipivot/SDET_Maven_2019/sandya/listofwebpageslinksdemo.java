package Com.Mavendemo1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listofwebpageslinksdemo {

	public static void main(String[] args) {
		//set up the chromedriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//To launch the google web page
	       
	       driver.get("https://www.google.com/");	       
	       
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   //to enter text in search keys
		   
		   driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("automationtalks.com");
		   driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		   
		  //Creating a list of webelements to extract all links on webpage
		  //To create an array for links
		   
		   List<WebElement>ListOfAllElements= driver.findElements(By.tagName("a"));
		   String[] linkTexts = new String[ListOfAllElements.size()];
		   System.out.println("Number of Links Present on Webpage is:" +ListOfAllElements.size());
		   
		   //To print page title of each link
		   		   
		   for(int i=0; i<ListOfAllElements.size();i++) {
			   linkTexts[i]= ListOfAllElements.get(i).getText();
			    System.out.println("Page Title of link "+i);
			    System.out.println(ListOfAllElements.get(i).getAttribute("href"));
			   
		}
		   
		  
		  
			   
		   
				   
	}

}
