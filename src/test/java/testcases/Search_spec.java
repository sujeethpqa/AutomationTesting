package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.base;
import page.homepage_objects;

public class Search_spec extends base{
	//WebDriver driver;
	homepage_objects objHomePage;
	
	public Search_spec() {super();}
	
	@BeforeTest
	public void initialize() throws IOException {
		//driver = launchApplication(driver);
		launchApplication();
		objHomePage = new homepage_objects();
	}

	@Test
	public void searchcase() {
		objHomePage.btnTripType("Round Trip").click();
		objHomePage.btnSearch().click();
	}
	
	
	@AfterTest
	public void tearDown() throws Exception {
		quits();
	}
}
