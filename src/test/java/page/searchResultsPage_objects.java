package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.base;


public class searchResultsPage_objects extends base  {
	
	public searchResultsPage_objects() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public WebElement btnBookFirstRecord() {
		WebElement ele = driver.findElement(By.xpath("(//div[contains(@class,'flight-seg')]/div[contains(@class,'flightItem')]//*[text()='Book Now'])[1]"));
	    return ele;
	    //div[contains(@class,"flight-seg")]/div[contains(@class,'flightItem')][1]//*[text()='Book Now']
	}
	
	public WebElement txtReview() {
	    return driver.findElement(By.xpath("//div[contains(text(),'Review Your Booking')]"));
	}
	
}
