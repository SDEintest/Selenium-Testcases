package Com.Mavendemo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class qdpmproject {

	public static void main(String[] args) throws InterruptedException, AWTException {
	//to set up the webdriver 
		
		WebDriverManager.chromedriver().setup();
		
	       WebDriver driver= new ChromeDriver();
	 //get method to navigate to web page
	       
	       driver.get("http://qdpm.net/demo/v9/index.php");
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
	  
           driver.findElement(By.name("login[email]")).sendKeys("administrator@localhost.com");
           driver.findElement(By.name("login[password]")).sendKeys("administrator");
           driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
           
           
           //verifydashboard title
      String expectedTitle = "qdPM | Dashboard";
      String actualTitle = driver.getTitle();
      //Assert.assertEquals(actualTitle, expectedTitle);
      if (expectedTitle.contentEquals(actualTitle)) {
    	  System.out.println("Verification Successful - The correct Title is displayed. So, log in successful");
      } else
      {
    	  System.out.println("Verification Failed - An incorrect title is displayed on the web Page.So, log in failed");
    	  
      }
      //System.out.println("Dashboard Title is :"+actualTitle);
       
      //String url = driver.getCurrentUrl();
       //System.out.println("Current Page URL is:"   +url);
       
       //To Verify all options on dashboard displayed or not
      boolean Projects = driver.findElement(By.xpath("//*[@id='yahoo-com']/div[3]/div[1]/div/div/ul/li[3]/a/span[1]")).isDisplayed();
      Assert.assertTrue(Projects, "Projects option Exists");
      boolean Tasks = driver.findElement(By.xpath("//span[text()='Tasks']")).isDisplayed();
      assertTrue(Tasks, "Tasks option Exists");
      boolean Tickets = driver.findElement(By.xpath("//span[text()='Tickets']")).isDisplayed();
      assertTrue(Tickets, "Tickets option Exists");
      boolean Discussions = driver.findElement(By.xpath("//span[text()='Discussions']")).isDisplayed();
      assertTrue(Discussions, "Discussion option Exists");
      boolean Reports = driver.findElement(By.xpath("//span[text()='Reports']")).isDisplayed();
      assertTrue(Reports, "Reports option Exists");
      boolean Users = driver.findElement(By.xpath("//span[text()='Users']")).isDisplayed();
      assertTrue(Users, "Users option Exists");
      boolean Configuration  = driver.findElement(By.xpath("//span[text()='Configuration']")).isDisplayed();
      assertTrue(Configuration, "Configuration option Exists");
      boolean Tools = driver.findElement(By.xpath("//span[text()='Tools']")).isDisplayed();
      assertTrue(Tools, "Tools option Exists");
      boolean qdPMExtended = driver.findElement(By.xpath("//span[text()='qdPM Extended']")).isDisplayed();
      assertTrue(qdPMExtended, "qdPM Extended option Exists");
      
      //to click on addtask button
      driver.findElement(By.xpath("//button[text()='Add Task']")).click();
      
      Thread.sleep(3000);
      
      
      //New Task dropdown button      
      WebElement NewTaskDD = driver.findElement(By.id("form_projects_id"));
      Select selectNewTaskDD = new Select(NewTaskDD);
      selectNewTaskDD.selectByValue("1");
      
      //To Enter given data in the fields
      WebElement TypeDDbutton = driver.findElement(By.id("tasks_tasks_type_id"));
      Select selectTypeDDbutton = new Select(TypeDDbutton);
      selectTypeDDbutton.selectByVisibleText("Defects (Hourly rate $0.00)");
      
      driver.findElement(By.xpath("//input[@id='tasks_name']")).sendKeys("Sandya");
      
      //To select status : Lost
      
      WebElement TasksStatusDD = driver.findElement(By.id("tasks_tasks_status_id"));
      Select selectTasksStatusDD = new Select(TasksStatusDD);
      selectTasksStatusDD.selectByValue("8");
      
      //To select Priority: Low
      
      WebElement PriorityDD = driver.findElement(By.id("tasks_tasks_priority_id"));
      Select selectPriorityDD = new Select(PriorityDD);
      selectPriorityDD.selectByVisibleText("Low");
      
      //To Select Label : Issue
      WebElement LabelDD = driver.findElement(By.id("tasks_tasks_label_id"));
      Select selectLabelDD = new Select(LabelDD);
      selectLabelDD .selectByValue("4");
      
      driver.findElement(By.xpath("//*[@id=\"assigned_to\"]/div[3]/table/tbody/tr/td[2]/label")).click();
      driver.findElement(By.xpath("//*[@id=\"assigned_to\"]/div[4]/table/tbody/tr/td[2]/label")).click();
      
      
      // to add text in the description
      
      //driver.findElement(By.xpath("//div[@id='cke_1_contents']")).sendKeys("Entered all the details by Manger");
      
      WebElement TasksbyDD = driver.findElement(By.id("tasks_created_by"));
      Select selectTasksbyDD = new Select(TasksbyDD);
      selectTasksbyDD .selectByValue("4");
      
      //save the given details in current window
      //driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[2]/button[1]")).click();
      
      //driver.findElement(By.xpath("//a[@href='#tab time']")).click();
       		
      
      driver.findElement(By.xpath("//*[@id='tasks']/div[1]/div/ul/li[2]/a")).click();
      
      driver.findElement(By.id("tasks_estimated_time")).sendKeys("11");
      driver.findElement(By.id("tasks_start_date")).sendKeys("2019/12/27");
      driver.findElement(By.id("tasks_due_date")).sendKeys("2019/12/31");
      
      //Select option from progress dropdown button
      
      WebElement ProgressDD = driver.findElement(By.id("tasks_progress"));
      Select selectProgressDD = new Select(ProgressDD);
      selectProgressDD.selectByVisibleText("20%");
      
      driver.findElement(By.xpath("//*[@id=\'tasks\']/div[1]/div/ul/li[3]/a")).click();
      
      
      driver.findElement(By.xpath("//a[@href='#tab_attachments']")).click();
		
		driver.findElement(By.id("uploadify_file_upload")).sendKeys("C:\\Users\\btred\\Desktop\\hi.txt");
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
      //driver.findElement(By.xpath("//*[@id=\"uploadifive-uploadify_file_upload\"]/text()")).sendKeys("C:\\Users\\btred\\Desktop\\hi.txt");
     // StringSelection str = new StringSelection("C:\\Users\\btred\\Desktop\\hi.txt");
    //  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
      
     // Robot robot=new Robot();
     // robot.keyPress(KeyEvent.VK_CONTROL);
    // robot.keyPress(KeyEvent.VK_V);
    //  robot.keyRelease(KeyEvent.VK_CONTROL);
     // robot.keyRelease(KeyEvent.VK_V);
    //  robot.keyPress(KeyEvent.VK_CONTROL);
      
      //to press enter key using robo class
      
   //   robot.keyPress(KeyEvent.VK_ENTER);
    //  robot.keyRelease(KeyEvent.VK_ENTER);
      
      
      
      
      System.out.println("File uploaded Successfully");
      
      
      
      
	
	
	}
      
     
      
      
         
     
      
      
	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}








	//Thread.sleep(2000);
	
   //   Robot robot = new Robot();
           
     // StringSelection str = new StringSelection("C:\\Users\\btred\\Desktop");
    //  
     // Tootlkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
      
      //robo.key
      
      
      
          
      
      
      
      
           
           
	
	//private static void SelectByValue(String string) {
		// TODO Auto-generated method stub
		
	

	private static void assertTrue(boolean projects, String string) {
		// TODO Auto-generated method stub
		
	}

}

