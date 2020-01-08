package Com.ipivot.CarsProject.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class researchpage {
	@FindBy(id="by_make_st")
	WebElement bymake_btn;
	
	@FindBy(id="by_cat_st")
	WebElement bycategory_btn;
	//@FindBy(id="cat_st")
	//WebElement carsforsale_btn;
	
	
	//@FindBy(xpath="//section[@id='byMake']")
	//btn_Makelist;
	
	//@FindBy(xpath="//section[@id='byCategory']")
	//btn_Makecat;
	
	@FindBy(id="acura_st")
	WebElement select_acura;
	
	@FindBy(xpath="//*[@id=\'filter-icon-vehiclecategory-suv\']")
	WebElement select_suv;
	
	public researchpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnMakeButton() {
	bymake_btn.click();
	}
	
	public void clickOnCategoryButton() {
		bycategory_btn.click(); 
	}
	
	public void clickOnAcura() {
		select_acura.click();
		
	}
	
	
	public void clickOnCategoryList() {
		select_suv.click();
		}

}




