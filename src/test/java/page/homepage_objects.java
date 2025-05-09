package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.base;


public class homepage_objects extends base {
	
	FindBy btnTripType1;
	
	public homepage_objects() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement btnSearch() {
	    return driver.findElement(By.xpath("//input[@value='Search Flights']"));
	}
	
	public WebElement btnTripType(String value) {
	    return driver.findElement(By.xpath("//a[@title='"+value+"']"));
	}
	
	public void wait_for_load(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
	public boolean is_element_present(WebElement ele) {
		return ele.isDisplayed();	
	}
}
