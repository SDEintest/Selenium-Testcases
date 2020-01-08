package Com.ipivot.CarsProject.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(id="research_st")
	WebElement btn_Research;
	@FindBy(xpath="//*[@id=\"c4s_st\"]")
	WebElement btn_CarsforSale;
	
	public Homepage(WebDriver Driver){
		PageFactory.initElements(Driver, this);
		}
public void clickOnResearchBtn() {
	btn_Research.click();
	
}
public void clickOnCarsforSale() {
	btn_CarsforSale.click();
}
}
