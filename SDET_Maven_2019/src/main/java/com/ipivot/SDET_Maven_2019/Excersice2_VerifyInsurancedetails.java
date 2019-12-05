package com.ipivot.SDET_Maven_2019;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excersice2_VerifyInsurancedetails {

	private static WebElement loginLink;

	public static <select, WebElements> void main(String[] args) {
		//Launching chrome browser......
		//we need to launch chrome driver class ...to launch chrome browser
		//System.setProperty("webdriver.chorme.driver","C:\\Users\\btred\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//navigating the application
		driver.get("http://demo.automationtalks.com/index.html");
		driver.manage().window().maximize();
		
		WebElement makeDD = driver.findElement(By.id("make"));
		Select selectmakeDD = new Select (makeDD);
		selectmakeDD.selectByVisibleText("Suzuki");
		
		WebElement modelorder = driver.findElement(By.id("model"));
		Select selectmodelorder = new Select(modelorder);
		selectmodelorder.selectByVisibleText("Scooter");
		

		 driver.findElement(By.id("cylindercapacity")).sendKeys("1000");
		 driver.findElement(By.id("engineperformance")).sendKeys("130");
		 driver.findElement(By.id("dateofmanufacture")).sendKeys("01/08/2001");
		 
		WebElement seatorder = driver.findElement(By.id("numberofseats"));
		Select selectseatorder = new Select(seatorder);
		selectseatorder.selectByIndex(7);
		
		driver.findElement(By.xpath("//input[@id='righthanddriveyes']/following-sibling::span")).click();
		
		WebElement seatordermotor = driver.findElement(By.id("numberofseatsmotorcycle"));
		Select selectseatordermotor = new Select(seatordermotor);
		selectseatordermotor.selectByIndex(2);
		
		WebElement fueltype= driver.findElement(By.id("fuel"));
		Select selectfueltype = new Select(fueltype);
		selectfueltype.selectByValue("Diesel");
		driver.findElement(By.id("payload")).sendKeys("545");
		driver.findElement(By.id("totalweight")).sendKeys("450");
		driver.findElement(By.id("listprice")).sendKeys("4000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("MH12DE1433");
		driver.findElement(By.id("annualmileage")).sendKeys("20000");
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		
		//Filling Insurance Data
		driver.findElement(By.id("firstname")).sendKeys("John");
		driver.findElement(By.id("lastname")).sendKeys("George");
		driver.findElement(By.id("birthdate")).sendKeys("08/22/2000");
		//driver.findElement(By.xpath("//input[@id='righthanddriveyes']/following-sibling::span")).click();
		driver.findElement(By.xpath("//input[@id='gendermale']/following-sibling::span")).click();
		
		driver.findElement(By.id("streetaddress")).sendKeys("Dahlia Circle");
		WebElement countrylist = driver.findElement(By.id("country"));
		Select selectcountrylist=new Select(countrylist);
		selectcountrylist.selectByValue("United States");
				 
		
		driver.findElement(By.id("zipcode")).sendKeys("08810");
		driver.findElement(By.id("city")).sendKeys("Dayton");
		
		
		WebElement occupationlist = driver.findElement(By.id("occupation"));
		Select selectoccupationlist = new Select(occupationlist);
		selectoccupationlist.selectByValue("Public Official");
		
		//driver.findElement(By.id("speeding")).click();
		driver.findElement(By.xpath("//input[@id='speeding']/following::span")).click();
		
		
		
	// List<WebElement> Hlist = driver.findElements(By.xpath("//label[text()='Hobbies']/following-sibling::P//span"));
	 //for (WebElement list : Hlist) {
		// if(list.getText().equals("Speeding")){
			// list.click();
		// }
	// }
	 
		//Select selectHlist = new Select((WebElement) Hlist);
		//list<webelement> Hlist = sekectHlist.getoptions();
		
		
		//selectHlist.selectByValue("Speeding");
		
	driver.findElement(By.id("website")).sendKeys("www.google.com");
	WebElement UploadImg = driver.findElement(By.id("picture"));
	UploadImg.sendKeys("C:\\Users\\btred\\Desktop");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.id("nextenterproductdata")).click();
	driver.findElement(By.id("startdate")).sendKeys("1/27/2020");
	driver.findElement(By.id("insurancesum")).sendKeys("200000");
	
	WebElement meritlist = driver.findElement(By.id("meritrating"));
	Select selectmeritlist = new Select(meritlist);
	selectmeritlist.selectByIndex(9);
	
	
	driver.findElement(By.id("insurancesum")).sendKeys("200000");
	
	WebElement inslist=driver.findElement(By.id("damageinsurance"));
	Select selectinslist = new Select(inslist);
	selectinslist.selectByIndex(3);
	
	
	driver.findElement(By.xpath("//input[@id='EuroProtection']/following-sibling::span")).click();
	driver.findElement(By.id("courtesycar")).click();
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[6]/select/option[3]")).click();
	
	
	//driver.findElement(By.xpath("//input[@id='righthanddriveyes']/following-sibling::span")).click();
	driver.findElement(By.id("nextselectpriceoption")).click();
	
	driver.findElement(By.xpath("//input[@id='selectsilver']/following-sibling::span")).click();
	driver.findElement(By.id("nextsendquote")).click();
	driver.findElement(By.id("email")).sendKeys("rsraani9@gmail.com");
	driver.findElement(By.id("phone")).sendKeys("23456788");
	driver.findElement(By.id("username")).sendKeys("john");	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("George123");
	driver.findElement(By.id("confirmpassword")).sendKeys("George123");
	driver.findElement(By.id("Comments")).sendKeys("we would like to receive the quotations ASAP");
	driver.findElement(By.id("sendemail")).click();
	
	
	
	
    
				
		
		
		
			
		
		
			
		
				
		
		
		
		
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/header/div[1]/div/nav/nav[4]/div/a/span")).click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section/div/div/div/div[2]/div[2]/div[2]/div/div/a")).click();
		//WebElement view  = driver.findElement(By.id("products-viewmode"));
		//Select selectview = new Select(view);
		//selectview.selectByVisibleText("List");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	   //driver.findElement(By.id("FirstName")).sendKeys("John");
	  // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   //driver.findElement(By.id("LastName")).sendKeys("Hauge");
	  // WebElement order=driver.findElement(By.name("DateOfBirthDay"));
	  // Select selectorder = new Select(order);
	   //selectorder.selectByIndex(13);
	  // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  // WebElement order1=driver.findElement(By.name("DateOfBirthMonth"));
	   //Select selectorder1 = new Select(order1);
	   //selectorder1.selectByIndex(8);
	   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   //WebElement order2=driver.findElement(By.name("DateOfBirthYear"));
	   //Select selectorder2 = new Select(order2);
	   //selectorder2.selectByValue("1989");
	   
	   
	   //driver.findElement(By.xpath("//select[@name='DATEOfBirthDay']"));
	   //Select mselect=new Select(driver.findElement(By.id("selenium-suite")));
	   
	   //driver.findElement(By.id("Email")).sendKeys("rsraani9@gmail.com");
	   //driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("Sandya123");
	   //driver.findElement(By.id("Password")).sendKeys("Test123");
	   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   //driver.findElement(By.id("ConfirmPassword")).sendKeys("Test123");
	   //driver.findElement(By.id("Company")).sendKeys("IPivot");
	   
	   //driver.findElement(By.xpath("//input[@id='Newsletter']")).click();
	   	   
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section/div/div/form/div/div[2]/div/div/div/button")).click();
	   
				
		//driver.close();
		
	}

	private static By By(String string) {
		// TODO Auto-generated method stub
		
		return null;
	}

	private static String xpath(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void findElement(By xpath) {
		// TODO Auto-generated method stub
		
	}
}
