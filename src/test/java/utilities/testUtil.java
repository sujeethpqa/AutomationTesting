package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.base;

public class testUtil extends base{

//	public testUtil() {
//		// TODO Auto-generated constructor stub
//	}
	
	public static long IMPLICIT_WAIT = 20;

	public static void screenshotCapture() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path+"/screenshots/"+ System.currentTimeMillis()+".png"));
	}
}
