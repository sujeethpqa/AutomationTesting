package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import base.base;
import page.searchResultsPage_objects;
import page.homepage_objects;



public class home_spec extends base{
	//WebDriver driver;
	homepage_objects objHomePage;
	searchResultsPage_objects objSearchResultsPage;
	
	@BeforeClass
	public void initialize() throws IOException {
		launchApplication(); 
		objHomePage = new homepage_objects();
		objSearchResultsPage = new searchResultsPage_objects();
	}

	@Test
	public void ticketBooking() {
		objHomePage.btnTripType("One Way").click();
		objHomePage.btnSearch().click();		
		objHomePage.wait_for_load(objSearchResultsPage.btnBookFirstRecord());
		Assert.assertEquals(objHomePage.is_element_present(objSearchResultsPage.btnBookFirstRecord()), true);
		
	}
	
	@Test
	public void ticketBooking1() {
		objSearchResultsPage.btnBookFirstRecord().click();
		objHomePage.wait_for_load(objSearchResultsPage.txtReview());
		Assert.assertEquals(objHomePage.is_element_present(objSearchResultsPage.txtReview()), true);		
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		quits();
	}
}
