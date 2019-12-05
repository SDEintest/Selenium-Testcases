package com.ipivot.SDET_Maven_2019;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excersice1_register {

	private static WebElement loginLink;

	public static <select> void main(String[] args) {
		//Launching chrome browser......
		//we need to launch chrome driver class ...to launch chrome browser
		//System.setProperty("webdriver.chorme.driver","C:\\Users\\btred\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//navigating the application
		driver.get("http://services.smartbear.com/samples/TestComplete14/smartstore/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/header/div[1]/div/nav/nav[4]/div/a/span")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section/div/div/div/div[2]/div[2]/div[2]/div/div/a")).click();
		//WebElement view  = driver.findElement(By.id("products-viewmode"));
		//Select selectview = new Select(view);
		//selectview.selectByVisibleText("List");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	   driver.findElement(By.id("FirstName")).sendKeys("John");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.findElement(By.id("LastName")).sendKeys("Hauge");
	   
	   WebElement order=driver.findElement(By.name("DateOfBirthDay"));
	   Select selectorder = new Select(order);
	   selectorder.selectByIndex(13);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   
	   WebElement order1=driver.findElement(By.name("DateOfBirthMonth"));
	   Select selectorder1 = new Select(order1);
	   selectorder1.selectByIndex(8);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   WebElement order2=driver.findElement(By.name("DateOfBirthYear"));
	   Select selectorder2 = new Select(order2);
	   selectorder2.selectByValue("1989");
	   
	   
	   //driver.findElement(By.xpath("//select[@name='DATEOfBirthDay']"));
	   //Select mselect=new Select(driver.findElement(By.id("selenium-suite")));
	   
	   driver.findElement(By.id("Email")).sendKeys("rsraani9@gmail.com");
	   driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("Sandya123");
	   driver.findElement(By.id("Password")).sendKeys("Test123");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.findElement(By.id("ConfirmPassword")).sendKeys("Test123");
	   driver.findElement(By.id("Company")).sendKeys("IPivot");
	   
	   driver.findElement(By.xpath("//input[@id='Newsletter']")).click();
	   	   
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section/div/div/form/div/div[2]/div/div/div/button")).click();
	   
				
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
